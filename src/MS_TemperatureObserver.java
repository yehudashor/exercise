public class MS_TemperatureObserver extends MS_Observer<Integer> {

    public MS_TemperatureObserver(MonitoringScreen _monitoringScreen) {
        super(_monitoringScreen);
    }

    @Override
    public void update(Integer data) {
        monitoringScreen.displayTemperature(data);
    }
}
