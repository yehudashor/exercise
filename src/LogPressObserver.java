public class LogPressObserver extends LogObserver<Integer> {
    public LogPressObserver(Log log) {
        super(log);
    }

    @Override
    public void update(Integer data) {
        log.displayPressure(data);
    }
}
