package com.tangzhen.tangzhen.data.network.model;

import java.util.List;

public class XiaoMiWeather {


    /**
     * 小米天气预报  参数 精度 唯独
     * https://weatherapi.market.xiaomi.com/wtr-v3/weather/all?latitude=110&longitude=112&locationKey=weathercn%3A101010100&days=15&appKey=weather20151024&sign=zUFJoAR2ZVrDy1vF3D07&isGlobal=false&locale=zh_cn
     */

    /**
     * current : {"feelsLike":{"unit":"℃","value":"10"},"humidity":{"unit":"%","value":"37"},"pressure":{"unit":"mb","value":"1017.0"},"pubTime":"2019-03-09T18:48:00+08:00","temperature":{"unit":"℃","value":"10"},"uvIndex":"0","visibility":{"unit":"km","value":""},"weather":"2","wind":{"direction":{"unit":"°","value":"0"},"speed":{"unit":"km/h","value":"11.3"}}}
     * forecastDaily : {"aqi":{"brandInfo":{"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]},"pubTime":"2019-03-09T00:00:00+08:00","status":0,"value":[100,122,29,4,13,8,8,9,37,29,9,4,8,18,82]},"precipitationProbability":{"status":0,"value":["15","25","0","0","0"]},"pubTime":"2019-03-09T19:00:00+08:00","status":0,"sunRiseSet":{"status":0,"value":[{"from":"2019-03-09T06:39:00+08:00","to":"2019-03-09T18:14:00+08:00"},{"from":"2019-03-10T06:37:00+08:00","to":"2019-03-10T18:15:00+08:00"},{"from":"2019-03-11T06:35:00+08:00","to":"2019-03-11T18:16:00+08:00"},{"from":"2019-03-12T06:34:00+08:00","to":"2019-03-12T18:17:00+08:00"},{"from":"2019-03-13T06:32:00+08:00","to":"2019-03-13T18:18:00+08:00"},{"from":"2019-03-14T06:31:00+08:00","to":"2019-03-14T18:19:00+08:00"},{"from":"2019-03-15T06:29:00+08:00","to":"2019-03-15T18:20:00+08:00"},{"from":"2019-03-16T06:28:00+08:00","to":"2019-03-16T18:21:00+08:00"},{"from":"2019-03-17T06:26:00+08:00","to":"2019-03-17T18:22:00+08:00"},{"from":"2019-03-18T06:24:00+08:00","to":"2019-03-18T18:23:00+08:00"},{"from":"2019-03-19T06:23:00+08:00","to":"2019-03-19T18:24:00+08:00"},{"from":"2019-03-20T06:21:00+08:00","to":"2019-03-20T18:25:00+08:00"},{"from":"2019-03-21T06:19:00+08:00","to":"2019-03-21T18:26:00+08:00"},{"from":"2019-03-22T06:18:00+08:00","to":"2019-03-22T18:27:00+08:00"},{"from":"2019-03-23T06:16:00+08:00","to":"2019-03-23T18:28:00+08:00"}]},"temperature":{"status":0,"unit":"℃","value":[{"from":"12","to":"2"},{"from":"13","to":"2"},{"from":"16","to":"2"},{"from":"13","to":"1"},{"from":"17","to":"3"},{"from":"18","to":"3"},{"from":"18","to":"3"},{"from":"19","to":"2"},{"from":"16","to":"4"},{"from":"18","to":"3"},{"from":"13","to":"2"},{"from":"9","to":"0"},{"from":"11","to":"1"},{"from":"16","to":"4"},{"from":"19","to":"4"}]},"weather":{"status":0,"value":[{"from":"2","to":"1"},{"from":"7","to":"1"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"1"},{"from":"2","to":"0"},{"from":"1","to":"1"},{"from":"1","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"}]},"wind":{"direction":{"status":0,"unit":"°","value":[{"from":"0","to":"0"},{"from":"180","to":"360"},{"from":"315","to":"0"},{"from":"315","to":"270"},{"from":"270","to":"315"},{"from":"270","to":"315"},{"from":"315","to":"315"},{"from":"225","to":"270"},{"from":"180","to":"225"},{"from":"225","to":"0"},{"from":"180","to":"45"},{"from":"180","to":"315"},{"from":"315","to":"315"},{"from":"225","to":"315"},{"from":"270","to":"270"}]},"speed":{"status":0,"unit":"km/h","value":[{"from":"11.3","to":"11.3"},{"from":"20.0","to":"0.0"},{"from":"29.0","to":"20.0"},{"from":"29.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"29.0","to":"0.0"},{"from":"29.0","to":"0.0"},{"from":"29.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"29.0","to":"20.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"}]}}}
     * forecastHourly : {"aqi":{"brandInfo":{"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]},"pubTime":"2019-03-09T20:00:00+08:00","status":0,"value":[105,105,109,111,115,117,117,116,117,120,122,125,125,122,121,120,120,121,124,126,126,125,122]},"desc":"逐小时预报","status":0,"temperature":{"pubTime":"2019-03-09T20:00:00+08:00","status":0,"unit":"℃","value":[10,8,8,8,7,5,5,5,4,2,2,2,5,7,9,12,12,12,12,12,12,13,11]},"weather":{"pubTime":"2019-03-09T20:00:00+08:00","status":0,"value":[2,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,7,2,2,2]},"wind":{"status":0,"value":[{"datetime":"2019-03-09T20:00:00.000+08:00","direction":"6.61","speed":"6.18"},{"datetime":"2019-03-09T21:00:00.000+08:00","direction":"359.55","speed":"6.35"},{"datetime":"2019-03-09T22:00:00.000+08:00","direction":"353.73","speed":"6.43"},{"datetime":"2019-03-09T23:00:00.000+08:00","direction":"351.46","speed":"6.37"},{"datetime":"2019-03-10T00:00:00.000+08:00","direction":"349.53","speed":"6.4"},{"datetime":"2019-03-10T01:00:00.000+08:00","direction":"351.51","speed":"6.5"},{"datetime":"2019-03-10T02:00:00.000+08:00","direction":"355.97","speed":"6.39"},{"datetime":"2019-03-10T03:00:00.000+08:00","direction":"357.77","speed":"6.14"},{"datetime":"2019-03-10T04:00:00.000+08:00","direction":"358.07","speed":"5.72"},{"datetime":"2019-03-10T05:00:00.000+08:00","direction":"7.45","speed":"5.24"},{"datetime":"2019-03-10T06:00:00.000+08:00","direction":"28.75","speed":"5.15"},{"datetime":"2019-03-10T07:00:00.000+08:00","direction":"47.9","speed":"5.5"},{"datetime":"2019-03-10T08:00:00.000+08:00","direction":"67.27","speed":"6.62"},{"datetime":"2019-03-10T09:00:00.000+08:00","direction":"88.87","speed":"8.49"},{"datetime":"2019-03-10T10:00:00.000+08:00","direction":"97.35","speed":"8.4"},{"datetime":"2019-03-10T11:00:00.000+08:00","direction":"112.88","speed":"7.38"},{"datetime":"2019-03-10T12:00:00.000+08:00","direction":"144.08","speed":"7.32"},{"datetime":"2019-03-10T13:00:00.000+08:00","direction":"175.43","speed":"8.13"},{"datetime":"2019-03-10T14:00:00.000+08:00","direction":"189.4","speed":"8.78"},{"datetime":"2019-03-10T15:00:00.000+08:00","direction":"202.39","speed":"8.69"},{"datetime":"2019-03-10T16:00:00.000+08:00","direction":"203.45","speed":"7.76"},{"datetime":"2019-03-10T17:00:00.000+08:00","direction":"225.14","speed":"8.61"},{"datetime":"2019-03-10T18:00:00.000+08:00","direction":"243.47","speed":"11.23"}]}}
     * indices : {"indices":[{"type":"uvIndex","value":"2"},{"type":"humidity","value":"37"},{"type":"feelsLike","value":"10"},{"type":"pressure","value":"1017.0"},{"type":"carWash","value":"1"},{"type":"sports","value":"1"}],"pubTime":"","status":0}
     * alerts : []
     * yesterday : {"aqi":"","date":"2019-03-08T12:00:00+08:00","status":0,"sunRise":"2019-03-08T06:40:00+08:00","sunSet":"2019-03-08T18:12:00+08:00","tempMax":"14","tempMin":"3","weatherEnd":"1","weatherStart":"1","windDircEnd":"180","windDircStart":"180","windSpeedEnd":"0.0","windSpeedStart":"20.0"}
     * url : {"weathercn":"","caiyun":""}
     * brandInfo : {"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/069835733640846b1b2613a855328d2b6df404343/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""},{"brandId":"weatherbj","logo":"","names":{"en_US":"北京气象局","zh_TW":"北京气象局","zh_CN":"北京气象局"},"url":""}]}
     * preHour : [{"pubTime":"2019-03-09T19:00:00+08:00","wind":{"speed":{"unit":"km/h","value":"11.3"},"direction":{"unit":"°","value":"0"}},"humidity":{"unit":"%","value":"35"},"pressure":{"unit":"mb","value":"1017.0"},"visibility":{"unit":"km","value":""},"feelsLike":{"unit":"℃","value":"10"},"aqi":{"pubTime":"2019-03-09T18:00:00+08:00","so2":"11","pm10Desc":"PM10指的是直径小于或等于10微米的颗粒物，又称为可吸入颗粒物","o3":"44","status":0,"no2Desc":"二氧化氮是硝酸盐气溶胶的主要来源，是构成PM2.5和紫外线作用下产生臭氧的主要成分","suggest":"户外PM2.5浓度较高，出行时建议佩戴口罩","so2Desc":"人为的二氧化硫主要来源为家庭取暖，发电和机动车而燃烧含有硫磺的矿物燃料，以及对含有硫磺的矿物的冶炼","co":"1.1","o3Desc":"地面的臭氧主要由车辆和工业释放出的氧化氮等污染物以及由机动车、溶剂和工业释放的挥发性有机化合物与阳光反应而生成","no2":"73","primary":"","aqi":"117","coDesc":"暴露在一氧化碳中可能严重损害心脏和中枢神经系统，也可能令孕妇胎儿产生严重的不良影响","pm10":"117","pm25Desc":"PM2.5能够在大气中停留很长时间，并可随呼吸进入体内，积聚在气管或肺中，影响身体健康","pm25":"88","src":"中国环境监测总站","brandInfo":{"brands":[{"logo":"","names":{"zh_TW":"中國環境監測總站","en_US":"CNEMC","zh_CN":"中国环境监测总站"},"brandId":"CNEMC","url":""}]}},"uvIndex":"0","weather":"2","temperature":{"unit":"℃","value":"10"}}]
     * updateTime : 1552131760832
     * aqi : {"pubTime":"2019-03-09T19:00:00+08:00","so2":"8","pm10Desc":"PM10指的是直径小于或等于10微米的颗粒物，又称为可吸入颗粒物","o3":"74","status":0,"no2Desc":"二氧化氮有刺激性特殊臭味，但浓度低时人体不会感知到","suggest":"空气质量可以接受，可能对少数异常敏感的人群健康有较弱影响","so2Desc":"二氧化硫是一种无色气体，当空气中SO2达到一定浓度时，空气中会有刺鼻的气味","co":"0.80","o3Desc":"臭氧俗称晴空杀手，无色无味，但对人体的伤害不比PM2.5低，浓度高时建议减少夏季午后的外出活动，如果不开窗效果更佳","no2":"46","primary":"","aqi":"100","pm10":"118","coDesc":"一氧化碳是无色，无臭，无味气体，但吸入对人体有十分大的危害","src":"中国环境监测总站","pm25":"75","pm25Desc":"PM2.5易携带重金属、微生物等有害物质，对人体健康影响较大","brandInfo":{"brands":[{"logo":"","names":{"en_US":"CNEMC","zh_TW":"中國環境監測總站","zh_CN":"中国环境监测总站"},"brandId":"CNEMC","url":""}]}}
     * chs : [{"type":"FD0WD"}]
     */

    private CurrentBean current;
    private ForecastDailyBean forecastDaily;
    private ForecastHourlyBean forecastHourly;
    private IndicesBeanX indices;
    private YesterdayBean yesterday;
    private UrlBean url;
    private BrandInfoBeanXX brandInfo;
    private long updateTime;
    private AqiBeanXX aqi;
    private List<?> alerts;
    private List<PreHourBean> preHour;
    private List<ChsBean> chs;

    public CurrentBean getCurrent() {
        return current;
    }

    public void setCurrent(CurrentBean current) {
        this.current = current;
    }

    public ForecastDailyBean getForecastDaily() {
        return forecastDaily;
    }

    public void setForecastDaily(ForecastDailyBean forecastDaily) {
        this.forecastDaily = forecastDaily;
    }

    public ForecastHourlyBean getForecastHourly() {
        return forecastHourly;
    }

    public void setForecastHourly(ForecastHourlyBean forecastHourly) {
        this.forecastHourly = forecastHourly;
    }

    public IndicesBeanX getIndices() {
        return indices;
    }

    public void setIndices(IndicesBeanX indices) {
        this.indices = indices;
    }

    public YesterdayBean getYesterday() {
        return yesterday;
    }

    public void setYesterday(YesterdayBean yesterday) {
        this.yesterday = yesterday;
    }

    public UrlBean getUrl() {
        return url;
    }

    public void setUrl(UrlBean url) {
        this.url = url;
    }

    public BrandInfoBeanXX getBrandInfo() {
        return brandInfo;
    }

    public void setBrandInfo(BrandInfoBeanXX brandInfo) {
        this.brandInfo = brandInfo;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }

    public AqiBeanXX getAqi() {
        return aqi;
    }

    public void setAqi(AqiBeanXX aqi) {
        this.aqi = aqi;
    }

    public List<?> getAlerts() {
        return alerts;
    }

    public void setAlerts(List<?> alerts) {
        this.alerts = alerts;
    }

    public List<PreHourBean> getPreHour() {
        return preHour;
    }

    public void setPreHour(List<PreHourBean> preHour) {
        this.preHour = preHour;
    }

    public List<ChsBean> getChs() {
        return chs;
    }

    public void setChs(List<ChsBean> chs) {
        this.chs = chs;
    }

    public static class CurrentBean {
        /**
         * feelsLike : {"unit":"℃","value":"10"}
         * humidity : {"unit":"%","value":"37"}
         * pressure : {"unit":"mb","value":"1017.0"}
         * pubTime : 2019-03-09T18:48:00+08:00
         * temperature : {"unit":"℃","value":"10"}
         * uvIndex : 0
         * visibility : {"unit":"km","value":""}
         * weather : 2
         * wind : {"direction":{"unit":"°","value":"0"},"speed":{"unit":"km/h","value":"11.3"}}
         */

        private FeelsLikeBean feelsLike;
        private HumidityBean humidity;
        private PressureBean pressure;
        private String pubTime;
        private TemperatureBean temperature;
        private String uvIndex;
        private VisibilityBean visibility;
        private String weather;
        private WindBean wind;

        public FeelsLikeBean getFeelsLike() {
            return feelsLike;
        }

        public void setFeelsLike(FeelsLikeBean feelsLike) {
            this.feelsLike = feelsLike;
        }

        public HumidityBean getHumidity() {
            return humidity;
        }

        public void setHumidity(HumidityBean humidity) {
            this.humidity = humidity;
        }

        public PressureBean getPressure() {
            return pressure;
        }

        public void setPressure(PressureBean pressure) {
            this.pressure = pressure;
        }

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public TemperatureBean getTemperature() {
            return temperature;
        }

        public void setTemperature(TemperatureBean temperature) {
            this.temperature = temperature;
        }

        public String getUvIndex() {
            return uvIndex;
        }

        public void setUvIndex(String uvIndex) {
            this.uvIndex = uvIndex;
        }

        public VisibilityBean getVisibility() {
            return visibility;
        }

        public void setVisibility(VisibilityBean visibility) {
            this.visibility = visibility;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public WindBean getWind() {
            return wind;
        }

        public void setWind(WindBean wind) {
            this.wind = wind;
        }

        public static class FeelsLikeBean {
            /**
             * unit : ℃
             * value : 10
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class HumidityBean {
            /**
             * unit : %
             * value : 37
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class PressureBean {
            /**
             * unit : mb
             * value : 1017.0
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class TemperatureBean {
            /**
             * unit : ℃
             * value : 10
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class VisibilityBean {
            /**
             * unit : km
             * value :
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class WindBean {
            /**
             * direction : {"unit":"°","value":"0"}
             * speed : {"unit":"km/h","value":"11.3"}
             */

            private DirectionBean direction;
            private SpeedBean speed;

            public DirectionBean getDirection() {
                return direction;
            }

            public void setDirection(DirectionBean direction) {
                this.direction = direction;
            }

            public SpeedBean getSpeed() {
                return speed;
            }

            public void setSpeed(SpeedBean speed) {
                this.speed = speed;
            }

            public static class DirectionBean {
                /**
                 * unit : °
                 * value : 0
                 */

                private String unit;
                private String value;

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class SpeedBean {
                /**
                 * unit : km/h
                 * value : 11.3
                 */

                private String unit;
                private String value;

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }
    }

    public static class ForecastDailyBean {
        /**
         * aqi : {"brandInfo":{"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]},"pubTime":"2019-03-09T00:00:00+08:00","status":0,"value":[100,122,29,4,13,8,8,9,37,29,9,4,8,18,82]}
         * precipitationProbability : {"status":0,"value":["15","25","0","0","0"]}
         * pubTime : 2019-03-09T19:00:00+08:00
         * status : 0
         * sunRiseSet : {"status":0,"value":[{"from":"2019-03-09T06:39:00+08:00","to":"2019-03-09T18:14:00+08:00"},{"from":"2019-03-10T06:37:00+08:00","to":"2019-03-10T18:15:00+08:00"},{"from":"2019-03-11T06:35:00+08:00","to":"2019-03-11T18:16:00+08:00"},{"from":"2019-03-12T06:34:00+08:00","to":"2019-03-12T18:17:00+08:00"},{"from":"2019-03-13T06:32:00+08:00","to":"2019-03-13T18:18:00+08:00"},{"from":"2019-03-14T06:31:00+08:00","to":"2019-03-14T18:19:00+08:00"},{"from":"2019-03-15T06:29:00+08:00","to":"2019-03-15T18:20:00+08:00"},{"from":"2019-03-16T06:28:00+08:00","to":"2019-03-16T18:21:00+08:00"},{"from":"2019-03-17T06:26:00+08:00","to":"2019-03-17T18:22:00+08:00"},{"from":"2019-03-18T06:24:00+08:00","to":"2019-03-18T18:23:00+08:00"},{"from":"2019-03-19T06:23:00+08:00","to":"2019-03-19T18:24:00+08:00"},{"from":"2019-03-20T06:21:00+08:00","to":"2019-03-20T18:25:00+08:00"},{"from":"2019-03-21T06:19:00+08:00","to":"2019-03-21T18:26:00+08:00"},{"from":"2019-03-22T06:18:00+08:00","to":"2019-03-22T18:27:00+08:00"},{"from":"2019-03-23T06:16:00+08:00","to":"2019-03-23T18:28:00+08:00"}]}
         * temperature : {"status":0,"unit":"℃","value":[{"from":"12","to":"2"},{"from":"13","to":"2"},{"from":"16","to":"2"},{"from":"13","to":"1"},{"from":"17","to":"3"},{"from":"18","to":"3"},{"from":"18","to":"3"},{"from":"19","to":"2"},{"from":"16","to":"4"},{"from":"18","to":"3"},{"from":"13","to":"2"},{"from":"9","to":"0"},{"from":"11","to":"1"},{"from":"16","to":"4"},{"from":"19","to":"4"}]}
         * weather : {"status":0,"value":[{"from":"2","to":"1"},{"from":"7","to":"1"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"1"},{"from":"2","to":"0"},{"from":"1","to":"1"},{"from":"1","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"}]}
         * wind : {"direction":{"status":0,"unit":"°","value":[{"from":"0","to":"0"},{"from":"180","to":"360"},{"from":"315","to":"0"},{"from":"315","to":"270"},{"from":"270","to":"315"},{"from":"270","to":"315"},{"from":"315","to":"315"},{"from":"225","to":"270"},{"from":"180","to":"225"},{"from":"225","to":"0"},{"from":"180","to":"45"},{"from":"180","to":"315"},{"from":"315","to":"315"},{"from":"225","to":"315"},{"from":"270","to":"270"}]},"speed":{"status":0,"unit":"km/h","value":[{"from":"11.3","to":"11.3"},{"from":"20.0","to":"0.0"},{"from":"29.0","to":"20.0"},{"from":"29.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"29.0","to":"0.0"},{"from":"29.0","to":"0.0"},{"from":"29.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"29.0","to":"20.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"}]}}
         */

        private AqiBean aqi;
        private PrecipitationProbabilityBean precipitationProbability;
        private String pubTime;
        private int status;
        private SunRiseSetBean sunRiseSet;
        private TemperatureBeanX temperature;
        private WeatherBean weather;
        private WindBeanX wind;

        public AqiBean getAqi() {
            return aqi;
        }

        public void setAqi(AqiBean aqi) {
            this.aqi = aqi;
        }

        public PrecipitationProbabilityBean getPrecipitationProbability() {
            return precipitationProbability;
        }

        public void setPrecipitationProbability(PrecipitationProbabilityBean precipitationProbability) {
            this.precipitationProbability = precipitationProbability;
        }

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public SunRiseSetBean getSunRiseSet() {
            return sunRiseSet;
        }

        public void setSunRiseSet(SunRiseSetBean sunRiseSet) {
            this.sunRiseSet = sunRiseSet;
        }

        public TemperatureBeanX getTemperature() {
            return temperature;
        }

        public void setTemperature(TemperatureBeanX temperature) {
            this.temperature = temperature;
        }

        public WeatherBean getWeather() {
            return weather;
        }

        public void setWeather(WeatherBean weather) {
            this.weather = weather;
        }

        public WindBeanX getWind() {
            return wind;
        }

        public void setWind(WindBeanX wind) {
            this.wind = wind;
        }

        public static class AqiBean {
            /**
             * brandInfo : {"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]}
             * pubTime : 2019-03-09T00:00:00+08:00
             * status : 0
             * value : [100,122,29,4,13,8,8,9,37,29,9,4,8,18,82]
             */

            private BrandInfoBean brandInfo;
            private String pubTime;
            private int status;
            private List<Integer> value;

            public BrandInfoBean getBrandInfo() {
                return brandInfo;
            }

            public void setBrandInfo(BrandInfoBean brandInfo) {
                this.brandInfo = brandInfo;
            }

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<Integer> getValue() {
                return value;
            }

            public void setValue(List<Integer> value) {
                this.value = value;
            }

            public static class BrandInfoBean {
                private List<BrandsBean> brands;

                public List<BrandsBean> getBrands() {
                    return brands;
                }

                public void setBrands(List<BrandsBean> brands) {
                    this.brands = brands;
                }

                public static class BrandsBean {
                    /**
                     * brandId : caiyun
                     * logo : http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp
                     * names : {"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"}
                     * url :
                     */

                    private String brandId;
                    private String logo;
                    private NamesBean names;
                    private String url;

                    public String getBrandId() {
                        return brandId;
                    }

                    public void setBrandId(String brandId) {
                        this.brandId = brandId;
                    }

                    public String getLogo() {
                        return logo;
                    }

                    public void setLogo(String logo) {
                        this.logo = logo;
                    }

                    public NamesBean getNames() {
                        return names;
                    }

                    public void setNames(NamesBean names) {
                        this.names = names;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public static class NamesBean {
                        /**
                         * en_US : 彩云天气
                         * zh_TW : 彩雲天氣
                         * zh_CN : 彩云天气
                         */

                        private String en_US;
                        private String zh_TW;
                        private String zh_CN;

                        public String getEn_US() {
                            return en_US;
                        }

                        public void setEn_US(String en_US) {
                            this.en_US = en_US;
                        }

                        public String getZh_TW() {
                            return zh_TW;
                        }

                        public void setZh_TW(String zh_TW) {
                            this.zh_TW = zh_TW;
                        }

                        public String getZh_CN() {
                            return zh_CN;
                        }

                        public void setZh_CN(String zh_CN) {
                            this.zh_CN = zh_CN;
                        }
                    }
                }
            }
        }

        public static class PrecipitationProbabilityBean {
            /**
             * status : 0
             * value : ["15","25","0","0","0"]
             */

            private int status;
            private List<String> value;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<String> getValue() {
                return value;
            }

            public void setValue(List<String> value) {
                this.value = value;
            }
        }

        public static class SunRiseSetBean {
            /**
             * status : 0
             * value : [{"from":"2019-03-09T06:39:00+08:00","to":"2019-03-09T18:14:00+08:00"},{"from":"2019-03-10T06:37:00+08:00","to":"2019-03-10T18:15:00+08:00"},{"from":"2019-03-11T06:35:00+08:00","to":"2019-03-11T18:16:00+08:00"},{"from":"2019-03-12T06:34:00+08:00","to":"2019-03-12T18:17:00+08:00"},{"from":"2019-03-13T06:32:00+08:00","to":"2019-03-13T18:18:00+08:00"},{"from":"2019-03-14T06:31:00+08:00","to":"2019-03-14T18:19:00+08:00"},{"from":"2019-03-15T06:29:00+08:00","to":"2019-03-15T18:20:00+08:00"},{"from":"2019-03-16T06:28:00+08:00","to":"2019-03-16T18:21:00+08:00"},{"from":"2019-03-17T06:26:00+08:00","to":"2019-03-17T18:22:00+08:00"},{"from":"2019-03-18T06:24:00+08:00","to":"2019-03-18T18:23:00+08:00"},{"from":"2019-03-19T06:23:00+08:00","to":"2019-03-19T18:24:00+08:00"},{"from":"2019-03-20T06:21:00+08:00","to":"2019-03-20T18:25:00+08:00"},{"from":"2019-03-21T06:19:00+08:00","to":"2019-03-21T18:26:00+08:00"},{"from":"2019-03-22T06:18:00+08:00","to":"2019-03-22T18:27:00+08:00"},{"from":"2019-03-23T06:16:00+08:00","to":"2019-03-23T18:28:00+08:00"}]
             */

            private int status;
            private List<ValueBean> value;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<ValueBean> getValue() {
                return value;
            }

            public void setValue(List<ValueBean> value) {
                this.value = value;
            }

            public static class ValueBean {
                /**
                 * from : 2019-03-09T06:39:00+08:00
                 * to : 2019-03-09T18:14:00+08:00
                 */

                private String from;
                private String to;

                public String getFrom() {
                    return from;
                }

                public void setFrom(String from) {
                    this.from = from;
                }

                public String getTo() {
                    return to;
                }

                public void setTo(String to) {
                    this.to = to;
                }
            }
        }

        public static class TemperatureBeanX {
            /**
             * status : 0
             * unit : ℃
             * value : [{"from":"12","to":"2"},{"from":"13","to":"2"},{"from":"16","to":"2"},{"from":"13","to":"1"},{"from":"17","to":"3"},{"from":"18","to":"3"},{"from":"18","to":"3"},{"from":"19","to":"2"},{"from":"16","to":"4"},{"from":"18","to":"3"},{"from":"13","to":"2"},{"from":"9","to":"0"},{"from":"11","to":"1"},{"from":"16","to":"4"},{"from":"19","to":"4"}]
             */

            private int status;
            private String unit;
            private List<ValueBeanX> value;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public List<ValueBeanX> getValue() {
                return value;
            }

            public void setValue(List<ValueBeanX> value) {
                this.value = value;
            }

            public static class ValueBeanX {
                /**
                 * from : 12
                 * to : 2
                 */

                private String from;
                private String to;

                public String getFrom() {
                    return from;
                }

                public void setFrom(String from) {
                    this.from = from;
                }

                public String getTo() {
                    return to;
                }

                public void setTo(String to) {
                    this.to = to;
                }
            }
        }

        public static class WeatherBean {
            /**
             * status : 0
             * value : [{"from":"2","to":"1"},{"from":"7","to":"1"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"1"},{"from":"2","to":"0"},{"from":"1","to":"1"},{"from":"1","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"}]
             */

            private int status;
            private List<ValueBeanXX> value;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<ValueBeanXX> getValue() {
                return value;
            }

            public void setValue(List<ValueBeanXX> value) {
                this.value = value;
            }

            public static class ValueBeanXX {
                /**
                 * from : 2
                 * to : 1
                 */

                private String from;
                private String to;

                public String getFrom() {
                    return from;
                }

                public void setFrom(String from) {
                    this.from = from;
                }

                public String getTo() {
                    return to;
                }

                public void setTo(String to) {
                    this.to = to;
                }
            }
        }

        public static class WindBeanX {
            /**
             * direction : {"status":0,"unit":"°","value":[{"from":"0","to":"0"},{"from":"180","to":"360"},{"from":"315","to":"0"},{"from":"315","to":"270"},{"from":"270","to":"315"},{"from":"270","to":"315"},{"from":"315","to":"315"},{"from":"225","to":"270"},{"from":"180","to":"225"},{"from":"225","to":"0"},{"from":"180","to":"45"},{"from":"180","to":"315"},{"from":"315","to":"315"},{"from":"225","to":"315"},{"from":"270","to":"270"}]}
             * speed : {"status":0,"unit":"km/h","value":[{"from":"11.3","to":"11.3"},{"from":"20.0","to":"0.0"},{"from":"29.0","to":"20.0"},{"from":"29.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"29.0","to":"0.0"},{"from":"29.0","to":"0.0"},{"from":"29.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"29.0","to":"20.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"}]}
             */

            private DirectionBeanX direction;
            private SpeedBeanX speed;

            public DirectionBeanX getDirection() {
                return direction;
            }

            public void setDirection(DirectionBeanX direction) {
                this.direction = direction;
            }

            public SpeedBeanX getSpeed() {
                return speed;
            }

            public void setSpeed(SpeedBeanX speed) {
                this.speed = speed;
            }

            public static class DirectionBeanX {
                /**
                 * status : 0
                 * unit : °
                 * value : [{"from":"0","to":"0"},{"from":"180","to":"360"},{"from":"315","to":"0"},{"from":"315","to":"270"},{"from":"270","to":"315"},{"from":"270","to":"315"},{"from":"315","to":"315"},{"from":"225","to":"270"},{"from":"180","to":"225"},{"from":"225","to":"0"},{"from":"180","to":"45"},{"from":"180","to":"315"},{"from":"315","to":"315"},{"from":"225","to":"315"},{"from":"270","to":"270"}]
                 */

                private int status;
                private String unit;
                private List<ValueBeanXXX> value;

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public List<ValueBeanXXX> getValue() {
                    return value;
                }

                public void setValue(List<ValueBeanXXX> value) {
                    this.value = value;
                }

                public static class ValueBeanXXX {
                    /**
                     * from : 0
                     * to : 0
                     */

                    private String from;
                    private String to;

                    public String getFrom() {
                        return from;
                    }

                    public void setFrom(String from) {
                        this.from = from;
                    }

                    public String getTo() {
                        return to;
                    }

                    public void setTo(String to) {
                        this.to = to;
                    }
                }
            }

            public static class SpeedBeanX {
                /**
                 * status : 0
                 * unit : km/h
                 * value : [{"from":"11.3","to":"11.3"},{"from":"20.0","to":"0.0"},{"from":"29.0","to":"20.0"},{"from":"29.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"29.0","to":"0.0"},{"from":"29.0","to":"0.0"},{"from":"29.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"29.0","to":"20.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"}]
                 */

                private int status;
                private String unit;
                private List<ValueBeanXXXX> value;

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public List<ValueBeanXXXX> getValue() {
                    return value;
                }

                public void setValue(List<ValueBeanXXXX> value) {
                    this.value = value;
                }

                public static class ValueBeanXXXX {
                    /**
                     * from : 11.3
                     * to : 11.3
                     */

                    private String from;
                    private String to;

                    public String getFrom() {
                        return from;
                    }

                    public void setFrom(String from) {
                        this.from = from;
                    }

                    public String getTo() {
                        return to;
                    }

                    public void setTo(String to) {
                        this.to = to;
                    }
                }
            }
        }
    }

    public static class ForecastHourlyBean {
        /**
         * aqi : {"brandInfo":{"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]},"pubTime":"2019-03-09T20:00:00+08:00","status":0,"value":[105,105,109,111,115,117,117,116,117,120,122,125,125,122,121,120,120,121,124,126,126,125,122]}
         * desc : 逐小时预报
         * status : 0
         * temperature : {"pubTime":"2019-03-09T20:00:00+08:00","status":0,"unit":"℃","value":[10,8,8,8,7,5,5,5,4,2,2,2,5,7,9,12,12,12,12,12,12,13,11]}
         * weather : {"pubTime":"2019-03-09T20:00:00+08:00","status":0,"value":[2,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,7,2,2,2]}
         * wind : {"status":0,"value":[{"datetime":"2019-03-09T20:00:00.000+08:00","direction":"6.61","speed":"6.18"},{"datetime":"2019-03-09T21:00:00.000+08:00","direction":"359.55","speed":"6.35"},{"datetime":"2019-03-09T22:00:00.000+08:00","direction":"353.73","speed":"6.43"},{"datetime":"2019-03-09T23:00:00.000+08:00","direction":"351.46","speed":"6.37"},{"datetime":"2019-03-10T00:00:00.000+08:00","direction":"349.53","speed":"6.4"},{"datetime":"2019-03-10T01:00:00.000+08:00","direction":"351.51","speed":"6.5"},{"datetime":"2019-03-10T02:00:00.000+08:00","direction":"355.97","speed":"6.39"},{"datetime":"2019-03-10T03:00:00.000+08:00","direction":"357.77","speed":"6.14"},{"datetime":"2019-03-10T04:00:00.000+08:00","direction":"358.07","speed":"5.72"},{"datetime":"2019-03-10T05:00:00.000+08:00","direction":"7.45","speed":"5.24"},{"datetime":"2019-03-10T06:00:00.000+08:00","direction":"28.75","speed":"5.15"},{"datetime":"2019-03-10T07:00:00.000+08:00","direction":"47.9","speed":"5.5"},{"datetime":"2019-03-10T08:00:00.000+08:00","direction":"67.27","speed":"6.62"},{"datetime":"2019-03-10T09:00:00.000+08:00","direction":"88.87","speed":"8.49"},{"datetime":"2019-03-10T10:00:00.000+08:00","direction":"97.35","speed":"8.4"},{"datetime":"2019-03-10T11:00:00.000+08:00","direction":"112.88","speed":"7.38"},{"datetime":"2019-03-10T12:00:00.000+08:00","direction":"144.08","speed":"7.32"},{"datetime":"2019-03-10T13:00:00.000+08:00","direction":"175.43","speed":"8.13"},{"datetime":"2019-03-10T14:00:00.000+08:00","direction":"189.4","speed":"8.78"},{"datetime":"2019-03-10T15:00:00.000+08:00","direction":"202.39","speed":"8.69"},{"datetime":"2019-03-10T16:00:00.000+08:00","direction":"203.45","speed":"7.76"},{"datetime":"2019-03-10T17:00:00.000+08:00","direction":"225.14","speed":"8.61"},{"datetime":"2019-03-10T18:00:00.000+08:00","direction":"243.47","speed":"11.23"}]}
         */

        private AqiBeanX aqi;
        private String desc;
        private int status;
        private TemperatureBeanXX temperature;
        private WeatherBeanX weather;
        private WindBeanXX wind;

        public AqiBeanX getAqi() {
            return aqi;
        }

        public void setAqi(AqiBeanX aqi) {
            this.aqi = aqi;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public TemperatureBeanXX getTemperature() {
            return temperature;
        }

        public void setTemperature(TemperatureBeanXX temperature) {
            this.temperature = temperature;
        }

        public WeatherBeanX getWeather() {
            return weather;
        }

        public void setWeather(WeatherBeanX weather) {
            this.weather = weather;
        }

        public WindBeanXX getWind() {
            return wind;
        }

        public void setWind(WindBeanXX wind) {
            this.wind = wind;
        }

        public static class AqiBeanX {
            /**
             * brandInfo : {"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]}
             * pubTime : 2019-03-09T20:00:00+08:00
             * status : 0
             * value : [105,105,109,111,115,117,117,116,117,120,122,125,125,122,121,120,120,121,124,126,126,125,122]
             */

            private BrandInfoBeanX brandInfo;
            private String pubTime;
            private int status;
            private List<Integer> value;

            public BrandInfoBeanX getBrandInfo() {
                return brandInfo;
            }

            public void setBrandInfo(BrandInfoBeanX brandInfo) {
                this.brandInfo = brandInfo;
            }

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<Integer> getValue() {
                return value;
            }

            public void setValue(List<Integer> value) {
                this.value = value;
            }

            public static class BrandInfoBeanX {
                private List<BrandsBeanX> brands;

                public List<BrandsBeanX> getBrands() {
                    return brands;
                }

                public void setBrands(List<BrandsBeanX> brands) {
                    this.brands = brands;
                }

                public static class BrandsBeanX {
                    /**
                     * brandId : caiyun
                     * logo : http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp
                     * names : {"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"}
                     * url :
                     */

                    private String brandId;
                    private String logo;
                    private NamesBeanX names;
                    private String url;

                    public String getBrandId() {
                        return brandId;
                    }

                    public void setBrandId(String brandId) {
                        this.brandId = brandId;
                    }

                    public String getLogo() {
                        return logo;
                    }

                    public void setLogo(String logo) {
                        this.logo = logo;
                    }

                    public NamesBeanX getNames() {
                        return names;
                    }

                    public void setNames(NamesBeanX names) {
                        this.names = names;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public static class NamesBeanX {
                        /**
                         * en_US : 彩云天气
                         * zh_TW : 彩雲天氣
                         * zh_CN : 彩云天气
                         */

                        private String en_US;
                        private String zh_TW;
                        private String zh_CN;

                        public String getEn_US() {
                            return en_US;
                        }

                        public void setEn_US(String en_US) {
                            this.en_US = en_US;
                        }

                        public String getZh_TW() {
                            return zh_TW;
                        }

                        public void setZh_TW(String zh_TW) {
                            this.zh_TW = zh_TW;
                        }

                        public String getZh_CN() {
                            return zh_CN;
                        }

                        public void setZh_CN(String zh_CN) {
                            this.zh_CN = zh_CN;
                        }
                    }
                }
            }
        }

        public static class TemperatureBeanXX {
            /**
             * pubTime : 2019-03-09T20:00:00+08:00
             * status : 0
             * unit : ℃
             * value : [10,8,8,8,7,5,5,5,4,2,2,2,5,7,9,12,12,12,12,12,12,13,11]
             */

            private String pubTime;
            private int status;
            private String unit;
            private List<Integer> value;

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public List<Integer> getValue() {
                return value;
            }

            public void setValue(List<Integer> value) {
                this.value = value;
            }
        }

        public static class WeatherBeanX {
            /**
             * pubTime : 2019-03-09T20:00:00+08:00
             * status : 0
             * value : [2,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,7,2,2,2]
             */

            private String pubTime;
            private int status;
            private List<Integer> value;

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<Integer> getValue() {
                return value;
            }

            public void setValue(List<Integer> value) {
                this.value = value;
            }
        }

        public static class WindBeanXX {
            /**
             * status : 0
             * value : [{"datetime":"2019-03-09T20:00:00.000+08:00","direction":"6.61","speed":"6.18"},{"datetime":"2019-03-09T21:00:00.000+08:00","direction":"359.55","speed":"6.35"},{"datetime":"2019-03-09T22:00:00.000+08:00","direction":"353.73","speed":"6.43"},{"datetime":"2019-03-09T23:00:00.000+08:00","direction":"351.46","speed":"6.37"},{"datetime":"2019-03-10T00:00:00.000+08:00","direction":"349.53","speed":"6.4"},{"datetime":"2019-03-10T01:00:00.000+08:00","direction":"351.51","speed":"6.5"},{"datetime":"2019-03-10T02:00:00.000+08:00","direction":"355.97","speed":"6.39"},{"datetime":"2019-03-10T03:00:00.000+08:00","direction":"357.77","speed":"6.14"},{"datetime":"2019-03-10T04:00:00.000+08:00","direction":"358.07","speed":"5.72"},{"datetime":"2019-03-10T05:00:00.000+08:00","direction":"7.45","speed":"5.24"},{"datetime":"2019-03-10T06:00:00.000+08:00","direction":"28.75","speed":"5.15"},{"datetime":"2019-03-10T07:00:00.000+08:00","direction":"47.9","speed":"5.5"},{"datetime":"2019-03-10T08:00:00.000+08:00","direction":"67.27","speed":"6.62"},{"datetime":"2019-03-10T09:00:00.000+08:00","direction":"88.87","speed":"8.49"},{"datetime":"2019-03-10T10:00:00.000+08:00","direction":"97.35","speed":"8.4"},{"datetime":"2019-03-10T11:00:00.000+08:00","direction":"112.88","speed":"7.38"},{"datetime":"2019-03-10T12:00:00.000+08:00","direction":"144.08","speed":"7.32"},{"datetime":"2019-03-10T13:00:00.000+08:00","direction":"175.43","speed":"8.13"},{"datetime":"2019-03-10T14:00:00.000+08:00","direction":"189.4","speed":"8.78"},{"datetime":"2019-03-10T15:00:00.000+08:00","direction":"202.39","speed":"8.69"},{"datetime":"2019-03-10T16:00:00.000+08:00","direction":"203.45","speed":"7.76"},{"datetime":"2019-03-10T17:00:00.000+08:00","direction":"225.14","speed":"8.61"},{"datetime":"2019-03-10T18:00:00.000+08:00","direction":"243.47","speed":"11.23"}]
             */

            private int status;
            private List<ValueBeanXXXXX> value;

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public List<ValueBeanXXXXX> getValue() {
                return value;
            }

            public void setValue(List<ValueBeanXXXXX> value) {
                this.value = value;
            }

            public static class ValueBeanXXXXX {
                /**
                 * datetime : 2019-03-09T20:00:00.000+08:00
                 * direction : 6.61
                 * speed : 6.18
                 */

                private String datetime;
                private String direction;
                private String speed;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public String getDirection() {
                    return direction;
                }

                public void setDirection(String direction) {
                    this.direction = direction;
                }

                public String getSpeed() {
                    return speed;
                }

                public void setSpeed(String speed) {
                    this.speed = speed;
                }
            }
        }
    }

    public static class IndicesBeanX {
        /**
         * indices : [{"type":"uvIndex","value":"2"},{"type":"humidity","value":"37"},{"type":"feelsLike","value":"10"},{"type":"pressure","value":"1017.0"},{"type":"carWash","value":"1"},{"type":"sports","value":"1"}]
         * pubTime :
         * status : 0
         */

        private String pubTime;
        private int status;
        private List<IndicesBean> indices;

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public List<IndicesBean> getIndices() {
            return indices;
        }

        public void setIndices(List<IndicesBean> indices) {
            this.indices = indices;
        }

        public static class IndicesBean {
            /**
             * type : uvIndex
             * value : 2
             */

            private String type;
            private String value;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }

    public static class YesterdayBean {
        /**
         * aqi :
         * date : 2019-03-08T12:00:00+08:00
         * status : 0
         * sunRise : 2019-03-08T06:40:00+08:00
         * sunSet : 2019-03-08T18:12:00+08:00
         * tempMax : 14
         * tempMin : 3
         * weatherEnd : 1
         * weatherStart : 1
         * windDircEnd : 180
         * windDircStart : 180
         * windSpeedEnd : 0.0
         * windSpeedStart : 20.0
         */

        private String aqi;
        private String date;
        private int status;
        private String sunRise;
        private String sunSet;
        private String tempMax;
        private String tempMin;
        private String weatherEnd;
        private String weatherStart;
        private String windDircEnd;
        private String windDircStart;
        private String windSpeedEnd;
        private String windSpeedStart;

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getSunRise() {
            return sunRise;
        }

        public void setSunRise(String sunRise) {
            this.sunRise = sunRise;
        }

        public String getSunSet() {
            return sunSet;
        }

        public void setSunSet(String sunSet) {
            this.sunSet = sunSet;
        }

        public String getTempMax() {
            return tempMax;
        }

        public void setTempMax(String tempMax) {
            this.tempMax = tempMax;
        }

        public String getTempMin() {
            return tempMin;
        }

        public void setTempMin(String tempMin) {
            this.tempMin = tempMin;
        }

        public String getWeatherEnd() {
            return weatherEnd;
        }

        public void setWeatherEnd(String weatherEnd) {
            this.weatherEnd = weatherEnd;
        }

        public String getWeatherStart() {
            return weatherStart;
        }

        public void setWeatherStart(String weatherStart) {
            this.weatherStart = weatherStart;
        }

        public String getWindDircEnd() {
            return windDircEnd;
        }

        public void setWindDircEnd(String windDircEnd) {
            this.windDircEnd = windDircEnd;
        }

        public String getWindDircStart() {
            return windDircStart;
        }

        public void setWindDircStart(String windDircStart) {
            this.windDircStart = windDircStart;
        }

        public String getWindSpeedEnd() {
            return windSpeedEnd;
        }

        public void setWindSpeedEnd(String windSpeedEnd) {
            this.windSpeedEnd = windSpeedEnd;
        }

        public String getWindSpeedStart() {
            return windSpeedStart;
        }

        public void setWindSpeedStart(String windSpeedStart) {
            this.windSpeedStart = windSpeedStart;
        }
    }

    public static class UrlBean {
        /**
         * weathercn :
         * caiyun :
         */

        private String weathercn;
        private String caiyun;

        public String getWeathercn() {
            return weathercn;
        }

        public void setWeathercn(String weathercn) {
            this.weathercn = weathercn;
        }

        public String getCaiyun() {
            return caiyun;
        }

        public void setCaiyun(String caiyun) {
            this.caiyun = caiyun;
        }
    }

    public static class BrandInfoBeanXX {
        private List<BrandsBeanXX> brands;

        public List<BrandsBeanXX> getBrands() {
            return brands;
        }

        public void setBrands(List<BrandsBeanXX> brands) {
            this.brands = brands;
        }

        public static class BrandsBeanXX {
            /**
             * brandId : caiyun
             * logo : http://f5.market.mi-img.com/download/MiSafe/069835733640846b1b2613a855328d2b6df404343/a.webp
             * names : {"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"}
             * url :
             */

            private String brandId;
            private String logo;
            private NamesBeanXX names;
            private String url;

            public String getBrandId() {
                return brandId;
            }

            public void setBrandId(String brandId) {
                this.brandId = brandId;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }

            public NamesBeanXX getNames() {
                return names;
            }

            public void setNames(NamesBeanXX names) {
                this.names = names;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public static class NamesBeanXX {
                /**
                 * en_US : 彩云天气
                 * zh_TW : 彩雲天氣
                 * zh_CN : 彩云天气
                 */

                private String en_US;
                private String zh_TW;
                private String zh_CN;

                public String getEn_US() {
                    return en_US;
                }

                public void setEn_US(String en_US) {
                    this.en_US = en_US;
                }

                public String getZh_TW() {
                    return zh_TW;
                }

                public void setZh_TW(String zh_TW) {
                    this.zh_TW = zh_TW;
                }

                public String getZh_CN() {
                    return zh_CN;
                }

                public void setZh_CN(String zh_CN) {
                    this.zh_CN = zh_CN;
                }
            }
        }
    }

    public static class AqiBeanXX {
        /**
         * pubTime : 2019-03-09T19:00:00+08:00
         * so2 : 8
         * pm10Desc : PM10指的是直径小于或等于10微米的颗粒物，又称为可吸入颗粒物
         * o3 : 74
         * status : 0
         * no2Desc : 二氧化氮有刺激性特殊臭味，但浓度低时人体不会感知到
         * suggest : 空气质量可以接受，可能对少数异常敏感的人群健康有较弱影响
         * so2Desc : 二氧化硫是一种无色气体，当空气中SO2达到一定浓度时，空气中会有刺鼻的气味
         * co : 0.80
         * o3Desc : 臭氧俗称晴空杀手，无色无味，但对人体的伤害不比PM2.5低，浓度高时建议减少夏季午后的外出活动，如果不开窗效果更佳
         * no2 : 46
         * primary :
         * aqi : 100
         * pm10 : 118
         * coDesc : 一氧化碳是无色，无臭，无味气体，但吸入对人体有十分大的危害
         * src : 中国环境监测总站
         * pm25 : 75
         * pm25Desc : PM2.5易携带重金属、微生物等有害物质，对人体健康影响较大
         * brandInfo : {"brands":[{"logo":"","names":{"en_US":"CNEMC","zh_TW":"中國環境監測總站","zh_CN":"中国环境监测总站"},"brandId":"CNEMC","url":""}]}
         */

        private String pubTime;
        private String so2;
        private String pm10Desc;
        private String o3;
        private int status;
        private String no2Desc;
        private String suggest;
        private String so2Desc;
        private String co;
        private String o3Desc;
        private String no2;
        private String primary;
        private String aqi;
        private String pm10;
        private String coDesc;
        private String src;
        private String pm25;
        private String pm25Desc;
        private BrandInfoBeanXXX brandInfo;

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public String getSo2() {
            return so2;
        }

        public void setSo2(String so2) {
            this.so2 = so2;
        }

        public String getPm10Desc() {
            return pm10Desc;
        }

        public void setPm10Desc(String pm10Desc) {
            this.pm10Desc = pm10Desc;
        }

        public String getO3() {
            return o3;
        }

        public void setO3(String o3) {
            this.o3 = o3;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getNo2Desc() {
            return no2Desc;
        }

        public void setNo2Desc(String no2Desc) {
            this.no2Desc = no2Desc;
        }

        public String getSuggest() {
            return suggest;
        }

        public void setSuggest(String suggest) {
            this.suggest = suggest;
        }

        public String getSo2Desc() {
            return so2Desc;
        }

        public void setSo2Desc(String so2Desc) {
            this.so2Desc = so2Desc;
        }

        public String getCo() {
            return co;
        }

        public void setCo(String co) {
            this.co = co;
        }

        public String getO3Desc() {
            return o3Desc;
        }

        public void setO3Desc(String o3Desc) {
            this.o3Desc = o3Desc;
        }

        public String getNo2() {
            return no2;
        }

        public void setNo2(String no2) {
            this.no2 = no2;
        }

        public String getPrimary() {
            return primary;
        }

        public void setPrimary(String primary) {
            this.primary = primary;
        }

        public String getAqi() {
            return aqi;
        }

        public void setAqi(String aqi) {
            this.aqi = aqi;
        }

        public String getPm10() {
            return pm10;
        }

        public void setPm10(String pm10) {
            this.pm10 = pm10;
        }

        public String getCoDesc() {
            return coDesc;
        }

        public void setCoDesc(String coDesc) {
            this.coDesc = coDesc;
        }

        public String getSrc() {
            return src;
        }

        public void setSrc(String src) {
            this.src = src;
        }

        public String getPm25() {
            return pm25;
        }

        public void setPm25(String pm25) {
            this.pm25 = pm25;
        }

        public String getPm25Desc() {
            return pm25Desc;
        }

        public void setPm25Desc(String pm25Desc) {
            this.pm25Desc = pm25Desc;
        }

        public BrandInfoBeanXXX getBrandInfo() {
            return brandInfo;
        }

        public void setBrandInfo(BrandInfoBeanXXX brandInfo) {
            this.brandInfo = brandInfo;
        }

        public static class BrandInfoBeanXXX {
            private List<BrandsBeanXXX> brands;

            public List<BrandsBeanXXX> getBrands() {
                return brands;
            }

            public void setBrands(List<BrandsBeanXXX> brands) {
                this.brands = brands;
            }

            public static class BrandsBeanXXX {
                /**
                 * logo :
                 * names : {"en_US":"CNEMC","zh_TW":"中國環境監測總站","zh_CN":"中国环境监测总站"}
                 * brandId : CNEMC
                 * url :
                 */

                private String logo;
                private NamesBeanXXX names;
                private String brandId;
                private String url;

                public String getLogo() {
                    return logo;
                }

                public void setLogo(String logo) {
                    this.logo = logo;
                }

                public NamesBeanXXX getNames() {
                    return names;
                }

                public void setNames(NamesBeanXXX names) {
                    this.names = names;
                }

                public String getBrandId() {
                    return brandId;
                }

                public void setBrandId(String brandId) {
                    this.brandId = brandId;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public static class NamesBeanXXX {
                    /**
                     * en_US : CNEMC
                     * zh_TW : 中國環境監測總站
                     * zh_CN : 中国环境监测总站
                     */

                    private String en_US;
                    private String zh_TW;
                    private String zh_CN;

                    public String getEn_US() {
                        return en_US;
                    }

                    public void setEn_US(String en_US) {
                        this.en_US = en_US;
                    }

                    public String getZh_TW() {
                        return zh_TW;
                    }

                    public void setZh_TW(String zh_TW) {
                        this.zh_TW = zh_TW;
                    }

                    public String getZh_CN() {
                        return zh_CN;
                    }

                    public void setZh_CN(String zh_CN) {
                        this.zh_CN = zh_CN;
                    }
                }
            }
        }
    }

    public static class PreHourBean {
        /**
         * pubTime : 2019-03-09T19:00:00+08:00
         * wind : {"speed":{"unit":"km/h","value":"11.3"},"direction":{"unit":"°","value":"0"}}
         * humidity : {"unit":"%","value":"35"}
         * pressure : {"unit":"mb","value":"1017.0"}
         * visibility : {"unit":"km","value":""}
         * feelsLike : {"unit":"℃","value":"10"}
         * aqi : {"pubTime":"2019-03-09T18:00:00+08:00","so2":"11","pm10Desc":"PM10指的是直径小于或等于10微米的颗粒物，又称为可吸入颗粒物","o3":"44","status":0,"no2Desc":"二氧化氮是硝酸盐气溶胶的主要来源，是构成PM2.5和紫外线作用下产生臭氧的主要成分","suggest":"户外PM2.5浓度较高，出行时建议佩戴口罩","so2Desc":"人为的二氧化硫主要来源为家庭取暖，发电和机动车而燃烧含有硫磺的矿物燃料，以及对含有硫磺的矿物的冶炼","co":"1.1","o3Desc":"地面的臭氧主要由车辆和工业释放出的氧化氮等污染物以及由机动车、溶剂和工业释放的挥发性有机化合物与阳光反应而生成","no2":"73","primary":"","aqi":"117","coDesc":"暴露在一氧化碳中可能严重损害心脏和中枢神经系统，也可能令孕妇胎儿产生严重的不良影响","pm10":"117","pm25Desc":"PM2.5能够在大气中停留很长时间，并可随呼吸进入体内，积聚在气管或肺中，影响身体健康","pm25":"88","src":"中国环境监测总站","brandInfo":{"brands":[{"logo":"","names":{"zh_TW":"中國環境監測總站","en_US":"CNEMC","zh_CN":"中国环境监测总站"},"brandId":"CNEMC","url":""}]}}
         * uvIndex : 0
         * weather : 2
         * temperature : {"unit":"℃","value":"10"}
         */

        private String pubTime;
        private WindBeanXXX wind;
        private HumidityBeanX humidity;
        private PressureBeanX pressure;
        private VisibilityBeanX visibility;
        private FeelsLikeBeanX feelsLike;
        private AqiBeanXXX aqi;
        private String uvIndex;
        private String weather;
        private TemperatureBeanXXX temperature;

        public String getPubTime() {
            return pubTime;
        }

        public void setPubTime(String pubTime) {
            this.pubTime = pubTime;
        }

        public WindBeanXXX getWind() {
            return wind;
        }

        public void setWind(WindBeanXXX wind) {
            this.wind = wind;
        }

        public HumidityBeanX getHumidity() {
            return humidity;
        }

        public void setHumidity(HumidityBeanX humidity) {
            this.humidity = humidity;
        }

        public PressureBeanX getPressure() {
            return pressure;
        }

        public void setPressure(PressureBeanX pressure) {
            this.pressure = pressure;
        }

        public VisibilityBeanX getVisibility() {
            return visibility;
        }

        public void setVisibility(VisibilityBeanX visibility) {
            this.visibility = visibility;
        }

        public FeelsLikeBeanX getFeelsLike() {
            return feelsLike;
        }

        public void setFeelsLike(FeelsLikeBeanX feelsLike) {
            this.feelsLike = feelsLike;
        }

        public AqiBeanXXX getAqi() {
            return aqi;
        }

        public void setAqi(AqiBeanXXX aqi) {
            this.aqi = aqi;
        }

        public String getUvIndex() {
            return uvIndex;
        }

        public void setUvIndex(String uvIndex) {
            this.uvIndex = uvIndex;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public TemperatureBeanXXX getTemperature() {
            return temperature;
        }

        public void setTemperature(TemperatureBeanXXX temperature) {
            this.temperature = temperature;
        }

        public static class WindBeanXXX {
            /**
             * speed : {"unit":"km/h","value":"11.3"}
             * direction : {"unit":"°","value":"0"}
             */

            private SpeedBeanXX speed;
            private DirectionBeanXX direction;

            public SpeedBeanXX getSpeed() {
                return speed;
            }

            public void setSpeed(SpeedBeanXX speed) {
                this.speed = speed;
            }

            public DirectionBeanXX getDirection() {
                return direction;
            }

            public void setDirection(DirectionBeanXX direction) {
                this.direction = direction;
            }

            public static class SpeedBeanXX {
                /**
                 * unit : km/h
                 * value : 11.3
                 */

                private String unit;
                private String value;

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class DirectionBeanXX {
                /**
                 * unit : °
                 * value : 0
                 */

                private String unit;
                private String value;

                public String getUnit() {
                    return unit;
                }

                public void setUnit(String unit) {
                    this.unit = unit;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }

        public static class HumidityBeanX {
            /**
             * unit : %
             * value : 35
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class PressureBeanX {
            /**
             * unit : mb
             * value : 1017.0
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class VisibilityBeanX {
            /**
             * unit : km
             * value :
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class FeelsLikeBeanX {
            /**
             * unit : ℃
             * value : 10
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public static class AqiBeanXXX {
            /**
             * pubTime : 2019-03-09T18:00:00+08:00
             * so2 : 11
             * pm10Desc : PM10指的是直径小于或等于10微米的颗粒物，又称为可吸入颗粒物
             * o3 : 44
             * status : 0
             * no2Desc : 二氧化氮是硝酸盐气溶胶的主要来源，是构成PM2.5和紫外线作用下产生臭氧的主要成分
             * suggest : 户外PM2.5浓度较高，出行时建议佩戴口罩
             * so2Desc : 人为的二氧化硫主要来源为家庭取暖，发电和机动车而燃烧含有硫磺的矿物燃料，以及对含有硫磺的矿物的冶炼
             * co : 1.1
             * o3Desc : 地面的臭氧主要由车辆和工业释放出的氧化氮等污染物以及由机动车、溶剂和工业释放的挥发性有机化合物与阳光反应而生成
             * no2 : 73
             * primary :
             * aqi : 117
             * coDesc : 暴露在一氧化碳中可能严重损害心脏和中枢神经系统，也可能令孕妇胎儿产生严重的不良影响
             * pm10 : 117
             * pm25Desc : PM2.5能够在大气中停留很长时间，并可随呼吸进入体内，积聚在气管或肺中，影响身体健康
             * pm25 : 88
             * src : 中国环境监测总站
             * brandInfo : {"brands":[{"logo":"","names":{"zh_TW":"中國環境監測總站","en_US":"CNEMC","zh_CN":"中国环境监测总站"},"brandId":"CNEMC","url":""}]}
             */

            private String pubTime;
            private String so2;
            private String pm10Desc;
            private String o3;
            private int status;
            private String no2Desc;
            private String suggest;
            private String so2Desc;
            private String co;
            private String o3Desc;
            private String no2;
            private String primary;
            private String aqi;
            private String coDesc;
            private String pm10;
            private String pm25Desc;
            private String pm25;
            private String src;
            private BrandInfoBeanXXXX brandInfo;

            public String getPubTime() {
                return pubTime;
            }

            public void setPubTime(String pubTime) {
                this.pubTime = pubTime;
            }

            public String getSo2() {
                return so2;
            }

            public void setSo2(String so2) {
                this.so2 = so2;
            }

            public String getPm10Desc() {
                return pm10Desc;
            }

            public void setPm10Desc(String pm10Desc) {
                this.pm10Desc = pm10Desc;
            }

            public String getO3() {
                return o3;
            }

            public void setO3(String o3) {
                this.o3 = o3;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getNo2Desc() {
                return no2Desc;
            }

            public void setNo2Desc(String no2Desc) {
                this.no2Desc = no2Desc;
            }

            public String getSuggest() {
                return suggest;
            }

            public void setSuggest(String suggest) {
                this.suggest = suggest;
            }

            public String getSo2Desc() {
                return so2Desc;
            }

            public void setSo2Desc(String so2Desc) {
                this.so2Desc = so2Desc;
            }

            public String getCo() {
                return co;
            }

            public void setCo(String co) {
                this.co = co;
            }

            public String getO3Desc() {
                return o3Desc;
            }

            public void setO3Desc(String o3Desc) {
                this.o3Desc = o3Desc;
            }

            public String getNo2() {
                return no2;
            }

            public void setNo2(String no2) {
                this.no2 = no2;
            }

            public String getPrimary() {
                return primary;
            }

            public void setPrimary(String primary) {
                this.primary = primary;
            }

            public String getAqi() {
                return aqi;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }

            public String getCoDesc() {
                return coDesc;
            }

            public void setCoDesc(String coDesc) {
                this.coDesc = coDesc;
            }

            public String getPm10() {
                return pm10;
            }

            public void setPm10(String pm10) {
                this.pm10 = pm10;
            }

            public String getPm25Desc() {
                return pm25Desc;
            }

            public void setPm25Desc(String pm25Desc) {
                this.pm25Desc = pm25Desc;
            }

            public String getPm25() {
                return pm25;
            }

            public void setPm25(String pm25) {
                this.pm25 = pm25;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }

            public BrandInfoBeanXXXX getBrandInfo() {
                return brandInfo;
            }

            public void setBrandInfo(BrandInfoBeanXXXX brandInfo) {
                this.brandInfo = brandInfo;
            }

            public static class BrandInfoBeanXXXX {
                private List<BrandsBeanXXXX> brands;

                public List<BrandsBeanXXXX> getBrands() {
                    return brands;
                }

                public void setBrands(List<BrandsBeanXXXX> brands) {
                    this.brands = brands;
                }

                public static class BrandsBeanXXXX {
                    /**
                     * logo :
                     * names : {"zh_TW":"中國環境監測總站","en_US":"CNEMC","zh_CN":"中国环境监测总站"}
                     * brandId : CNEMC
                     * url :
                     */

                    private String logo;
                    private NamesBeanXXXX names;
                    private String brandId;
                    private String url;

                    public String getLogo() {
                        return logo;
                    }

                    public void setLogo(String logo) {
                        this.logo = logo;
                    }

                    public NamesBeanXXXX getNames() {
                        return names;
                    }

                    public void setNames(NamesBeanXXXX names) {
                        this.names = names;
                    }

                    public String getBrandId() {
                        return brandId;
                    }

                    public void setBrandId(String brandId) {
                        this.brandId = brandId;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public static class NamesBeanXXXX {
                        /**
                         * zh_TW : 中國環境監測總站
                         * en_US : CNEMC
                         * zh_CN : 中国环境监测总站
                         */

                        private String zh_TW;
                        private String en_US;
                        private String zh_CN;

                        public String getZh_TW() {
                            return zh_TW;
                        }

                        public void setZh_TW(String zh_TW) {
                            this.zh_TW = zh_TW;
                        }

                        public String getEn_US() {
                            return en_US;
                        }

                        public void setEn_US(String en_US) {
                            this.en_US = en_US;
                        }

                        public String getZh_CN() {
                            return zh_CN;
                        }

                        public void setZh_CN(String zh_CN) {
                            this.zh_CN = zh_CN;
                        }
                    }
                }
            }
        }

        public static class TemperatureBeanXXX {
            /**
             * unit : ℃
             * value : 10
             */

            private String unit;
            private String value;

            public String getUnit() {
                return unit;
            }

            public void setUnit(String unit) {
                this.unit = unit;
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }
    }

    public static class ChsBean {
        /**
         * type : FD0WD
         */

        private String type;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
}
