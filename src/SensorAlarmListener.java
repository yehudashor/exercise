// Class that warp Sensors and wake up the check function.
public class SensorAlarmListener implements AlarmListener {
    private Sensor sensor;

    public SensorAlarmListener(Sensor _sensor) {
        sensor = _sensor;
    }

    @Override
    public void wakeUp() {
        if (sensor != null) {
            sensor.check();
        }
    }

    @Override
    public String getType() {
        return sensor.type;
    }
}
