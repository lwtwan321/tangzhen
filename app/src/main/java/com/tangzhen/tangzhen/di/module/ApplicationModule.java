package com.tangzhen.tangzhen.di.module;


import android.app.Application;
import android.content.Context;

import com.tangzhen.tangzhen.data.AppDataManager;
import com.tangzhen.tangzhen.data.DataManager;
import com.tangzhen.tangzhen.data.db.AppDbHelper;
import com.tangzhen.tangzhen.data.db.DbHelper;
import com.tangzhen.tangzhen.data.network.ApiHelper;
import com.tangzhen.tangzhen.data.network.AppApiHelper;
import com.tangzhen.tangzhen.data.prefs.AppPreferencesHelper;
import com.tangzhen.tangzhen.data.prefs.PreferencesHelper;
import com.tangzhen.tangzhen.di.ApplicationContext;
import com.tangzhen.tangzhen.di.DatabaseInfo;
import com.tangzhen.tangzhen.di.PreferenceInfo;
import com.tangzhen.tangzhen.utils.AppConstants;

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
