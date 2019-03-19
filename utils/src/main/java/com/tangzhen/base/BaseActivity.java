package com.tangzhen.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tangzhen.di.component.BaseActivityComponent;
import com.tangzhen.di.component.DaggerBaseActivityComponent;
import com.tangzhen.di.module.BaseActivityModule;
import com.tangzhen.utils.TangZhenApplication;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity implements TangZhenView {

    private BaseActivityComponent mBaseActivityComponent;

    private Unbinder mUnBinder;

    public abstract int getLayout();

    protected abstract void initInject();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBaseActivityComponent = DaggerBaseActivityComponent.builder()
                .baseActivityModule(new BaseActivityModule(this))
                .applicationComponent(((TangZhenApplication)getApplication()).getmApplicationComponent())
                .build();
        setContentView(getLayout());
        setUnBinder(ButterKnife.bind(this));
        initInject();
    }

    public BaseActivityComponent getmActivityComponent() {
        return mBaseActivityComponent;
    }

    public void setUnBinder(Unbinder unBinder) {
        mUnBinder = unBinder;
    }

    @Override
    protected void onDestroy() {
        if (mUnBinder != null) {
            mUnBinder.unbind();
        }
        super.onDestroy();
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void openActivityOnTokenExpire() {

    }

    @Override
    public void onError(int resId) {

    }

    @Override
    public void onError(String message) {

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showMessage(int resId) {

    }

    @Override
    public boolean isNetworkConnected() {
        return false;
    }

    @Override
    public void hideKeyboard() {

    }
}
