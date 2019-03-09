package com.shanghai.tangzhen.data;

import com.shanghai.tangzhen.data.db.DbHelper;
import com.shanghai.tangzhen.data.prefs.PreferencesHelper;

import javax.inject.Inject;

public class AppDataManager implements DataManager {

    private final PreferencesHelper mPreferencesHelper;
    private final DbHelper dbHelper;

    @Inject
    public AppDataManager(PreferencesHelper mPreferencesHelper, DbHelper dbHelper) {
        this.mPreferencesHelper = mPreferencesHelper;
        this.dbHelper = dbHelper;
    }

    @Override
    public String getCurrentUserName() {
        return null;
    }

    @Override
    public void setCurrentUserName(String userName) {

    }
}
