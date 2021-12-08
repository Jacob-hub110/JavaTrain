package kolekcje.zbiory;

import java.util.LinkedHashSet;
import java.util.Set;

public class ObjectSetExample {
    public static void main(String[] args) {
        Country country1 = new Country("Poland", 38000000,"Andrzej Duda");
        Country country2 = new Country("Germany", 80000000,"Angela Merkel");
        Country country3 = new Country("France", 120000000,"Emanuel Macron");
        Country country4 = new Country("France", 120000000,"Emanuel Macron");

        Set<Country> countries = new LinkedHashSet<>();
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);
        countries.add(country4);

        for (Country c : countries) {
            System.out.println(c);
        }
    }
}
