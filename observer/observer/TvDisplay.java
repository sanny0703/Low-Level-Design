package observer;

import observable.WeatherStation;

public class TvDisplay implements Observer, Display {
    private final WeatherStation weatherStation;

    public TvDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void displayWeather(int temperature) {
        System.out.println("Large Temperature: " + temperature);
    }

    @Override
    public void update() {
        displayWeather(weatherStation.getTemperature());
    }
}
