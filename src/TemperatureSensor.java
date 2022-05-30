public class TemperatureSensor extends Sensor {

    private final int maxTemperature = 40;

    public TemperatureSensor(int _interval, WeatherMonitoringSystem weatherMonitoringSystem) {
        super(_interval);
        weatherMonitoringSystem.nimbus1Clock.register(_interval, new TemperatureSensorAlarmListener(this));
    }

    @Override
    protected int read() {
        return RandomSupplier.getRnd().nextInt(maxTemperature);
    }
}
