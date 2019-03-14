package com.shanghai.tangzhen;

import android.app.Application;

import com.shanghai.tangzhen.data.DataManager;
import com.shanghai.tangzhen.di.component.ApplicationComponent;
import com.shanghai.tangzhen.di.component.DaggerApplicationComponent;
import com.shanghai.tangzhen.di.module.ApplicationModule;
import com.shanghai.tangzhen.utils.AppLogger;

import javax.inject.Inject;

public class TangZhenApplication extends Application {

    @Inject
    DataManager mDataManager;

    private ApplicationComponent mApplicationComponent;

    public static TangZhenApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;

        //初始映射组件
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        mApplicationComponent.inject(this);

        //初始日志
        AppLogger.init();
//        Timber.d(sss);

    }

    public ApplicationComponent getmApplicationComponent() {
        return mApplicationComponent;
    }

    public static TangZhenApplication getInstance() {
        return mInstance;
    }
}
