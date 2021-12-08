package streamy.zadanie1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AuctionHouse {
    private final List<Room> roomList;

    public AuctionHouse(List<Room> roomList) {
        this.roomList = roomList;
    }

    @Override
    public String toString() {
        return "AuctionHouse{" +
                "roomList=" + roomList +
                '}';
    }

    public List<Room> retrieveFromCity(String city) {
        return this.roomList.stream()
                .filter(roomList -> roomList.getCity().equals(city))
                .collect(Collectors.toList());
    }

    public List<Room> retrieveFromSize(double from, double to) {
        return this.roomList.stream()
                .filter(roomList -> roomList.getApartmentSize() >= from & roomList.getApartmentSize() <= to)
                .collect(Collectors.toList());
    }

    public List<Double> pricesList() {
        return this.roomList.stream()
                .map(Room::getPrice)
                .collect(Collectors.toList());
    }

    public List<Room> threeRoomsNearestDowntownStream(String city) {
        return this.roomList.stream()
                .filter(roomList -> roomList.getCity().equals(city))
                .sorted(Comparator.comparing(Room::getDistanceFromDowntown))
                .limit(3)
                .collect(Collectors.toList());
    }

    public List<Room> threeRoomsNearestDowntown(String city) {
        List<Room> rooms = new ArrayList<>();
        for (Room room : roomList) {
            if (room.getCity().equals(city)) {
                rooms.add(room);
            }
        }

        rooms.sort(Comparator.comparing(Room::getDistanceFromDowntown));

        return rooms;
    }
}
