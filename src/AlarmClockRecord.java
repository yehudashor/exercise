public class AlarmClockRecord {
    public AlarmListener alarmListener;
    public int interval;
    public int currentInterval;
    public AlarmClockRecord(int _interval, AlarmListener _alarmListener) {
        alarmListener = _alarmListener;
        interval = _interval;
        currentInterval = interval;
    }
}
