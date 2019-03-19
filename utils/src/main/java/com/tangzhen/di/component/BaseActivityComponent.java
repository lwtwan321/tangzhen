package com.tangzhen.di.component;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;

import com.tangzhen.data.DataManager;
import com.tangzhen.di.BaseActivityContext;
import com.tangzhen.di.module.BaseActivityModule;

import dagger.Component;
import io.reactivex.disposables.CompositeDisposable;

@BaseActivityContext
@Component(modules = BaseActivityModule.class,dependencies = ApplicationComponent.class)
public interface BaseActivityComponent {
    void inject(AppCompatActivity activity);

    Application application();

    DataManager getDataManager();

    CompositeDisposable provideCompositeDisposable();
}
