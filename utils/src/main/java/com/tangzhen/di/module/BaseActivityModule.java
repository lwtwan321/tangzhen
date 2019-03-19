package com.tangzhen.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.tangzhen.di.BaseActivityContext;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

@Module
public class BaseActivityModule {

    private AppCompatActivity mActivity;

    public BaseActivityModule(AppCompatActivity mActivity) {
        this.mActivity = mActivity;
    }

    @Provides
    @BaseActivityContext
    Context provideContext(){
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity(){
        return mActivity;
    }


    @Provides
    CompositeDisposable provideCompositeDisposable(){
        return new CompositeDisposable();
    }

}
