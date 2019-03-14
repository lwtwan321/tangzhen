package com.shanghai.tangzhen.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.shanghai.tangzhen.di.ActivityContext;
import com.shanghai.tangzhen.ui.main.MainPresenter;
import com.shanghai.tangzhen.ui.main.MainTangZhenPresenter;
import com.shanghai.tangzhen.ui.main.MainTangZhenView;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

@Module
public class ActivityModule {
    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity mActivity) {
        this.mActivity = mActivity;
    }

    @Provides
    @ActivityContext
    Context provideContext(){
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity(){
        return mActivity;
    }

    @Provides
    MainTangZhenPresenter<MainTangZhenView> provideMainTangZhenPresenter(MainPresenter<MainTangZhenView> mainPresenter){
        return mainPresenter;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable(){
        return new CompositeDisposable();
    }

}
