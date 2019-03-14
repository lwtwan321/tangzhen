package com.shanghai.tangzhen.di.component;

import com.shanghai.tangzhen.di.PerActivity;
import com.shanghai.tangzhen.di.module.ActivityModule;
import com.shanghai.tangzhen.ui.base.BaseActivity;
import com.shanghai.tangzhen.ui.main.MainActivity;

import dagger.Component;

@PerActivity
@Component(modules = ActivityModule.class,dependencies = ApplicationComponent.class)
public interface ActivityComponent {

    void inject(MainActivity activity);
}
