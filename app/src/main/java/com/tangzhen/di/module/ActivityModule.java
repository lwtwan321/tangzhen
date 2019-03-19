package com.tangzhen.di.module;

import android.support.v7.app.AppCompatActivity;

import com.tangzhen.ui.main.MainPresenter;
import com.tangzhen.ui.main.MainTangZhenPresenter;
import com.tangzhen.ui.main.MainTangZhenView;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {

    @Provides
    MainTangZhenPresenter<MainTangZhenView> provideMainTangZhenPresenter(MainPresenter<MainTangZhenView> mainPresenter){
        return mainPresenter;
    }
    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity mActivity) {
        this.mActivity = mActivity;
    }

}
