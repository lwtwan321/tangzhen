package com.tangzhen.ui.main;

import com.tangzhen.data.DataManager;
import com.tangzhen.data.network.model.XiaoMiWeather;
import com.tangzhen.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import timber.log.Timber;

public class MainPresenter<V extends MainTangZhenView> extends BasePresenter<V> implements MainTangZhenPresenter<V> {

    @Inject
    public MainPresenter(DataManager mDataManager,CompositeDisposable compositeDisposable) {
        super(mDataManager, compositeDisposable);
    }

    @Override
    public void onDrawWeather() {
        getCompositeDisposable().add(
                getmDataManager().getWeatherAPI().getWeather(33,33)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<XiaoMiWeather>() {
                    @Override
                    public void accept(XiaoMiWeather xiaoMiWeather) throws Exception {
                        Timber.d("成功获得数据:"+xiaoMiWeather.toString());
                        getmTangZhenViewView().showWeather(xiaoMiWeather);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Timber.d("网络访问得到数据错误");
                    }
                })
        );
    }

}
