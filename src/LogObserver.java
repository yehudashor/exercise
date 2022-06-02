public abstract class LogObserver<T> extends Type implements Observer<T> {
    protected Log log;

    public LogObserver(Log _log) {
        PrintSystem.printCreatObject(type);
        log = _log;
    }
}
