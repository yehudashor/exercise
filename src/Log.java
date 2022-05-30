public class Log implements DisplayPressure, DisplayTrendPressure {
    private final String type = this.getClass().getSimpleName() + " ";

    public Log(WeatherMonitoringSystem weatherMonitoringSystem) {
        String className = this.getClass().getSimpleName();
        PrintSystem.printCreatObject(className);

        weatherMonitoringSystem.addObserverPressureSensor(new Log_PressureObserver(this), className);
        weatherMonitoringSystem.addObserverPressureTrendSensor(new Log_PressureTrendObserver(this), className);
    }

    @Override
    public void displayPressure(int pressure) {
        System.out.println(type + "pressure = " + pressure + " millibars");
    }

    @Override
    public void DisplayTrendPressure(Trend trend) {
        System.out.println(type + " pressure = " + trend);
    }
}
