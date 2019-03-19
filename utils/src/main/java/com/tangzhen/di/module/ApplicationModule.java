package com.tangzhen.di.module;


import android.app.Application;
import android.content.Context;

import com.tangzhen.data.ApiHelper;
import com.tangzhen.data.AppDataManager;
import com.tangzhen.data.DataManager;
import com.tangzhen.data.db.AppDbHelper;
import com.tangzhen.data.db.DbHelper;
import com.tangzhen.data.network.AppApiHelper;
import com.tangzhen.data.prefs.AppPreferencesHelper;
import com.tangzhen.data.prefs.PreferencesHelper;
import com.tangzhen.di.ApplicationContext;
import com.tangzhen.di.DatabaseInfo;
import com.tangzhen.di.PreferenceInfo;
import com.tangzhen.utils.AppConstants;

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
