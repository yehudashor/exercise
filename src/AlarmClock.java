
import java.util.ArrayList;

public class AlarmClock {
    public final int CLOCK_INTERVAL_MILLIS = 100;
    protected static AlarmClock instance = null;
    private ArrayList<AlarmClockRecord> itsAlarmClockRecords = new ArrayList();

    protected AlarmClock() {
        PrintSystem.printCreatObject(this.getClass().getSimpleName());
    }

    public static AlarmClock theInstance() {
        if (null == instance)
            instance = new AlarmClock();
        return instance;
    }

    protected void tic() {
        for (AlarmClockRecord alarmClockRecord : itsAlarmClockRecords) {
            if (alarmClockRecord.currentInterval - CLOCK_INTERVAL_MILLIS <= 0) {
                alarmClockRecord.alarmListener.wakeUp();
            } else {
                alarmClockRecord.currentInterval -= CLOCK_INTERVAL_MILLIS;
            }
        }
    }

    public void register(int interval, AlarmListener pal) {
        PrintSystem.printRegisteredToClock(pal.getType());
        itsAlarmClockRecords.add(new AlarmClockRecord(interval, pal));
    }
}

