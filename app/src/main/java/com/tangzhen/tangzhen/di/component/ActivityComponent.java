package com.tangzhen.tangzhen.di.component;

import com.tangzhen.di.BaseActivityContext;
import com.tangzhen.di.MainActivityContext;
import com.tangzhen.di.component.BaseActivityComponent;
import com.tangzhen.tangzhen.di.module.ActivityModule;
import com.tangzhen.tangzhen.ui.main.MainActivity;

import dagger.Component;

@MainActivityContext
@Component(modules = ActivityModule.class, dependencies = BaseActivityComponent.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);

}
