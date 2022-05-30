public class PressureSensorAlarmListener implements AlarmListener {
    public PressureSensor pressureSensor;

    public PressureSensorAlarmListener(PressureSensor _pressureSensor) {
        PrintSystem.printCreatObject(this.getClass().getSimpleName());
        pressureSensor = _pressureSensor;
    }

    @Override
    public void wakeUp() {
        if (pressureSensor != null) {
            pressureSensor.check();
        }
    }

    @Override
    public String getType() {
        return pressureSensor.type;
    }
}
