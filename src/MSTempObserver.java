public class MSTempObserver extends MSObserver<Integer> {

    public MSTempObserver(MonitoringScreen _monitoringScreen) {
        super(_monitoringScreen);
    }

    @Override
    public void update(Integer data) {
        monitoringScreen.displayTemperature(data);
    }
}
