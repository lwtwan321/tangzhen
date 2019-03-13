package com.shanghai.tangzhen;

import android.app.Application;
import android.util.Log;

import com.shanghai.tangzhen.data.DataManager;
import com.shanghai.tangzhen.data.prefs.PreferencesHelper;
import com.shanghai.tangzhen.di.DatabaseInfo;
import com.shanghai.tangzhen.di.component.ApplicationComponent;
import com.shanghai.tangzhen.di.component.DaggerApplicationComponent;
import com.shanghai.tangzhen.di.module.ApplicationModule;
import com.shanghai.tangzhen.utils.AppLogger;

import javax.inject.Inject;

import timber.log.Timber;

public class MyApplication extends Application {

    @Inject
    DataManager mDataManager;

    private ApplicationComponent mApplicationComponent;

    public static MyApplication mInstance;

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

    public static MyApplication getInstance() {
        return mInstance;
    }
}
