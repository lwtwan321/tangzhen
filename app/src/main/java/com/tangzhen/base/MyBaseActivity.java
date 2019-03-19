package com.tangzhen.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.tangzhen.di.component.ActivityComponent;
import com.tangzhen.di.component.DaggerActivityComponent;
import com.tangzhen.di.module.ActivityModule;

public abstract class MyBaseActivity<T extends TangZhenPresenter> extends BaseActivity {

    protected abstract TangZhenPresenter getTangZhenPresenter();

    protected ActivityComponent getActivityComponent() {
        return DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .baseActivityComponent(getmActivityComponent())
                .build();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getTangZhenPresenter().onAttach(this);
    }

    @Override
    protected void onDestroy() {
        getTangZhenPresenter().onDetach();
        super.onDestroy();
    }
}
