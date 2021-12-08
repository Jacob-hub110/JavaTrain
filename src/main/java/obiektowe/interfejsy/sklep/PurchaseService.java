package obiektowe.interfejsy.sklep;

import java.util.Scanner;

public class PurchaseService {

    public void writePIN(){
        System.out.println("Podaj pin aby zaplacic za zakupy:");
        Scanner scanner = new Scanner(System.in);
        int creditPIN = scanner.nextInt();
        System.out.println("Zaplacono!");
    }
}
