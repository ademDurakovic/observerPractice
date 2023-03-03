public class Driver{

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        Observer CurrentConditionsDisplay = new CurrentConditionsDisplay(station);

        station.setTemps(100,15);




    }
}