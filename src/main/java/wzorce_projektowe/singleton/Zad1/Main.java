package wzorce_projektowe.singleton.Zad1;

public class Main {
    public static void main(String[] args) {
        DbManager dbManager = DbManager.getInstance();
        dbManager.establishConnection();
        dbManager.endConnection();
    }
}
