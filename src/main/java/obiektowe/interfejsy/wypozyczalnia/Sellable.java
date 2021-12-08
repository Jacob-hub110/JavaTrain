package obiektowe.interfejsy.wypozyczalnia;

import java.math.BigDecimal;

//Dziedziczenie w interfejsach to troche zbieranie wymagan. Czyli wymagania z Rentable + te z Sellable
public interface Sellable extends Rentable {

    String interfaceName = "Sellable";

    BigDecimal bruttoPrice();

    static void staticMethod() {
        System.out.println("some method...");
    }

    //Roznica miedzy default a static jest taka, ze defaultowa moze zostac nadpisana
    default void defaultMethod() {
        System.out.println("some override method...");
    }

}
