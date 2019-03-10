package com.shanghai.tangzhen.di.module;


import android.app.Application;
import android.content.Context;

import com.shanghai.tangzhen.data.AppDataManager;
import com.shanghai.tangzhen.data.DataManager;
import com.shanghai.tangzhen.data.db.AppDbHelper;
import com.shanghai.tangzhen.data.db.DbHelper;
import com.shanghai.tangzhen.data.network.ApiHelper;
import com.shanghai.tangzhen.data.network.AppApiHelper;
import com.shanghai.tangzhen.data.prefs.AppPreferencesHelper;
import com.shanghai.tangzhen.data.prefs.PreferencesHelper;
import com.shanghai.tangzhen.di.ApplicationContext;
import com.shanghai.tangzhen.di.DatabaseInfo;
import com.shanghai.tangzhen.di.PreferenceInfo;
import com.shanghai.tangzhen.utils.AppConstants;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return AppConstants.DB_NAME;
    }

    @Provides
    @PreferenceInfo
    String providerPreferenceName() {
        return AppConstants.PREF_NAME;
    }

    @Provides
    @Singleton
    DataManager providerDataManager(AppDataManager appDataManager) {
        return appDataManager;
    }

    @Provides
    @Singleton
    DbHelper providerDbHelper(AppDbHelper appDbHelper) {
        return appDbHelper;
    }

    @Provides
    @Singleton
    ApiHelper providerApiHelper(AppApiHelper appApiHelper) {
        return appApiHelper;
    }

    @Provides
    @Singleton
    PreferencesHelper providePreferencesHelper(AppPreferencesHelper appPreferencesHelper) {
        return appPreferencesHelper;
    }
}
