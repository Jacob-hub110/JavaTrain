package obiektowe.interfejsy.wypozyczalnia;

import java.math.BigDecimal;

public class Scooter implements Rentable {

    private final BigDecimal PRICE_PER_HOUR = BigDecimal.valueOf(10);

    private String brand;

    public Scooter(String brand) {
        this.brand = brand;
    }

    @Override
    public String description() {
        return "Scooter{" +
                "PRICE_PER_HOUR=" + PRICE_PER_HOUR +
                ", brand='" + brand + '\'' + '}';
    }

    @Override
    public BigDecimal calculatePrice(int hours) {
        final BigDecimal bigDecimalHours = BigDecimal.valueOf(hours);
        return PRICE_PER_HOUR.multiply(bigDecimalHours);
    }
}
