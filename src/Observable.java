import java.util.ArrayList;
import java.util.HashSet;

public class Observable<T> {

    public HashSet<Observer> observers;

    public Observable() {
        PrintSystem.printCreatObject(this.getClass().getSimpleName());
        observers = new HashSet<>();
    }

    public <T> void notifyChanges(T data) {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }

    public void AddObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void RemoveObserver(Observer observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }
}
