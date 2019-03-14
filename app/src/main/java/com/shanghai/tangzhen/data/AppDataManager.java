package com.shanghai.tangzhen.data;

import com.shanghai.tangzhen.data.db.DbHelper;
import com.shanghai.tangzhen.data.db.model.User;
import com.shanghai.tangzhen.data.network.ApiHelper;
import com.shanghai.tangzhen.data.network.api.WeatherService;
import com.shanghai.tangzhen.data.prefs.PreferencesHelper;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;

public class AppDataManager implements DataManager {

    private final PreferencesHelper mPreferencesHelper;
    private final DbHelper dbHelper;
    private final ApiHelper apiHelper;

    @Inject
    public AppDataManager(PreferencesHelper mPreferencesHelper, DbHelper dbHelper, ApiHelper apiHelper) {
        this.mPreferencesHelper = mPreferencesHelper;
        this.dbHelper = dbHelper;
        this.apiHelper = apiHelper;
    }


    /*******************************************************本地sharepreference操作******************************************************************/
    @Override
    public String getCurrentUserName() {
        return mPreferencesHelper.getCurrentUserName();
    }

    @Override
    public void setCurrentUserName(String userName) {
        mPreferencesHelper.setCurrentUserName(userName);
    }

    /********************************************************数据库操作*****************************************************************/
    @Override
    public Observable<Long> insertUser(User user) {
        return dbHelper.insertUser(user);
    }

    @Override
    public Observable<List<User>> getAllUsers() {
        return dbHelper.getAllUsers();
    }


    /*********************************************************网络操作****************************************************************/

    /**
     * 获取天气服务
     * @return
     */
    @Override
    public WeatherService getWeatherAPI() {
        return apiHelper.getWeatherAPI();
    }
}
