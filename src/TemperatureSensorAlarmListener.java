public class TemperatureSensorAlarmListener implements AlarmListener {

    public TemperatureSensor temperatureSensor;

    public TemperatureSensorAlarmListener(TemperatureSensor _temperatureSensor) {
        PrintSystem.printCreatObject(this.getClass().getSimpleName());
        temperatureSensor = _temperatureSensor;
    }

    @Override
    public void wakeUp() {
        if (temperatureSensor != null) {
            temperatureSensor.check();
        }
    }

    @Override
    public String getType() {
        return temperatureSensor.type;
    }
}
