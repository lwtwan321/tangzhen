package com.tangzhen.tangzhen.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;

import com.tangzhen.tangzhen.di.ApplicationContext;
import com.tangzhen.tangzhen.di.PreferenceInfo;

import javax.inject.Inject;

public class AppPreferencesHelper implements PreferencesHelper {

    private static final String PREF_KEY_CURRENT_USER_NAME = "PREF_KEY_CURRENT_USER_NAME";

    private final SharedPreferences mPrefs;

    @Inject
    public AppPreferencesHelper(@ApplicationContext Context context,
                                @PreferenceInfo String mPrefsName) {
        mPrefs = context.getSharedPreferences(mPrefsName, Context.MODE_PRIVATE);
    }

    @Override
    public String getCurrentUserName() {
        return mPrefs.getString(PREF_KEY_CURRENT_USER_NAME, null);
    }

    @Override
    public void setCurrentUserName(String userName) {
        mPrefs.edit().putString(PREF_KEY_CURRENT_USER_NAME, userName).apply();
    }
}
