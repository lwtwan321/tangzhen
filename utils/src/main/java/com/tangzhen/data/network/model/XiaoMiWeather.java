package com.tangzhen.data.network.model;

import java.util.List;

public class XiaoMiWeather {


    /**
     * current : {"feelsLike":{"unit":"℃","value":"18"},"humidity":{"unit":"%","value":"38"},"pressure":{"unit":"mb","value":"1008.0"},"pubTime":"2019-03-19T11:48:00+08:00","temperature":{"unit":"℃","value":"18"},"uvIndex":"5","visibility":{"unit":"km","value":""},"weather":"53","wind":{"direction":{"unit":"°","value":"158"},"speed":{"unit":"km/h","value":"12.8"}}}
     * forecastDaily : {"aqi":{"brandInfo":{"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]},"pubTime":"2019-03-19T00:00:00+08:00","status":0,"value":[210,95,10,23,28,68,102,38,24,14,36,18,15,18,139]},"precipitationProbability":{"status":0,"value":["0","55","0","0","0"]},"pubTime":"2019-03-19T12:00:00+08:00","status":0,"sunRiseSet":{"status":0,"value":[{"from":"2019-03-19T06:23:00+08:00","to":"2019-03-19T18:24:00+08:00"},{"from":"2019-03-20T06:21:00+08:00","to":"2019-03-20T18:25:00+08:00"},{"from":"2019-03-21T06:19:00+08:00","to":"2019-03-21T18:26:00+08:00"},{"from":"2019-03-22T06:18:00+08:00","to":"2019-03-22T18:27:00+08:00"},{"from":"2019-03-23T06:16:00+08:00","to":"2019-03-23T18:28:00+08:00"},{"from":"2019-03-24T06:15:00+08:00","to":"2019-03-24T18:29:00+08:00"},{"from":"2019-03-25T06:13:00+08:00","to":"2019-03-25T18:30:00+08:00"},{"from":"2019-03-26T06:11:00+08:00","to":"2019-03-26T18:31:00+08:00"},{"from":"2019-03-27T06:10:00+08:00","to":"2019-03-27T18:32:00+08:00"},{"from":"2019-03-28T06:08:00+08:00","to":"2019-03-28T18:33:00+08:00"},{"from":"2019-03-29T06:07:00+08:00","to":"2019-03-29T18:34:00+08:00"},{"from":"2019-03-30T06:05:00+08:00","to":"2019-03-30T18:35:00+08:00"},{"from":"2019-03-31T06:03:00+08:00","to":"2019-03-31T18:36:00+08:00"},{"from":"2019-04-01T06:02:00+08:00","to":"2019-04-01T18:37:00+08:00"},{"from":"2019-04-02T06:00:00+08:00","to":"2019-04-02T18:38:00+08:00"}]},"temperature":{"status":0,"unit":"℃","value":[{"from":"25","to":"12"},{"from":"18","to":"6"},{"from":"14","to":"2"},{"from":"15","to":"3"},{"from":"14","to":"3"},{"from":"18","to":"4"},{"from":"20","to":"6"},{"from":"21","to":"5"},{"from":"14","to":"3"},{"from":"11","to":"2"},{"from":"13","to":"3"},{"from":"18","to":"6"},{"from":"15","to":"5"},{"from":"19","to":"5"},{"from":"18","to":"6"}]},"weather":{"status":0,"value":[{"from":"53","to":"1"},{"from":"7","to":"7"},{"from":"1","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"2"},{"from":"1","to":"2"},{"from":"0","to":"7"},{"from":"1","to":"0"},{"from":"1","to":"7"},{"from":"1","to":"0"},{"from":"0","to":"1"},{"from":"0","to":"1"}]},"wind":{"direction":{"status":0,"unit":"°","value":[{"from":"158","to":"158"},{"from":"135","to":"0"},{"from":"0","to":"0"},{"from":"315","to":"315"},{"from":"225","to":"225"},{"from":"180","to":"180"},{"from":"315","to":"0"},{"from":"135","to":"90"},{"from":"315","to":"0"},{"from":"135","to":"180"},{"from":"135","to":"225"},{"from":"225","to":"315"},{"from":"225","to":"0"},{"from":"225","to":"0"},{"from":"315","to":"270"}]},"speed":{"status":0,"unit":"km/h","value":[{"from":"12.8","to":"12.8"},{"from":"20.0","to":"29.0"},{"from":"29.0","to":"0.0"},{"from":"20.0","to":"20.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"20.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"29.0","to":"0.0"},{"from":"20.0","to":"20.0"},{"from":"0.0","to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"29.0","to":"0.0"}]}}}
     * forecastHourly : {"aqi":{"brandInfo":{"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]},"pubTime":"2019-03-19T13:00:00+08:00","status":0,"value":[202,177,151,134,121,116,117,120,121,124,126,130,134,134,131,125,121,120,122,125,129,130,125]},"desc":"逐小时预报","status":0,"temperature":{"pubTime":"2019-03-19T13:00:00+08:00","status":0,"unit":"℃","value":[19,22,22,22,22,22,21,20,19,18,16,14,14,12,11,10,9,8,6,6,8,10,11]},"weather":{"pubTime":"2019-03-19T13:00:00+08:00","status":0,"value":[53,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]},"wind":{"status":0,"value":[{"datetime":"2019-03-19T13:00:00.000+08:00","direction":"188.23","speed":"9.25"},{"datetime":"2019-03-19T14:00:00.000+08:00","direction":"203.2","speed":"12.46"},{"datetime":"2019-03-19T15:00:00.000+08:00","direction":"207.01","speed":"15.08"},{"datetime":"2019-03-19T16:00:00.000+08:00","direction":"203.99","speed":"16.14"},{"datetime":"2019-03-19T17:00:00.000+08:00","direction":"198.06","speed":"12.93"},{"datetime":"2019-03-19T18:00:00.000+08:00","direction":"188.93","speed":"10.78"},{"datetime":"2019-03-19T19:00:00.000+08:00","direction":"182.05","speed":"9.72"},{"datetime":"2019-03-19T20:00:00.000+08:00","direction":"183.51","speed":"9.82"},{"datetime":"2019-03-19T21:00:00.000+08:00","direction":"185.77","speed":"10.07"},{"datetime":"2019-03-19T22:00:00.000+08:00","direction":"190.18","speed":"11.38"},{"datetime":"2019-03-19T23:00:00.000+08:00","direction":"195.36","speed":"12.77"},{"datetime":"2019-03-20T00:00:00.000+08:00","direction":"198.63","speed":"12.87"},{"datetime":"2019-03-20T01:00:00.000+08:00","direction":"198.44","speed":"12.32"},{"datetime":"2019-03-20T02:00:00.000+08:00","direction":"195.32","speed":"11.91"},{"datetime":"2019-03-20T03:00:00.000+08:00","direction":"191.43","speed":"11.54"},{"datetime":"2019-03-20T04:00:00.000+08:00","direction":"197.62","speed":"11.49"},{"datetime":"2019-03-20T05:00:00.000+08:00","direction":"194.56","speed":"9.38"},{"datetime":"2019-03-20T06:00:00.000+08:00","direction":"197.28","speed":"9.78"},{"datetime":"2019-03-20T07:00:00.000+08:00","direction":"199.2","speed":"8.65"},{"datetime":"2019-03-20T08:00:00.000+08:00","direction":"206.21","speed":"7.38"},{"datetime":"2019-03-20T09:00:00.000+08:00","direction":"189.87","speed":"5.61"},{"datetime":"2019-03-20T10:00:00.000+08:00","direction":"169.89","speed":"5.43"},{"datetime":"2019-03-20T11:00:00.000+08:00","direction":"168.91","speed":"5.46"}]}}
     * indices : {"indices":[{"type":"uvIndex","value":"5"},{"type":"humidity","value":"38"},{"type":"feelsLike","value":"18"},{"type":"pressure","value":"1008.0"},{"type":"carWash","value":"0"},{"type":"sports","value":"0"}],"pubTime":"","status":0}
     * alerts : []
     * yesterday : {"aqi":"","date":"2019-03-18T12:00:00+08:00","status":0,"sunRise":"2019-03-18T06:24:00+08:00","sunSet":"2019-03-18T18:23:00+08:00","tempMax":"21","tempMin":"6","weatherEnd":"0","weatherStart":"1","windDircEnd":"225","windDircStart":"180","windSpeedEnd":"0.0","windSpeedStart":"20.0"}
     * url : {"weathercn":"","caiyun":""}
     * brandInfo : {"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/069835733640846b1b2613a855328d2b6df404343/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""},{"brandId":"weatherbj","logo":"","names":{"en_US":"北京气象局","zh_TW":"北京气象局","zh_CN":"北京气象局"},"url":""}]}
     * preHour : [{"pubTime":"2019-03-19T12:00:00+08:00","wind":{"speed":{"unit":"km/h","value":"12.8"},"direction":{"unit":"°","value":"158"}},"humidity":{"unit":"%","value":"40"},"pressure":{"unit":"mb","value":"1008.0"},"visibility":{"unit":"km","value":""},"feelsLike":{"unit":"℃","value":"18"},"aqi":{"pubTime":"2019-03-19T11:00:00+08:00","so2":"10","pm10Desc":"PM10对人的影响要大于其他任何污染物，长期暴露于污染环境可能导致罹患心血管和呼吸道疾病甚至肺癌","o3":"26","status":0,"no2Desc":"短期浓度超过200微克/立方米时，二氧化氮是一种引起呼吸道严重发炎的有毒气体","suggest":"空气很差，请减少外出，关闭门窗","so2Desc":"二氧化硫是一种无色气体，当空气中SO2达到一定浓度时，空气中会有刺鼻的气味","co":"1.7","o3Desc":"地面的臭氧主要由车辆和工业释放出的氧化氮等污染物以及由机动车、溶剂和工业释放的挥发性有机化合物与阳光反应而生成","no2":"125","primary":"","aqi":"246","coDesc":"一氧化碳是无色，无臭，无味气体，但吸入对人体有十分大的危害","pm10":"273","pm25Desc":"PM2.5指的是直径小于或等于2.5微米的颗粒物，又称为细颗粒物","pm25":"196","src":"中国环境监测总站","brandInfo":{"brands":[{"logo":"","names":{"zh_TW":"中國環境監測總站","en_US":"CNEMC","zh_CN":"中国环境监测总站"},"brandId":"CNEMC","url":""}]}},"uvIndex":"5","weather":"53","temperature":{"unit":"℃","value":"18"}}]
     * updateTime : 1552970166951
     * aqi : {"pubTime":"2019-03-19T11:00:00+08:00","so2":"14","pm10Desc":"PM10指的是直径小于或等于10微米的颗粒物，又称为可吸入颗粒物","o3":"30","status":0,"no2Desc":"二氧化氮有刺激性特殊臭味，但浓度低时人体不会感知到","suggest":"空气很差，请减少外出，关闭门窗","so2Desc":"二氧化硫是一种无色气体，当空气中SO2达到一定浓度时，空气中会有刺鼻的气味","co":"1.55","o3Desc":"空气中过多臭氧可能导致呼吸问题，引发哮喘，降低肺功能并引起肺部疾病，对人类健康影响较大","no2":"108","primary":"","aqi":"210","pm10":"221","coDesc":"一氧化碳八成来自汽车尾气，交通高峰期时，公路沿线产生的CO浓度会高于平常","src":"中国环境监测总站","pm25":"160","pm25Desc":"PM2.5能够在大气中停留很长时间，并可随呼吸进入体内，积聚在气管或肺中，影响身体健康","brandInfo":{"brands":[{"logo":"","names":{"en_US":"CNEMC","zh_TW":"中國環境監測總站","zh_CN":"中国环境监测总站"},"brandId":"CNEMC","url":""}]}}
     * chs : [{"type":"CWA"},{"type":"FD0WD"}]
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
         * feelsLike : {"unit":"℃","value":"18"}
         * humidity : {"unit":"%","value":"38"}
         * pressure : {"unit":"mb","value":"1008.0"}
         * pubTime : 2019-03-19T11:48:00+08:00
         * temperature : {"unit":"℃","value":"18"}
         * uvIndex : 5
         * visibility : {"unit":"km","value":""}
         * weather : 53
         * wind : {"direction":{"unit":"°","value":"158"},"speed":{"unit":"km/h","value":"12.8"}}
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
             * value : 18
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
             * value : 38
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
             * value : 1008.0
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
             * value : 18
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
             * direction : {"unit":"°","value":"158"}
             * speed : {"unit":"km/h","value":"12.8"}
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
                 * value : 158
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
                 * value : 12.8
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
         * aqi : {"brandInfo":{"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]},"pubTime":"2019-03-19T00:00:00+08:00","status":0,"value":[210,95,10,23,28,68,102,38,24,14,36,18,15,18,139]}
         * precipitationProbability : {"status":0,"value":["0","55","0","0","0"]}
         * pubTime : 2019-03-19T12:00:00+08:00
         * status : 0
         * sunRiseSet : {"status":0,"value":[{"from":"2019-03-19T06:23:00+08:00","to":"2019-03-19T18:24:00+08:00"},{"from":"2019-03-20T06:21:00+08:00","to":"2019-03-20T18:25:00+08:00"},{"from":"2019-03-21T06:19:00+08:00","to":"2019-03-21T18:26:00+08:00"},{"from":"2019-03-22T06:18:00+08:00","to":"2019-03-22T18:27:00+08:00"},{"from":"2019-03-23T06:16:00+08:00","to":"2019-03-23T18:28:00+08:00"},{"from":"2019-03-24T06:15:00+08:00","to":"2019-03-24T18:29:00+08:00"},{"from":"2019-03-25T06:13:00+08:00","to":"2019-03-25T18:30:00+08:00"},{"from":"2019-03-26T06:11:00+08:00","to":"2019-03-26T18:31:00+08:00"},{"from":"2019-03-27T06:10:00+08:00","to":"2019-03-27T18:32:00+08:00"},{"from":"2019-03-28T06:08:00+08:00","to":"2019-03-28T18:33:00+08:00"},{"from":"2019-03-29T06:07:00+08:00","to":"2019-03-29T18:34:00+08:00"},{"from":"2019-03-30T06:05:00+08:00","to":"2019-03-30T18:35:00+08:00"},{"from":"2019-03-31T06:03:00+08:00","to":"2019-03-31T18:36:00+08:00"},{"from":"2019-04-01T06:02:00+08:00","to":"2019-04-01T18:37:00+08:00"},{"from":"2019-04-02T06:00:00+08:00","to":"2019-04-02T18:38:00+08:00"}]}
         * temperature : {"status":0,"unit":"℃","value":[{"from":"25","to":"12"},{"from":"18","to":"6"},{"from":"14","to":"2"},{"from":"15","to":"3"},{"from":"14","to":"3"},{"from":"18","to":"4"},{"from":"20","to":"6"},{"from":"21","to":"5"},{"from":"14","to":"3"},{"from":"11","to":"2"},{"from":"13","to":"3"},{"from":"18","to":"6"},{"from":"15","to":"5"},{"from":"19","to":"5"},{"from":"18","to":"6"}]}
         * weather : {"status":0,"value":[{"from":"53","to":"1"},{"from":"7","to":"7"},{"from":"1","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"2"},{"from":"1","to":"2"},{"from":"0","to":"7"},{"from":"1","to":"0"},{"from":"1","to":"7"},{"from":"1","to":"0"},{"from":"0","to":"1"},{"from":"0","to":"1"}]}
         * wind : {"direction":{"status":0,"unit":"°","value":[{"from":"158","to":"158"},{"from":"135","to":"0"},{"from":"0","to":"0"},{"from":"315","to":"315"},{"from":"225","to":"225"},{"from":"180","to":"180"},{"from":"315","to":"0"},{"from":"135","to":"90"},{"from":"315","to":"0"},{"from":"135","to":"180"},{"from":"135","to":"225"},{"from":"225","to":"315"},{"from":"225","to":"0"},{"from":"225","to":"0"},{"from":"315","to":"270"}]},"speed":{"status":0,"unit":"km/h","value":[{"from":"12.8","to":"12.8"},{"from":"20.0","to":"29.0"},{"from":"29.0","to":"0.0"},{"from":"20.0","to":"20.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"20.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"29.0","to":"0.0"},{"from":"20.0","to":"20.0"},{"from":"0.0","to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"29.0","to":"0.0"}]}}
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
             * pubTime : 2019-03-19T00:00:00+08:00
             * status : 0
             * value : [210,95,10,23,28,68,102,38,24,14,36,18,15,18,139]
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
             * value : ["0","55","0","0","0"]
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
             * value : [{"from":"2019-03-19T06:23:00+08:00","to":"2019-03-19T18:24:00+08:00"},{"from":"2019-03-20T06:21:00+08:00","to":"2019-03-20T18:25:00+08:00"},{"from":"2019-03-21T06:19:00+08:00","to":"2019-03-21T18:26:00+08:00"},{"from":"2019-03-22T06:18:00+08:00","to":"2019-03-22T18:27:00+08:00"},{"from":"2019-03-23T06:16:00+08:00","to":"2019-03-23T18:28:00+08:00"},{"from":"2019-03-24T06:15:00+08:00","to":"2019-03-24T18:29:00+08:00"},{"from":"2019-03-25T06:13:00+08:00","to":"2019-03-25T18:30:00+08:00"},{"from":"2019-03-26T06:11:00+08:00","to":"2019-03-26T18:31:00+08:00"},{"from":"2019-03-27T06:10:00+08:00","to":"2019-03-27T18:32:00+08:00"},{"from":"2019-03-28T06:08:00+08:00","to":"2019-03-28T18:33:00+08:00"},{"from":"2019-03-29T06:07:00+08:00","to":"2019-03-29T18:34:00+08:00"},{"from":"2019-03-30T06:05:00+08:00","to":"2019-03-30T18:35:00+08:00"},{"from":"2019-03-31T06:03:00+08:00","to":"2019-03-31T18:36:00+08:00"},{"from":"2019-04-01T06:02:00+08:00","to":"2019-04-01T18:37:00+08:00"},{"from":"2019-04-02T06:00:00+08:00","to":"2019-04-02T18:38:00+08:00"}]
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
                 * from : 2019-03-19T06:23:00+08:00
                 * to : 2019-03-19T18:24:00+08:00
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
             * value : [{"from":"25","to":"12"},{"from":"18","to":"6"},{"from":"14","to":"2"},{"from":"15","to":"3"},{"from":"14","to":"3"},{"from":"18","to":"4"},{"from":"20","to":"6"},{"from":"21","to":"5"},{"from":"14","to":"3"},{"from":"11","to":"2"},{"from":"13","to":"3"},{"from":"18","to":"6"},{"from":"15","to":"5"},{"from":"19","to":"5"},{"from":"18","to":"6"}]
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
                 * from : 25
                 * to : 12
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
             * value : [{"from":"53","to":"1"},{"from":"7","to":"7"},{"from":"1","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"0"},{"from":"0","to":"2"},{"from":"1","to":"2"},{"from":"0","to":"7"},{"from":"1","to":"0"},{"from":"1","to":"7"},{"from":"1","to":"0"},{"from":"0","to":"1"},{"from":"0","to":"1"}]
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
                 * from : 53
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
             * direction : {"status":0,"unit":"°","value":[{"from":"158","to":"158"},{"from":"135","to":"0"},{"from":"0","to":"0"},{"from":"315","to":"315"},{"from":"225","to":"225"},{"from":"180","to":"180"},{"from":"315","to":"0"},{"from":"135","to":"90"},{"from":"315","to":"0"},{"from":"135","to":"180"},{"from":"135","to":"225"},{"from":"225","to":"315"},{"from":"225","to":"0"},{"from":"225","to":"0"},{"from":"315","to":"270"}]}
             * speed : {"status":0,"unit":"km/h","value":[{"from":"12.8","to":"12.8"},{"from":"20.0","to":"29.0"},{"from":"29.0","to":"0.0"},{"from":"20.0","to":"20.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"20.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"29.0","to":"0.0"},{"from":"20.0","to":"20.0"},{"from":"0.0","to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"29.0","to":"0.0"}]}
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
                 * value : [{"from":"158","to":"158"},{"from":"135","to":"0"},{"from":"0","to":"0"},{"from":"315","to":"315"},{"from":"225","to":"225"},{"from":"180","to":"180"},{"from":"315","to":"0"},{"from":"135","to":"90"},{"from":"315","to":"0"},{"from":"135","to":"180"},{"from":"135","to":"225"},{"from":"225","to":"315"},{"from":"225","to":"0"},{"from":"225","to":"0"},{"from":"315","to":"270"}]
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
                     * from : 158
                     * to : 158
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
                 * value : [{"from":"12.8","to":"12.8"},{"from":"20.0","to":"29.0"},{"from":"29.0","to":"0.0"},{"from":"20.0","to":"20.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"20.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"20.0","to":"0.0"},{"from":"29.0","to":"0.0"},{"from":"20.0","to":"20.0"},{"from":"0.0","to":"0.0"},{"from":"0.0","to":"0.0"},{"from":"29.0","to":"0.0"}]
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
                     * from : 12.8
                     * to : 12.8
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
         * aqi : {"brandInfo":{"brands":[{"brandId":"caiyun","logo":"http://f5.market.mi-img.com/download/MiSafe/07fa34263d698a7a9a8050dde6a7c63f8f243dbf3/a.webp","names":{"en_US":"彩云天气","zh_TW":"彩雲天氣","zh_CN":"彩云天气"},"url":""}]},"pubTime":"2019-03-19T13:00:00+08:00","status":0,"value":[202,177,151,134,121,116,117,120,121,124,126,130,134,134,131,125,121,120,122,125,129,130,125]}
         * desc : 逐小时预报
         * status : 0
         * temperature : {"pubTime":"2019-03-19T13:00:00+08:00","status":0,"unit":"℃","value":[19,22,22,22,22,22,21,20,19,18,16,14,14,12,11,10,9,8,6,6,8,10,11]}
         * weather : {"pubTime":"2019-03-19T13:00:00+08:00","status":0,"value":[53,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]}
         * wind : {"status":0,"value":[{"datetime":"2019-03-19T13:00:00.000+08:00","direction":"188.23","speed":"9.25"},{"datetime":"2019-03-19T14:00:00.000+08:00","direction":"203.2","speed":"12.46"},{"datetime":"2019-03-19T15:00:00.000+08:00","direction":"207.01","speed":"15.08"},{"datetime":"2019-03-19T16:00:00.000+08:00","direction":"203.99","speed":"16.14"},{"datetime":"2019-03-19T17:00:00.000+08:00","direction":"198.06","speed":"12.93"},{"datetime":"2019-03-19T18:00:00.000+08:00","direction":"188.93","speed":"10.78"},{"datetime":"2019-03-19T19:00:00.000+08:00","direction":"182.05","speed":"9.72"},{"datetime":"2019-03-19T20:00:00.000+08:00","direction":"183.51","speed":"9.82"},{"datetime":"2019-03-19T21:00:00.000+08:00","direction":"185.77","speed":"10.07"},{"datetime":"2019-03-19T22:00:00.000+08:00","direction":"190.18","speed":"11.38"},{"datetime":"2019-03-19T23:00:00.000+08:00","direction":"195.36","speed":"12.77"},{"datetime":"2019-03-20T00:00:00.000+08:00","direction":"198.63","speed":"12.87"},{"datetime":"2019-03-20T01:00:00.000+08:00","direction":"198.44","speed":"12.32"},{"datetime":"2019-03-20T02:00:00.000+08:00","direction":"195.32","speed":"11.91"},{"datetime":"2019-03-20T03:00:00.000+08:00","direction":"191.43","speed":"11.54"},{"datetime":"2019-03-20T04:00:00.000+08:00","direction":"197.62","speed":"11.49"},{"datetime":"2019-03-20T05:00:00.000+08:00","direction":"194.56","speed":"9.38"},{"datetime":"2019-03-20T06:00:00.000+08:00","direction":"197.28","speed":"9.78"},{"datetime":"2019-03-20T07:00:00.000+08:00","direction":"199.2","speed":"8.65"},{"datetime":"2019-03-20T08:00:00.000+08:00","direction":"206.21","speed":"7.38"},{"datetime":"2019-03-20T09:00:00.000+08:00","direction":"189.87","speed":"5.61"},{"datetime":"2019-03-20T10:00:00.000+08:00","direction":"169.89","speed":"5.43"},{"datetime":"2019-03-20T11:00:00.000+08:00","direction":"168.91","speed":"5.46"}]}
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
             * pubTime : 2019-03-19T13:00:00+08:00
             * status : 0
             * value : [202,177,151,134,121,116,117,120,121,124,126,130,134,134,131,125,121,120,122,125,129,130,125]
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
             * pubTime : 2019-03-19T13:00:00+08:00
             * status : 0
             * unit : ℃
             * value : [19,22,22,22,22,22,21,20,19,18,16,14,14,12,11,10,9,8,6,6,8,10,11]
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
             * pubTime : 2019-03-19T13:00:00+08:00
             * status : 0
             * value : [53,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2]
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
             * value : [{"datetime":"2019-03-19T13:00:00.000+08:00","direction":"188.23","speed":"9.25"},{"datetime":"2019-03-19T14:00:00.000+08:00","direction":"203.2","speed":"12.46"},{"datetime":"2019-03-19T15:00:00.000+08:00","direction":"207.01","speed":"15.08"},{"datetime":"2019-03-19T16:00:00.000+08:00","direction":"203.99","speed":"16.14"},{"datetime":"2019-03-19T17:00:00.000+08:00","direction":"198.06","speed":"12.93"},{"datetime":"2019-03-19T18:00:00.000+08:00","direction":"188.93","speed":"10.78"},{"datetime":"2019-03-19T19:00:00.000+08:00","direction":"182.05","speed":"9.72"},{"datetime":"2019-03-19T20:00:00.000+08:00","direction":"183.51","speed":"9.82"},{"datetime":"2019-03-19T21:00:00.000+08:00","direction":"185.77","speed":"10.07"},{"datetime":"2019-03-19T22:00:00.000+08:00","direction":"190.18","speed":"11.38"},{"datetime":"2019-03-19T23:00:00.000+08:00","direction":"195.36","speed":"12.77"},{"datetime":"2019-03-20T00:00:00.000+08:00","direction":"198.63","speed":"12.87"},{"datetime":"2019-03-20T01:00:00.000+08:00","direction":"198.44","speed":"12.32"},{"datetime":"2019-03-20T02:00:00.000+08:00","direction":"195.32","speed":"11.91"},{"datetime":"2019-03-20T03:00:00.000+08:00","direction":"191.43","speed":"11.54"},{"datetime":"2019-03-20T04:00:00.000+08:00","direction":"197.62","speed":"11.49"},{"datetime":"2019-03-20T05:00:00.000+08:00","direction":"194.56","speed":"9.38"},{"datetime":"2019-03-20T06:00:00.000+08:00","direction":"197.28","speed":"9.78"},{"datetime":"2019-03-20T07:00:00.000+08:00","direction":"199.2","speed":"8.65"},{"datetime":"2019-03-20T08:00:00.000+08:00","direction":"206.21","speed":"7.38"},{"datetime":"2019-03-20T09:00:00.000+08:00","direction":"189.87","speed":"5.61"},{"datetime":"2019-03-20T10:00:00.000+08:00","direction":"169.89","speed":"5.43"},{"datetime":"2019-03-20T11:00:00.000+08:00","direction":"168.91","speed":"5.46"}]
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
                 * datetime : 2019-03-19T13:00:00.000+08:00
                 * direction : 188.23
                 * speed : 9.25
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
         * indices : [{"type":"uvIndex","value":"5"},{"type":"humidity","value":"38"},{"type":"feelsLike","value":"18"},{"type":"pressure","value":"1008.0"},{"type":"carWash","value":"0"},{"type":"sports","value":"0"}]
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
             * value : 5
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
         * date : 2019-03-18T12:00:00+08:00
         * status : 0
         * sunRise : 2019-03-18T06:24:00+08:00
         * sunSet : 2019-03-18T18:23:00+08:00
         * tempMax : 21
         * tempMin : 6
         * weatherEnd : 0
         * weatherStart : 1
         * windDircEnd : 225
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
         * pubTime : 2019-03-19T11:00:00+08:00
         * so2 : 14
         * pm10Desc : PM10指的是直径小于或等于10微米的颗粒物，又称为可吸入颗粒物
         * o3 : 30
         * status : 0
         * no2Desc : 二氧化氮有刺激性特殊臭味，但浓度低时人体不会感知到
         * suggest : 空气很差，请减少外出，关闭门窗
         * so2Desc : 二氧化硫是一种无色气体，当空气中SO2达到一定浓度时，空气中会有刺鼻的气味
         * co : 1.55
         * o3Desc : 空气中过多臭氧可能导致呼吸问题，引发哮喘，降低肺功能并引起肺部疾病，对人类健康影响较大
         * no2 : 108
         * primary :
         * aqi : 210
         * pm10 : 221
         * coDesc : 一氧化碳八成来自汽车尾气，交通高峰期时，公路沿线产生的CO浓度会高于平常
         * src : 中国环境监测总站
         * pm25 : 160
         * pm25Desc : PM2.5能够在大气中停留很长时间，并可随呼吸进入体内，积聚在气管或肺中，影响身体健康
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
         * pubTime : 2019-03-19T12:00:00+08:00
         * wind : {"speed":{"unit":"km/h","value":"12.8"},"direction":{"unit":"°","value":"158"}}
         * humidity : {"unit":"%","value":"40"}
         * pressure : {"unit":"mb","value":"1008.0"}
         * visibility : {"unit":"km","value":""}
         * feelsLike : {"unit":"℃","value":"18"}
         * aqi : {"pubTime":"2019-03-19T11:00:00+08:00","so2":"10","pm10Desc":"PM10对人的影响要大于其他任何污染物，长期暴露于污染环境可能导致罹患心血管和呼吸道疾病甚至肺癌","o3":"26","status":0,"no2Desc":"短期浓度超过200微克/立方米时，二氧化氮是一种引起呼吸道严重发炎的有毒气体","suggest":"空气很差，请减少外出，关闭门窗","so2Desc":"二氧化硫是一种无色气体，当空气中SO2达到一定浓度时，空气中会有刺鼻的气味","co":"1.7","o3Desc":"地面的臭氧主要由车辆和工业释放出的氧化氮等污染物以及由机动车、溶剂和工业释放的挥发性有机化合物与阳光反应而生成","no2":"125","primary":"","aqi":"246","coDesc":"一氧化碳是无色，无臭，无味气体，但吸入对人体有十分大的危害","pm10":"273","pm25Desc":"PM2.5指的是直径小于或等于2.5微米的颗粒物，又称为细颗粒物","pm25":"196","src":"中国环境监测总站","brandInfo":{"brands":[{"logo":"","names":{"zh_TW":"中國環境監測總站","en_US":"CNEMC","zh_CN":"中国环境监测总站"},"brandId":"CNEMC","url":""}]}}
         * uvIndex : 5
         * weather : 53
         * temperature : {"unit":"℃","value":"18"}
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
             * speed : {"unit":"km/h","value":"12.8"}
             * direction : {"unit":"°","value":"158"}
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
                 * value : 12.8
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
                 * value : 158
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
             * value : 40
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
             * value : 1008.0
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
             * value : 18
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
             * pubTime : 2019-03-19T11:00:00+08:00
             * so2 : 10
             * pm10Desc : PM10对人的影响要大于其他任何污染物，长期暴露于污染环境可能导致罹患心血管和呼吸道疾病甚至肺癌
             * o3 : 26
             * status : 0
             * no2Desc : 短期浓度超过200微克/立方米时，二氧化氮是一种引起呼吸道严重发炎的有毒气体
             * suggest : 空气很差，请减少外出，关闭门窗
             * so2Desc : 二氧化硫是一种无色气体，当空气中SO2达到一定浓度时，空气中会有刺鼻的气味
             * co : 1.7
             * o3Desc : 地面的臭氧主要由车辆和工业释放出的氧化氮等污染物以及由机动车、溶剂和工业释放的挥发性有机化合物与阳光反应而生成
             * no2 : 125
             * primary :
             * aqi : 246
             * coDesc : 一氧化碳是无色，无臭，无味气体，但吸入对人体有十分大的危害
             * pm10 : 273
             * pm25Desc : PM2.5指的是直径小于或等于2.5微米的颗粒物，又称为细颗粒物
             * pm25 : 196
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
             * value : 18
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
         * type : CWA
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
