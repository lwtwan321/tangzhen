package com.shanghai.tangzhen.data.network.api;

import com.shanghai.tangzhen.data.network.model.XiaoMiWeather;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WeatherService {

    @GET("latitude={lat}&longitude={lng}&isLocated=true&locationKey=weathercn%3A101010100&days=15&appKey=weather20151024&sign=zUFJoAR2ZVrDy1vF3D07&romVersion=7.2.16&appVersion=87&alpha=false&isGlobal=false&device=cancro&modDevice=&locale=zh_cn")
    Observable<XiaoMiWeather> getWeather(@Path("lng") double lng, @Path("lat") double lat);
}
