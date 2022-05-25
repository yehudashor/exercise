public abstract class Sensor extends Observable {
    public Sensor(int _interval, String _type){
        interval = _interval;
        type = _type;
    }
    protected int interval;
    protected String type;
    protected int lastReading;
    protected abstract int read();

    protected void check(){
        int _read = read();
        if(_read != lastReading){
            lastReading = _read;
            notifyChanges(_read);
        }
    }

}
