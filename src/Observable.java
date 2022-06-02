import java.util.ArrayList;
import java.util.List;

// Class for Observable design pattern.
public abstract class Observable<T> extends Type {

    // The Observers.
    private List<Observer> observers;


    public Observable() {
        observers = new ArrayList<>();
    }

    // function for notify changes in the Observables.
    public <T> void notifyChanges(T data) {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }

    // Add new Observer.
    public void AddObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    // Delete Observer.
    public void RemoveObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }
}
