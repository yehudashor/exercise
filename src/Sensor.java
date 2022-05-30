public abstract class Sensor extends Observable<Integer> {
    public Sensor(int _interval) {
        interval = _interval;
        type = this.getClass().getSimpleName();
    }

    protected int interval;
    protected String type;
    protected int lastReading;

    protected abstract int read();

    protected void check() {
        int _read = read();
        if (_read != lastReading) {
            lastReading = _read;
            notifyChanges(_read);
        }
    }

}
