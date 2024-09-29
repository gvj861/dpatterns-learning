package com.example.springboot.Observer;

import java.util.ArrayList;
import java.util.List;

public class VskpWeatherStn implements WeatherStnObservable {

    private final List<WeatherStObserver> weatherStObserverList = new ArrayList<>();
    private WeatherDomainData weatherDomainData;
    /**
     * @param observer
     */
    @Override
    public void add(WeatherStObserver observer) {
        weatherStObserverList.add(observer);
    }

    /**
     * @param observer
     */
    @Override
    public void remove(WeatherStObserver observer) {
        weatherStObserverList.remove(observer);
    }

    /**
     *
     */
    @Override
    public void notifyObservers() {
        for (WeatherStObserver observer : weatherStObserverList) {
            observer.update();
        }
    }

    public void setData(WeatherDomainData wtd) {
        this.weatherDomainData = wtd;
        notifyObservers();
    }

    @Override
    public WeatherDomainData getData() {
        return this.weatherDomainData;
    }
}
