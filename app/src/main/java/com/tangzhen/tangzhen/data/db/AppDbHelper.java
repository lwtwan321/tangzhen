package com.tangzhen.tangzhen.data.db;



import com.tangzhen.tangzhen.data.db.model.DaoMaster;
import com.tangzhen.tangzhen.data.db.model.DaoSession;
import com.tangzhen.tangzhen.data.db.model.User;

import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;

import io.reactivex.Observable;

public class AppDbHelper implements DbHelper {


    private final DaoSession mDaoSession;


    @Inject
    public AppDbHelper(DbOpenHelper openHelper) {
        mDaoSession = new DaoMaster(openHelper.getWritableDb()).newSession();
    }

    @Override
    public Observable<Long> insertUser(final User user) {
        return Observable.fromCallable(new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                return mDaoSession.getUserDao().insert(user);
            }
        });
    }

    @Override
    public Observable<List<User>> getAllUsers() {
        return Observable.fromCallable(new Callable<List<User>>() {
            @Override
            public List<User> call() throws Exception {
                return mDaoSession.getUserDao().loadAll();
            }
        });
    }
}
