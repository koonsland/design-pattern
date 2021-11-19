package singleton.example_2;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {}

    public static Singleton getInstance() {
        return new Singleton();
    }
}
