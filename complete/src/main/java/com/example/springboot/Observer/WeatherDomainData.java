package com.example.springboot.Observer;

public class WeatherDomainData {

    private String temperature;
    private String humidity;

    public WeatherDomainData(String temparature, String humidity) {
        this.temperature = temparature;
        this.humidity = humidity;
    }

    public String getWeatherData() {
        return this.temperature + "-" + this.humidity;
    }

    public void setWeather(String temperature, String humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

}
