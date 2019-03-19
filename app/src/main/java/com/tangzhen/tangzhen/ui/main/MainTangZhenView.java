package com.tangzhen.tangzhen.ui.main;

import com.tangzhen.tangzhen.data.network.model.XiaoMiWeather;
import com.tangzhen.tangzhen.ui.base.TangZhenView;

public interface MainTangZhenView extends TangZhenView {

    void showWeather(XiaoMiWeather xiaoMiWeather);
}
