package com.shanghai.tangzhen.di.component;

import com.shanghai.tangzhen.TangZhenApplication;
import com.shanghai.tangzhen.data.DataManager;
import com.shanghai.tangzhen.di.module.ApplicationModule;

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
