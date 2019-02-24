package Singleton;

public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused" + "\n\nRESULT:");
        Singleton singleton = Singleton.getInstance("First");
        Singleton anotherSingleton = Singleton.getInstance("Second");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
