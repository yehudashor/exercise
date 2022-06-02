public abstract class MSObserver<T> extends Type implements Observer<T> {
    protected MonitoringScreen monitoringScreen;

    public MSObserver(MonitoringScreen _monitoringScreen) {
        PrintSystem.printCreatObject(type);
        monitoringScreen = _monitoringScreen;
    }
}
