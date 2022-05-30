enum Trend {
    RISING, FALLING, STABLE
}

public class PressureTrendSensor extends Observable<Trend> implements Observer {
    public PressureTrendSensor(WeatherMonitoringSystem weatherMonitoringSystem) {
        type = this.getClass().getSimpleName();
        weatherMonitoringSystem.addObserverPressureSensor(this, this.getClass().getSimpleName());
    }

    protected String type;

    private int lastReading1;
    private int lastReading2;
    private int lastReading3;
    private int countUpdate = 0;
    private Trend currentTrend;
    private Trend lastTrend = Trend.STABLE;

    public void initLastReading(int pressureSensor) {
        switch (countUpdate) {
            case 0 -> lastReading1 = pressureSensor;
            case 1 -> lastReading2 = pressureSensor;
            case 2 -> {
                lastReading3 = pressureSensor;
                countUpdate = 0;
                check();
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

    public void calc() {
        currentTrend = Trend.STABLE;
        if (lastReading3 > lastReading2 && lastReading2 > lastReading1) {
            currentTrend = Trend.RISING;
        } else if (lastReading1 > lastReading2 && lastReading2 > lastReading3) {
            currentTrend = Trend.FALLING;
        }
    }

    @Override
    public void update(Object data) {
        initLastReading((int) data);
    }
}
