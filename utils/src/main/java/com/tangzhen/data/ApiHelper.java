package com.tangzhen.data;


import com.tangzhen.data.network.api.WeatherService;

/**
 * 网络请求
 */
public interface ApiHelper {
     WeatherService getWeatherAPI();
}
