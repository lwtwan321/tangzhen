package com.tangzhen.tangzhen.di.component;

import com.tangzhen.tangzhen.TangZhenApplication;
import com.tangzhen.tangzhen.data.DataManager;
import com.tangzhen.tangzhen.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(TangZhenApplication app);

//    @ApplicationContext
//    Context context();
//
//    Application application();

    DataManager getDataManager();
}
