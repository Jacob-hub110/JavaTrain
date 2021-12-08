package wzorce_projektowe.singleton.Zad1;

public class DbManager {

    private static DbManager INSTANCE;

    private DbManager() {
    }

    public static DbManager getInstance() {
        if (INSTANCE == null){
            INSTANCE = new DbManager();
        }
        return INSTANCE;
    }

    public void establishConnection(){
        System.out.println("Nawiązałem połączenie");
    }
    public void endConnection() {
        System.out.println("Zerwałem połączenie");
    }
}
