import observable.WeatherStation;
import observer.Display;
import observer.MobileDisplay;
import observer.TvDisplay;

public class Test {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Display tv = new TvDisplay(weatherStation);
        Display phone = new MobileDisplay(weatherStation);
        // both tv and phone displays will listen to every update from weatherStation
        weatherStation.setTemperature(100);
        weatherStation.setTemperature(50);
    }
}
