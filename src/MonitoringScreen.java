import java.text.Format;
import java.text.MessageFormat;

public class MonitoringScreen implements DisplayTemperature, DisplayPressure {
    private final String type = this.getClass().getSimpleName() + " ";

    public MonitoringScreen(WeatherMonitoringSystem weatherMonitoringSystem) {
        PrintSystem.printCreatObject(type);

        weatherMonitoringSystem.
                addObserverTemperatureSensor(new MS_TemperatureObserver(this),
                        type);

        weatherMonitoringSystem.addObserverPressureSensor
                (new MS_PressureObserver(this),
                        type);
    }

    @Override
    public void displayTemperature(int temperature) {
        System.out.println(type + " temperature = " + temperature + " Celsius");
    }

    @Override
    public void displayPressure(int pressure) {
        System.out.println(type + " pressure = " + pressure + " millibars");
    }
}
