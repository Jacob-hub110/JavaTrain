package wzorce_projektowe.singleton;

public class Main {

    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton);
        System.out.println(singleton2);
    }

}
