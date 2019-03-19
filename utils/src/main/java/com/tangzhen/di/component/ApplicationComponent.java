package com.tangzhen.di.component;

import android.app.Application;
import android.content.Context;

import com.tangzhen.data.DataManager;
import com.tangzhen.di.ApplicationContext;
import com.tangzhen.di.module.ApplicationModule;
import com.tangzhen.utils.TangZhenApplication;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(TangZhenApplication app);

    @ApplicationContext
    Context context();

    Application application();

    DataManager getDataManager();
}
