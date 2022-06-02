enum Trend {
    RISING, FALLING, STABLE
}

// Class Pressure Trend Sensor that notify from pressure sensor.
public class PressureTrendSensor extends Observable<Trend> implements Observer {
    // 3 lastReadings.
    private int lastReading1;
    private int lastReading2;
    private int lastReading3;

    private int countUpdate;

    // The currentTrend.
    private Trend currentTrend;

    // The lastTrend.
    private Trend lastTrend = Trend.STABLE;

    public PressureTrendSensor(WeatherMonitoringSystem weatherMonitoringSystem) {
        // add Observer PressureSensor to PressureSensor.
        weatherMonitoringSystem.addObserverPressureSensor(this);
    }

    // init Last Reading.
    public void initLastReading(int pressureSensor) {
        switch (countUpdate) {
            case 0:
                lastReading1 = pressureSensor;
                break;

            case 1:
                lastReading2 = pressureSensor;
                break;

            case 2: {
                lastReading3 = pressureSensor;
                // check if there is update.
                check();

                // swap Readings.
                lastReading1 = lastReading2;
                lastReading2 = lastReading3;
                return;
            }
        }
        countUpdate++;
    }

    public void check() {
        calc();
        if (lastTrend != currentTrend) {
            lastTrend = currentTrend;
            notifyChanges(currentTrend);
        }
    }

    // Function that check if there is change in the trend.
    public void calc() {
        currentTrend = Trend.STABLE;
        if (lastReading3 > lastReading2 && lastReading2 > lastReading1) {
            currentTrend = Trend.RISING;
        } else if (lastReading1 > lastReading2 && lastReading2 > lastReading3) {
            currentTrend = Trend.FALLING;
        }
    }

    // Function for update.
    @Override
    public void update(Object data) {
        initLastReading((int) data);
    }


    @Override
    public String getType() {
        return type;
    }
}
