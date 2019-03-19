package com.tangzhen.ui.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.tangzhen.base.MyBaseActivity;
import com.tangzhen.base.TangZhenPresenter;
import com.tangzhen.tangzhen.R;
import com.tangzhen.data.network.model.XiaoMiWeather;

import javax.inject.Inject;

import butterknife.BindView;
import timber.log.Timber;


public class MainActivity extends MyBaseActivity<MainTangZhenPresenter<MainTangZhenView>> implements MainTangZhenView {

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
        getActivityComponent().inject(this);
    }

    @Override
    protected TangZhenPresenter getTangZhenPresenter() {
        return mainPresenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


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

}
