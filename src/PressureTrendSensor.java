import java.util.Arrays;

enum Trend {
    Ascending, descending, stable
}

public class PressureTrendSensor extends Observable implements Observer {
    private int lastReading1;
    private int lastReading2;
    private int lastReading3;
    private int countUpdate = 0;
    private Trend currentTrend = Trend.stable;
    private Trend lastTrend;
    public void initLastReading(int pressureSensor) {
        switch (countUpdate) {
            case 0:
                lastReading1 = pressureSensor;
                break;

            case 1:
                lastReading2 = pressureSensor;
                break;

            case 2:
                lastReading3 = pressureSensor;
                break;

            default:
                lastReading1 = lastReading2;
                lastReading2 = lastReading3;
                lastReading3 = pressureSensor;
                return;
        }
        countUpdate++;
        countUpdate++;
    }

    public void update(int pressureSensor) {
        initLastReading(pressureSensor);
    }

    public void check(){
            lastTrend = currentTrend;
            calc();
            if(lastTrend != currentTrend){
                notifyChanges(lastReading3);
            }
    }
    public void calc() {
        if (countUpdate > 1) {
            if (lastReading3 > lastReading2 && lastReading2 > lastReading1) {
                currentTrend = Trend.Ascending;
            } else if (lastReading1 > lastReading2 && lastReading2 > lastReading3) {
                currentTrend = Trend.descending;
            }
        }
    }
}
