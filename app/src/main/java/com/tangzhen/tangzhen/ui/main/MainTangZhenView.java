package com.tangzhen.tangzhen.ui.main;

import com.tangzhen.data.network.model.XiaoMiWeather;
import com.tangzhen.base.TangZhenView;

public interface MainTangZhenView extends TangZhenView {

    void showWeather(XiaoMiWeather xiaoMiWeather);
}
