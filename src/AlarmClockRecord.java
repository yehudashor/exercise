
// Class that wrap AlarmListener implementations.
public class AlarmClockRecord {

    // AlarmListener
    public AlarmListener alarmListener;

    // static interval
    public int interval;

    // dynamic interval
    public int currentInterval;

    public AlarmClockRecord(int _interval, AlarmListener _alarmListener) {
        alarmListener = _alarmListener;
        interval = _interval;
        currentInterval = interval;
    }
}
