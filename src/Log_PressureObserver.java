public class Log_PressureObserver extends Log_Observer<Integer> {
    public Log_PressureObserver(Log log) {

        super(log);
    }

    @Override
    public void update(Integer data) {
        log.displayPressure(data);
    }
}
