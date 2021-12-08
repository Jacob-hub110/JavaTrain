package streamy.zadanie1;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Stwórz klasę Room(miasto, metraż, cena, odległość od centrum),
 * reprezentującą pokój na wynajem.
 *
 * 2. Stwórz klasę AuctionHouse zawierającą listę pokoi do wynajęcia.
 *
 * 3. Klasa AuctionHouse powinna zawierać metody:
 *
 * 1) Metoda, która zwróci listę pokoi z podanego jako argument miasta.
 * 2) Metoda, która zwróci listę pokoi na podstawie metrażu (od, do).
 * 3) Metoda, która zwróci listę wszystkich cen pokoi.
 * 4) Metoda, która zwróci listę 3 pokoi do wynajęcia najbliżej centrum podanego jako argument miasta.
 *
 * 4. Zaprezentuj działanie metod klasy ActionHouse za pomocą main lub/i
 * przetestuj za pomocą testów jednostkowych.
 *
 */
public class Main {
    public static void main(String[] args) {
        Room room1 = new Room("wroclaw", 12.0, 1200.0, 3.0);
        Room room2 = new Room("warszawa", 12.0, 900.0, 5.0);
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        AuctionHouse auctionHouse = new AuctionHouse(rooms);
        System.out.println(auctionHouse.retrieveFromCity("wroclaw"));
        System.out.println(auctionHouse.retrieveFromSize(10, 15));
        System.out.println(auctionHouse.pricesList());
    }
}
