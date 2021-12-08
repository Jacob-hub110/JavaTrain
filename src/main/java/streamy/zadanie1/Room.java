package streamy.zadanie1;

import java.util.Objects;

public class Room {
    private final String city;
    private final double apartmentSize;
    private final double price;
    private final double distanceFromDowntown;

    public Room(String city, double apartmentSize, double price, double distanceFromDowntown) {
        this.city = city;
        this.apartmentSize = apartmentSize;
        this.price = price;
        this.distanceFromDowntown = distanceFromDowntown;
    }

    public String getCity() {
        return city;
    }

    public double getApartmentSize() {
        return apartmentSize;
    }

    public double getPrice() {
        return price;
    }

    public double getDistanceFromDowntown() {
        return distanceFromDowntown;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return Double.compare(room.getApartmentSize(), getApartmentSize()) == 0
                && Double.compare(room.getPrice(), getPrice()) == 0
                && Double.compare(room.getDistanceFromDowntown(), getDistanceFromDowntown()) == 0
                && Objects.equals(getCity(), room.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getApartmentSize(), getPrice(), getDistanceFromDowntown());
    }

    @Override
    public String toString() {
        return "Room{" +
                "city='" + city + '\'' +
                ", apartmentSize=" + apartmentSize +
                ", price=" + price +
                ", distanceFromDowntown=" + distanceFromDowntown +
                '}';
    }
}
