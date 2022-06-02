// Class for Monitoring Screen.
public class MonitoringScreen extends Type implements DisplayTemperature, DisplayPressure {

    public MonitoringScreen(WeatherMonitoringSystem weatherMonitoringSystem) {
        PrintSystem.printCreatObject(getType());

        // add new LogPressObserver to Temperature Sensor.
        weatherMonitoringSystem.addObserverTemperatureSensor(new MSTempObserver(this));

        // add new LogPressObserver to Pressure Sensor.
        weatherMonitoringSystem.addObserverPressureSensor(new MSPressObserver(this));
    }

    @Override
    public void displayTemperature(int temperature) {
        System.out.println(type + ": temperature = " + temperature + " Celsius");
    }

    @Override
    public void displayPressure(int pressure) {
        System.out.println(type + ": pressure = " + pressure + " millibars");
    }
}
