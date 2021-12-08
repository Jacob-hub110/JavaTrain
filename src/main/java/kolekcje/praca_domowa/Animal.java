package kolekcje.praca_domowa;

import java.util.Objects;

public class Animal implements Comparable<Animal> {
    private String family;
    private String species;
    private int averageLifeLongness;

    public Animal(String family, String species, int averageLifeLongness) {
        this.family = family;
        this.species = species;
        this.averageLifeLongness = averageLifeLongness;
    }

    public String getFamily() {
        return family;
    }

    public String getSpecies() {
        return species;
    }

    public int getAverageLifeLongness() {
        return averageLifeLongness;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getAverageLifeLongness() == animal.getAverageLifeLongness() && Objects.equals(getFamily(), animal.getFamily()) && Objects.equals(getSpecies(), animal.getSpecies());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFamily(), getSpecies(), getAverageLifeLongness());
    }

    @Override
    public String toString() {
        return "Zwierz {" +
                "rodzina:'" + family + '\'' +
                ", gatunek:'" + species + '\'' +
                ", średnia długość życia =" + averageLifeLongness +
                '}';
    }

    /*@Override
    public int compareTo(Animal o) {
        if (o.averageLifeLongness > this.averageLifeLongness) {
            return 1;
        } else if (o.averageLifeLongness == this.averageLifeLongness) {
            return this.species.compareTo(o.species);
        } else {
            return -1;
        }
    }*/

    @Override
    public int compareTo(Animal o) {
        int lifeLongnessResult = Integer.compare(o.averageLifeLongness, this.averageLifeLongness);

        if (lifeLongnessResult == 0) {
            return this.species.compareTo(o.species);
        }

        return lifeLongnessResult;
    }
}
