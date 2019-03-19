package com.tangzhen.tangzhen.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.tangzhen.base.TangZhenView;
import com.tangzhen.tangzhen.di.component.ActivityComponent;
import com.tangzhen.tangzhen.di.component.DaggerActivityComponent;
import com.tangzhen.tangzhen.di.module.ActivityModule;
import com.tangzhen.utils.TangZhenApplication;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class BaseActivity extends AppCompatActivity implements TangZhenView {

//    static {
//        System.loadLibrary("native-lib");
//    }
//
//    public native String stringFromJNI();

    private ActivityComponent mActivityComponent;

    private Unbinder mUnBinder;

    public abstract int getLayout();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(((TangZhenApplication)getApplication()).getmApplicationComponent())
                .build();
        setContentView(getLayout());
        setUnBinder(ButterKnife.bind(this));
    }

    public ActivityComponent getmActivityComponent() {
        return mActivityComponent;
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
