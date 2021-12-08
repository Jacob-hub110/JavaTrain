package obiektowe.interfejsy.wypozyczalnia;

import java.math.BigDecimal;

public class Car implements Rentable {

    private static final BigDecimal PRICE_PER_HOUR = BigDecimal.valueOf(10);

    private String brand;
    private String model;
    private int productionYear;

    public Car(String brand, String model, int productionYear) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    @Override
    public String description() {
        return "Samochod " + brand + " " + model + " " + productionYear;
    }

    @Override
    public BigDecimal calculatePrice(int hours) {
        //Rzutujemy int na BigDecimal
        final BigDecimal bigDecimalHours = BigDecimal.valueOf(hours);
        //Mnozenie, wynikiem jest nowy obiekt BigDecimal
        return PRICE_PER_HOUR.multiply(bigDecimalHours);
    }
}

