package com.tangzhen.ui.splash;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import timber.log.Timber;


@Route(path = "/ui/splish",name = "测试用 Activity")
public class SplishActivity extends AppCompatActivity {

    @Autowired
    public int age;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);
        Timber.d(age+"");
    }
}
