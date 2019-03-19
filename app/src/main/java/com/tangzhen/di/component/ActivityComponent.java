package com.tangzhen.di.component;

import com.tangzhen.di.MainActivityContext;
import com.tangzhen.di.module.ActivityModule;
import com.tangzhen.ui.main.MainActivity;

import dagger.Component;

@MainActivityContext
@Component(modules = ActivityModule.class, dependencies = BaseActivityComponent.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);

}
