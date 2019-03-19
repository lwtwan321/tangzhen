package com.tangzhen.utils;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.tangzhen.data.DataManager;
import com.tangzhen.di.component.ApplicationComponent;
import com.tangzhen.di.component.DaggerApplicationComponent;
import com.tangzhen.di.module.ApplicationModule;

import javax.inject.Inject;

public class TangZhenApplication extends Application {

    @Inject
    DataManager mDataManager;

    private ApplicationComponent mApplicationComponent;

    public static TangZhenApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;


        if (BuildConfig.DEBUG) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this); // 尽可能早，推荐在Application中初始化


        //初始映射组件
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        mApplicationComponent.inject(this);

        //初始日志
        AppLogger.init();
//        Timber.d(sss);

    }

    public ApplicationComponent getmApplicationComponent() {
        return mApplicationComponent;
    }

    public static TangZhenApplication getInstance() {
        return mInstance;
    }
}
