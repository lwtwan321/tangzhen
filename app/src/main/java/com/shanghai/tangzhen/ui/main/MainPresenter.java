package com.shanghai.tangzhen.ui.main;

import com.shanghai.tangzhen.data.DataManager;
import com.shanghai.tangzhen.data.network.model.XiaoMiWeather;
import com.shanghai.tangzhen.ui.base.BasePresenter;

import javax.inject.Inject;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import timber.log.Timber;

public class MainPresenter<V extends MainTangZhenView> extends BasePresenter<V> implements MainTangZhenPresenter<V> {

    protected CompositeDisposable compositeDisposable =null;

    @Inject
    public MainPresenter(DataManager mDataManager) {
        super(mDataManager);
    }

    @Override
    public void onDrawWeather() {
        compositeDisposable = new CompositeDisposable();
        compositeDisposable.add(
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
