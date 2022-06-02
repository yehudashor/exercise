// Class log.
public class Log extends Type implements DisplayPressure, DisplayTrendPressure {

    public Log(WeatherMonitoringSystem weatherMonitoringSystem) {
        PrintSystem.printCreatObject(type);

        // add new LogPressObserver to Pressure Sensor.
        weatherMonitoringSystem.addObserverPressureSensor(new LogPressObserver(this));

        // add new LogPressObserver to Pressure Trend Sensor.
        weatherMonitoringSystem.addObserverPressureTrendSensor(new LogPressTrendObserver(this));
    }

    @Override
    public void displayPressure(int pressure) {
        System.out.println(type + ": pressure = " + pressure + " millibars");
    }

    @Override
    public void DisplayTrendPressure(Trend trend) {
        System.out.println(type + ": pressure trend = " + trend);
    }
}
