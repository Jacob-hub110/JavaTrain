package kolekcje.zbiory;

import java.util.Objects;

public class Country implements Comparable<Country> {

    private String name;
    private long population;
    private String president;

    public Country(String name, long population, String president) {
        this.name = name;
        this.population = population;
        this.president = president;
    }

    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public String getPresident() {
        return president;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return getPopulation() == country.getPopulation() && Objects.equals(getName(), country.getName())
                && Objects.equals(getPresident(), country.getPresident());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.population, this.president);
    }

    @Override
    public String toString() {
        return "Country{" +
                "name=" + name +
                ", population=" + population +
                ", president='" + president + '\'' +
                '}';
    }

    @Override
    public int compareTo(Country o) {
        return this.name.compareTo(o.name);
    }

}
