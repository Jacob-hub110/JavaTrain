package streamy.zadanie1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class AuctionHouseTest {

    @Test
    void should_return_by_city() {
        //given
        List<Room> rooms = Arrays.asList(
                new Room("wroclaw", 12.0, 1200.0, 3.0),
                new Room("warszawa", 12.0, 900.0, 5.0)
        );
        AuctionHouse auctionHouse = new AuctionHouse(rooms);
        String city = "wroclaw";
        //when
        List<Room> result = auctionHouse.retrieveFromCity(city);
        //then
        assertThat(result).hasSize(1);
    }

    @Test
    void should_return_by_size() {
        //given
        List<Room> rooms = Arrays.asList(
                new Room("wroclaw", 12.0, 1200.0, 3.0),
                new Room("warszawa", 12.0, 900.0, 5.0),
                new Room("warszawa", 30, 1900.0, 3.0)
        );
        AuctionHouse auctionHouse = new AuctionHouse(rooms);
        //when
        List<Room> result = auctionHouse.retrieveFromSize(10, 15);
        //then
        assertThat(result).hasSize(2);
    }

    @Test
    void should_return_emptyListOfRooms() {
        //given
        AuctionHouse auctionHouse = new AuctionHouse(Collections.emptyList());
        //when
        List<Room> result = auctionHouse.retrieveFromSize(10, 15);
        //then
        assertThat(result).hasSize(0);
    }

    @Test
    void should_return_ListOfPrices() {
        //given
        List<Room> rooms = Arrays.asList(
                new Room("wroclaw", 12.0, 1200.0, 3.0),
                new Room("warszawa", 12.0, 900.0, 5.0),
                new Room("warszawa", 30, 1900.0, 3.0)
        );
        AuctionHouse auctionHouse = new AuctionHouse(rooms);
        //when
        List<Double> result = auctionHouse.pricesList();
        //then
        assertThat(result).containsExactly(1200.0, 900.0, 1900.0);
    }

    @Test
    void should_return_EmptyListOfPrices() {
        //given
        AuctionHouse auctionHouse = new AuctionHouse(Collections.emptyList());
        //when
        List<Double> result = auctionHouse.pricesList();
        //then
        assertThat(result).isEmpty();
    }

    @Test
    void should_return_threeRoomsNearestDowntown() {
        //given
        List<Room> rooms = Arrays.asList(
                new Room("warszawa", 30, 1900.0, 3.0),
                new Room("wroclaw", 12.0, 1200.0, 3.0),
                new Room("warszawa", 12.0, 900.0, 5.5),
                new Room("wroclaw", 12.0, 10000.0, 1.0),
                new Room("warszawa", 30, 1800.0, 4.0),
                new Room("warszawa", 30, 1800.0, 1.5)
        );
        AuctionHouse auctionHouse = new AuctionHouse(rooms);
        String city = "warszawa";
        //when
        List<Room> result = auctionHouse.threeRoomsNearestDowntown(city);
        List<Room> expected = Arrays.asList(
                new Room("warszawa", 30, 1800.0, 1.5),
                new Room("warszawa", 30, 1900.0, 3.0),
                new Room("warszawa", 30, 1800.0, 4.0)
        );
        //then
        assertThat(result).containsAll(expected);
    }

    @Test
    void should_return_twoRoomsNearestDowntown() {
        //given
        Room second = new Room("wroclaw", 12.0, 1200.0, 3.0);
        Room first = new Room("wroclaw", 12.0, 10000.0, 1.0);
        List<Room> rooms = Arrays.asList(
                new Room("warszawa", 30, 1900.0, 3.0),
                second,
                new Room("warszawa", 12.0, 900.0, 5.5),
                first,
                new Room("warszawa", 30, 1800.0, 4.0),
                new Room("warszawa", 30, 1800.0, 1.5)
        );
        AuctionHouse auctionHouse = new AuctionHouse(rooms);
        String city = "wroclaw";
        //when
        List<Room> result = auctionHouse.threeRoomsNearestDowntown(city);
        //then
        assertThat(result).containsExactly(first, second);
    }

    @Test
    void should_return_0RoomsNearestDowntown() {
        //given
        AuctionHouse auctionHouse = new AuctionHouse(Collections.emptyList());
        String city = "warszawa";
        //when
        List<Room> result = auctionHouse.threeRoomsNearestDowntown(city);
        //then
        assertThat(result).isEmpty();
    }
}