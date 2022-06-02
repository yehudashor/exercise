
import java.util.ArrayList;

// Class that represent Alarm Clock design pattern.
public class AlarmClock {
    public final int CLOCK_INTERVAL_MILLIS = 100;
    protected static AlarmClock instance = null;

    // List of AlarmClockRecord Objects that envelop objects that need to be timed.
    private ArrayList<AlarmClockRecord> itsAlarmClockRecords;

    protected AlarmClock() {
        itsAlarmClockRecords = new ArrayList();
    }

    //Singleton design pattern.
    public static AlarmClock theInstance() {
        if (null == instance)
            instance = new AlarmClock();
        return instance;
    }

    // Tic function call all CLOCK_INTERVAL_MILLIS time. and calculate for all alarmListeners
    // if interval time's up and if yes call to wake up function.
    protected void tic() {

        for (AlarmClockRecord alarmClockRecord : itsAlarmClockRecords) {
            // if interval time's up and if yes call to wake up function .
            if (alarmClockRecord.currentInterval - CLOCK_INTERVAL_MILLIS <= 0) {
                alarmClockRecord.currentInterval = alarmClockRecord.interval;
                alarmClockRecord.alarmListener.wakeUp();
            }
            // else down from dynamic interval CLOCK_INTERVAL_MILLIS.
            else {
                alarmClockRecord.currentInterval -= CLOCK_INTERVAL_MILLIS;
            }
        }
    }

    // Add Listener new AlarmClockRecord.
    public void register(int interval, AlarmListener pal) {
        PrintSystem.printRegisteredToClock(pal.getType());
        itsAlarmClockRecords.add(new AlarmClockRecord(interval, pal));
    }
}

