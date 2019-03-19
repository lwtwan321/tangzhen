package com.tangzhen.tangzhen.di.component;

import com.tangzhen.tangzhen.di.PerActivity;
import com.tangzhen.tangzhen.di.module.ActivityModule;
import com.tangzhen.tangzhen.ui.main.MainActivity;

import dagger.Component;

@PerActivity
@Component(modules = ActivityModule.class,dependencies = ApplicationComponent.class)
public interface ActivityComponent {

    void inject(MainActivity activity);
}
