package com.shanghai.tangzhen.ui.base;

import com.shanghai.tangzhen.data.DataManager;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class BasePresenter<V extends TangZhenView> implements TangZhenPresenter<V> {

    private final DataManager mDataManager;

    private V mTangZhenView;

   protected CompositeDisposable compositeDisposable = null;

    @Inject
    public BasePresenter(DataManager mDataManager) {
        this.mDataManager = mDataManager;
    }

    @Override
    public void onAttach(V baseView) {

        mTangZhenView = baseView;

    }

    @Override
    public void onDetach() {
        compositeDisposable.dispose();
    }

    public boolean isViewAttached() {
        return mTangZhenView != null;
    }

    public V getmTangZhenViewView() {
        return mTangZhenView;
    }


    public DataManager getmDataManager() {
        return mDataManager;
    }
}
