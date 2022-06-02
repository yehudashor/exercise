public class Nimbus1TemperatureSensor extends Sensor {
    // max Temperature.
    private final int maxTemperature = 40;

    public Nimbus1TemperatureSensor(int _interval, WeatherMonitoringSystem weatherMonitoringSystem) {
        super(_interval, "temperature");

        // Add Listener new AlarmClockRecord to Alarm clock.
        weatherMonitoringSystem.nimbus1Clock.register(_interval, new SensorAlarmListener(this));
    }

    // read the Pressure between 0 - 40.
    @Override
    protected int read() {
        return RandomSupplier.getRnd().nextInt(maxTemperature);
    }
}
