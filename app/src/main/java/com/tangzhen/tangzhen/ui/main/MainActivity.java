package com.tangzhen.tangzhen.ui.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.tangzhen.di.component.DaggerBaseActivityComponent;
import com.tangzhen.di.module.BaseActivityModule;
import com.tangzhen.tangzhen.R;
import com.tangzhen.data.network.model.XiaoMiWeather;
import com.tangzhen.base.BaseActivity;
import com.tangzhen.tangzhen.di.component.ActivityComponent;
import com.tangzhen.tangzhen.di.component.DaggerActivityComponent;
import com.tangzhen.tangzhen.di.module.ActivityModule;
import com.tangzhen.utils.TangZhenApplication;

import javax.inject.Inject;

import butterknife.BindView;
import timber.log.Timber;


public class MainActivity extends BaseActivity implements MainTangZhenView {

    @BindView(R.id.sample_text)
    Button sample_text;

    @Inject
    MainTangZhenPresenter<MainTangZhenView> mainPresenter;

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initInject() {
        DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .baseActivityComponent(getmActivityComponent())
                .build().inject(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainPresenter.onAttach(this);
        mainPresenter.onDrawWeather();


        sample_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ARouter.getInstance().build("/ui/splish")
                        .withString("gggs", "dingjiahui")
                        .withInt("age", 23)
                        .navigation();
            }
        });
    }


    @Override
    public void showWeather(XiaoMiWeather xiaoMiWeather) {
        Timber.d("UI Main 拿到了数据");
    }

    @Override
    protected void onDestroy() {
        mainPresenter.onDetach();
        super.onDestroy();
    }
}
