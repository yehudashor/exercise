public class PressureSensor extends Sensor {

    private final int minPressure = 950;
    private final int maxPressure = 1050;

    public PressureSensor(int _interval, WeatherMonitoringSystem weatherMonitoringSystem) {
        super(_interval);
        weatherMonitoringSystem.nimbus1Clock.register(_interval, new PressureSensorAlarmListener(this));
    }

    @Override
    public int read() {
        return RandomSupplier.getRnd().nextInt(maxPressure - minPressure) + minPressure;
    }
}
