package kolekcje.lista;

import java.util.ArrayList;
import java.util.List;

public class Zadanie3 {

    //Stworz klase City z polami na nazwe miast i populacje
    //Stworz kilka obiektow tej klasy w main
    //Dodaj je do listy
    //Wyswietl liste z danymi miast, ktore posiadaja conajmniej pol miliona populacji
    public static void main(String[] args) {
        City wroclaw = new City( "wroclaw", 650000);
        City bialystok = new City( "bialystok",140000);
        City warszawa = new City( "warszawa",1200000);
        List<City> cities = new ArrayList<>();
        cities.add(wroclaw);
        cities.add(bialystok);
        cities.add(warszawa);

        for (City city: cities) {
            if (city.getPopulation() >= 500000){
                System.out.println(city);
            }
        }

        System.out.println(cities);
    }
}

