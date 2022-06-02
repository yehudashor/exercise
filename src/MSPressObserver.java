public class MSPressObserver extends MSObserver<Integer> {

    public MSPressObserver(MonitoringScreen monitoringScreen) {
        super(monitoringScreen);
    }

    @Override
    public void update(Integer data) {
        monitoringScreen.displayPressure(data);
    }
}
