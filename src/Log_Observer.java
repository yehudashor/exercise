public abstract class Log_Observer<T> implements Observer<T> {
    protected Log log;

    public Log_Observer(Log _log) {
        PrintSystem.printCreatObject(this.getClass().getSimpleName());
        log = _log;
    }
}
