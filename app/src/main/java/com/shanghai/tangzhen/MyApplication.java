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

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        mApplicationComponent.inject(this);

        AppLogger.init();
//        AppLogger.d("ddd", "SyncService stopped","dffff");
//        Timber.d(sss);

        if (mDataManager != null) {
//            preferencesHelper.setCurrentUserName("dingjiahui");
            Timber.d("have");
        }
    }
}
