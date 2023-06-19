package creational.singleton.homework;

public class LoggerDemo {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();
        Logger log3 = Logger.getInstance();

        log1.log("Logger 1");
        log2.log("Logger 2");
        log3.log("Logger 3");
    }
}
