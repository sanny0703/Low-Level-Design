package observer;

import observable.WeatherStation;

public class MobileDisplay implements Observer, Display {
    private final WeatherStation weatherStation;

    public MobileDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.addObserver(this);
    }

    @Override
    public void displayWeather(int temperature) {
        System.out.println("Small Temperature: " + temperature);
    }

    @Override
    public void update() {
        displayWeather(weatherStation.getTemperature());
    }
}
