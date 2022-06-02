// Class for init the system/
public class WeatherMonitoringSystem {

    private static WeatherMonitoringSystem weatherMonitoringSystem;
    private Nimbus1TemperatureSensor temperatureSensor;
    private Nimbus1PressureSensor pressureSensor;
    private PressureTrendSensor pressureTrendSensor;

    public AlarmClock nimbus1Clock;

    private WeatherMonitoringSystem() {
        PrintSystem.printCreatObject(this.getClass().getSimpleName());
        nimbus1Clock = Nimbus1Clock.theInstance();
        pressureSensor = new Nimbus1PressureSensor(1100, this);
        temperatureSensor = new Nimbus1TemperatureSensor(700, this);
        pressureTrendSensor = new PressureTrendSensor(this);
    }

    public static WeatherMonitoringSystem theInstance() {
        if (weatherMonitoringSystem == null) {
            weatherMonitoringSystem = new WeatherMonitoringSystem();
        }
        return weatherMonitoringSystem;
    }

    // Function for add Observer Temperature Sensor.
    public void addObserverTemperatureSensor(Observer observer) {
        PrintSystem.printObservesToSensors(observer.getType(), temperatureSensor.getType());
        temperatureSensor.AddObserver(observer);
    }

    // Function for add Observer Pressure Sensor.
    public void addObserverPressureSensor(Observer observer) {
        PrintSystem.printObservesToSensors(observer.getType(), pressureSensor.getType());
        pressureSensor.AddObserver(observer);
    }

    // Function for add Observer Pressure Trend Sensor.
    public void addObserverPressureTrendSensor(Observer observer) {
        PrintSystem.printObservesToSensors(observer.getType(), "pressure trend");
        pressureTrendSensor.AddObserver(observer);
    }

}
