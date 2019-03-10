package com.shanghai.tangzhen.data.db;

import com.shanghai.tangzhen.data.db.model.User;

import java.util.List;

import io.reactivex.Observable;

/**
 * 数据库操作
 */
public interface DbHelper {
    Observable<Long> insertUser(final User user);

    Observable<List<User>> getAllUsers();
}
