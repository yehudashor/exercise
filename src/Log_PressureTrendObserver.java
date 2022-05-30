public class Log_PressureTrendObserver extends Log_Observer<Trend> {

    public Log_PressureTrendObserver(Log log) {
        super(log);
    }

    @Override
    public void update(Trend data) {
        log.DisplayTrendPressure(data);
    }
}
