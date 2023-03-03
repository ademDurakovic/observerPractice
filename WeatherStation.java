//going to be the SUBJECT that observers are subscribed to.

import java.util.ArrayList;

public class WeatherStation implements Subject{

    ArrayList < Observer > observers;  //holds all observers.
    private int temp;
    private int humidity;

    public WeatherStation(){
        System.out.println("Weather Station Created.");
        observers = new ArrayList<Observer>();
    }

    public void register(Observer o){
        observers.add(o);
    }

    public void unregister(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(this.temp, this.humidity);
        }
    }

    public void setTemps(int temper, int humid){
        this.humidity = humid;
        this.temp = temper;
        notifyObservers();  //notify them that temps have chamged
    }
}