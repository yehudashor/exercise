public class WeatherMonitoringSystem {

    private static WeatherMonitoringSystem weatherMonitoringSystem;
    private TemperatureSensor temperatureSensor;
    private PressureSensor pressureSensor;
    private PressureTrendSensor pressureTrendSensor;

    public AlarmClock nimbus1Clock;

    private WeatherMonitoringSystem() {
        nimbus1Clock = Nimbus1Clock.theInstance();
        PrintSystem.printCreatObject(this.getClass().getSimpleName());
        temperatureSensor = new TemperatureSensor(700, this);
        pressureSensor = new PressureSensor(1100, this);
        pressureTrendSensor = new PressureTrendSensor(this);
    }

    public static WeatherMonitoringSystem theInstance() {
        if (weatherMonitoringSystem == null) {
            weatherMonitoringSystem = new WeatherMonitoringSystem();
        }
        return weatherMonitoringSystem;
    }

    public void addObserverTemperatureSensor(Observer observer, String objectName) {
        PrintSystem.printObservesToSensors(objectName, temperatureSensor.type);
        temperatureSensor.AddObserver(observer);
    }

    public void addObserverPressureSensor(Observer observer, String objectName) {
        PrintSystem.printObservesToSensors(objectName, pressureSensor.type);
        pressureSensor.AddObserver(observer);
    }

    public void addObserverPressureTrendSensor(Observer observer, String objectName) {
        PrintSystem.printObservesToSensors(objectName, pressureTrendSensor.type);
        pressureTrendSensor.AddObserver(observer);
    }

}
