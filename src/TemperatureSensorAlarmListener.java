public class TemperatureSensorAlarmListener implements AlarmListener {

    public TemperatureSensor temperatureSensor;

    public TemperatureSensorAlarmListener(TemperatureSensor _temperatureSensor) {
        temperatureSensor = _temperatureSensor;
    }

    @Override
    public void wakeUp() {
        if(temperatureSensor != null){
            temperatureSensor.check();
        }
    }
}
