package kolekcje.praca_domowa;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("łasicowate", "ratel miodożerny", 24);
        Animal animal2 = new Animal("łasicowate", "rosomak tundrowy", 9);
        Animal animal3 = new Animal("wołowate", "piżmowół arktyczny", 16);
        Animal animal4 = new Animal("wołowate", "gaur indyjski", 20);
        Animal animal6 = new Animal("człowiekowate", "orangutan sumatrzański", 45);
        Animal animal7 = new Animal("człowiekowate", "szympans karłowaty", 40);
        Animal animal5 = new Animal("papugi", "ara hiacyntowa", 40);
        List<Animal> animals = new ArrayList<>(Arrays.asList(animal1, animal2, animal3, animal4, animal5, animal6, animal7));
        Collections.sort(animals);
        System.out.println("Rozwiązanie przy użyciu interfejsu Comparable:");
        for (Animal animal:animals) {
            System.out.println(animal);
        }

        Collections.sort(animals, new Comparator<>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getSpecies().compareTo(o2.getSpecies());
            }
        });
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Rozwiązanie przy użyciu anonimowej klasy implementującej Comparator: ");
        for (Animal animal:animals) {
            System.out.println(animal);
        }

    }
}
