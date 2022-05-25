import java.util.ArrayList;

public class Observable {

    public ArrayList<Observer> observers;

    public Observable(){
        observers = new ArrayList<>();
    }

    public void notifyChanges(int data){
        for (Observer observer: observers) {
            observer.update(data);
        }
    }

    public void AddObserver(Observer observer){
        if(!observers.contains(observer)){
            observers.add(observer);
        }
    }

    public void RemoveObserver(Observer observer){
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }
}
