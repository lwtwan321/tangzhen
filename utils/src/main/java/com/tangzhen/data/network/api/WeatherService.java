package com.tangzhen.data.network.api;


import com.tangzhen.data.network.model.XiaoMiWeather;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {

    @GET("wtr-v3/weather/all?isLocated=true&locationKey=weathercn%3A101010100&days=15&appKey=weather20151024&sign=zUFJoAR2ZVrDy1vF3D07&romVersion=7.2.16&appVersion=87&alpha=false&isGlobal=false&device=cancro&modDevice=&locale=zh_cn")
    Observable<XiaoMiWeather> getWeather(@Query("longitude") double lng, @Query("latitude") double lat);
}
