public abstract class PressureSensor extends Sensor {

    private final int minPressure = 950;
    private final int maxPressure = 1050;

    public PressureSensor(int _interval, String _type) {
        super(_interval, _type);
    }

    @Override
    public int read() {
        return RandomSupplier.getRnd().nextInt(maxPressure - minPressure) + minPressure;
    }
}
