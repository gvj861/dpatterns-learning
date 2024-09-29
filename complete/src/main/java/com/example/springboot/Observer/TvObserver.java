package com.example.springboot.Observer;

public class TvObserver implements WeatherStObserver{

    private WeatherStnObservable weatherStnObservable;

    public TvObserver(WeatherStnObservable weatherStation) {
        this.weatherStnObservable = weatherStation;
    }

    /**
     *
     */
    @Override
    public void update() {
        WeatherDomainData weatherDomainData = this.weatherStnObservable.getData();
        System.out.println(weatherDomainData.toString());
    }
}
