package creational.singleton.homework;

public class Logger {
    private static volatile Logger loggerInstance;

    public static Logger getInstance() {
        Logger result = loggerInstance;
        if (result == null) {
            synchronized (Logger.class) {
                result = loggerInstance;
                if (result == null) {
                    loggerInstance = result = new Logger();
                }
            }
        }
        return result;
    }

    public void log(String message) {
        System.out.println(message);
    }
}
