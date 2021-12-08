package kolekcje.lista;

public class City {
    private String cityName;
    private int population;

    public City(String cityName, int population) {
        this.cityName = cityName;
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", population=" + population +
                '}';
    }
}
