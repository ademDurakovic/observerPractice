//going to be the observer

public class CurrentConditionsDisplay implements Observer{

    private int temp;
    private int humid;

    public CurrentConditionsDisplay(Subject station){
        station.register(this);

    }

    public void update(int temp, int humidity){
        this.temp = temp;
        this.humid = humidity;
        displayConditions();
    }

    public void displayConditions(){
        System.out.println("Temp: "+ this.temp + " Humidity: " + this.humid);
    }
}