package observable;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {
    private final List<Observer> observers = new ArrayList<>();
    private int temperature;

    @Override
    public boolean addObserver(Observer observer) {
        return observers.add(observer);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update();
    }
}
