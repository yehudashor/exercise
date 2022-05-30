public class PrintSystem {

    private static final String create = " was created";
    private static final String observes = " observes ";
    private static final String Registered = " registered to clock";

    public static void printCreatObject(String objectName) {
        printMessage(objectName + create);
    }

    public static void printObservesToSensors(String objectName, String sensorName) {
        printMessage(objectName + observes + sensorName);
    }

    public static void printRegisteredToClock(String objectName) {
        printMessage(objectName + Registered);
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }
}
