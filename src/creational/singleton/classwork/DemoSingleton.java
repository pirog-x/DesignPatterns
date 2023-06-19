package creational.singleton.classwork;

public class DemoSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("cat");
        Singleton singleton2 = Singleton.getInstance("dog");
        Singleton singleton3 = Singleton.getInstance("cat");
        Singleton singleton4 = Singleton.getInstance("fish");

    }
}
