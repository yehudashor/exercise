public class MS_PressureObserver extends MS_Observer<Integer> {

    public MS_PressureObserver(MonitoringScreen monitoringScreen) {
        super(monitoringScreen);
    }

    @Override
    public void update(Integer data) {
        monitoringScreen.displayPressure(data);
    }
}
