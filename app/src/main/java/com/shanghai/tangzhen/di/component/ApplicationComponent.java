package com.shanghai.tangzhen.di.component;

import android.app.Application;
import android.content.Context;

import com.shanghai.tangzhen.MyApplication;
import com.shanghai.tangzhen.data.DataManager;
import com.shanghai.tangzhen.di.ApplicationContext;
import com.shanghai.tangzhen.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MyApplication app);

//    @ApplicationContext
//    Context context();
//
//    Application application();

//    DataManager getDataManager();
}
