package com.shanghai.tangzhen.ui.main;

import com.shanghai.tangzhen.ui.base.TangZhenPresenter;

public interface MainTangZhenPresenter<V extends MainTangZhenView> extends TangZhenPresenter<V> {

    void onDrawWeather();
}
