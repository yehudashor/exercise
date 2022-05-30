public abstract class MS_Observer<T> implements Observer<T> {
    protected MonitoringScreen monitoringScreen;

    public MS_Observer(MonitoringScreen _monitoringScreen) {
        PrintSystem.printCreatObject(this.getClass().getSimpleName());
        monitoringScreen = _monitoringScreen;
    }
}
