package com.tangzhen.base;

public interface TangZhenPresenter<V extends TangZhenView> {

    void onAttach(V baseView);

    void onDetach();

}