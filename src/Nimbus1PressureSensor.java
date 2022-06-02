// class of Nimbus1PressureSensor.
public class Nimbus1PressureSensor extends Sensor {

    // min Pressure.
    private final int minPressure = 950;

    // max Pressure.
    private final int maxPressure = 1050;

    public Nimbus1PressureSensor(int _interval, WeatherMonitoringSystem weatherMonitoringSystem) {
        super(_interval, "pressure");

        // Add Listener new AlarmClockRecord to Alarm clock.
        weatherMonitoringSystem.nimbus1Clock.register(_interval, new SensorAlarmListener(this));
    }

    // read the Pressure between 950 - 1050.
    @Override
    public int read() {
        return RandomSupplier.getRnd().nextInt(maxPressure - minPressure) + minPressure;
    }

}
