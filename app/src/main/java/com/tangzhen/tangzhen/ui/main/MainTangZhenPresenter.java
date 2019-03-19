package com.tangzhen.tangzhen.ui.main;

import com.tangzhen.base.TangZhenPresenter;

public interface MainTangZhenPresenter<V extends MainTangZhenView> extends TangZhenPresenter<V> {

    void onDrawWeather();
}
