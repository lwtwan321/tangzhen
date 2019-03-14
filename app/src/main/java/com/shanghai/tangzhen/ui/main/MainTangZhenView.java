package com.shanghai.tangzhen.ui.main;

import com.shanghai.tangzhen.data.network.model.XiaoMiWeather;
import com.shanghai.tangzhen.ui.base.TangZhenView;

public interface MainTangZhenView extends TangZhenView {

    void showWeather(XiaoMiWeather xiaoMiWeather);
}
