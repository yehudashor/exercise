// Base class for sensors.
public abstract class Sensor extends Observable<Integer> {
    public Sensor(int _interval, String _type) {
        interval = _interval;
        type = _type;
    }

    protected int interval;
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
