public abstract class TemperatureSensor extends Sensor {

    private final int maxTemperature = 40;

    public TemperatureSensor(int _interval, String _type) {
        super(_interval, _type);
        AlarmClock.theInstance().register(_interval, new TemperatureSensorAlarmListener(this));
    }

    @Override
    protected int read() {
        return RandomSupplier.getRnd().nextInt(maxTemperature);
    }
}
