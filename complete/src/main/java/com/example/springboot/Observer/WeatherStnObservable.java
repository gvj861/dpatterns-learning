package com.example.springboot.Observer;

public interface WeatherStnObservable {

    void add(WeatherStObserver observer);

    void remove(WeatherStObserver observer);

    void notifyObservers();

    WeatherDomainData getData();

}
