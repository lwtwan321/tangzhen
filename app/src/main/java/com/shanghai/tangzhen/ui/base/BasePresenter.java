package com.shanghai.tangzhen.ui.base;

import com.shanghai.tangzhen.data.DataManager;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class BasePresenter<V extends TangZhenView> implements TangZhenPresenter<V> {

    private final DataManager mDataManager;
    private  final CompositeDisposable compositeDisposable;

    private V mTangZhenView;

    @Inject
    public BasePresenter(DataManager mDataManager, CompositeDisposable compositeDisposable) {
        this.mDataManager = mDataManager;
        this.compositeDisposable = compositeDisposable;
    }

    @Override
    public void onAttach(V baseView) {
        mTangZhenView = baseView;
    }

    @Override
    public void onDetach() {
        compositeDisposable.dispose();
        mTangZhenView = null;
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

    public CompositeDisposable getCompositeDisposable() {
        return compositeDisposable;
    }
}
