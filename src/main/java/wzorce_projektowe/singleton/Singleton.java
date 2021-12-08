package wzorce_projektowe.singleton;

//https://devcave.pl/effective-java/wzorzec-projektowy-singleton
//lazy-loading singleton
public class Singleton {

    private static Singleton INSTANCE;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;
    }

}
