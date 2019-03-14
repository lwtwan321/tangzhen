package com.shanghai.tangzhen.ui.main;

import android.os.Bundle;
import android.widget.TextView;

import com.shanghai.tangzhen.R;
import com.shanghai.tangzhen.data.network.model.XiaoMiWeather;
import com.shanghai.tangzhen.ui.base.BaseActivity;

import javax.inject.Inject;

import butterknife.BindView;
import timber.log.Timber;

public class MainActivity extends BaseActivity implements MainTangZhenView {

    @BindView(R.id.sample_text)
    TextView tv;

    @Inject
    MainTangZhenPresenter<MainTangZhenView> mainPresenter;

    @Override
    public int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getmActivityComponent().inject(this);
        mainPresenter.onAttach(this);
        mainPresenter.onDrawWeather();
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
