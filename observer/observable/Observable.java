package observable;

import observer.Observer;

public interface Observable {
    boolean addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
