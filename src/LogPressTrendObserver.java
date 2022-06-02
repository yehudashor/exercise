public class LogPressTrendObserver extends LogObserver<Trend> {

    public LogPressTrendObserver(Log log) {
        super(log);
    }

    @Override
    public void update(Trend data) {
        log.DisplayTrendPressure(data);
    }
}
