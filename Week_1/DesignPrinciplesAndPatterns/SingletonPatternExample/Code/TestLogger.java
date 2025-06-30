public class TestLogger {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log.");
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log.");
        System.out.println("Are both loggers same instance? " + (logger1 == logger2));
    }
}
