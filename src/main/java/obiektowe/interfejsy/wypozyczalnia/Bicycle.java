package obiektowe.interfejsy.wypozyczalnia;

import java.math.BigDecimal;

public class Bicycle implements Rentable {
    private String type; // np góral/damka/kolarzowka
    private int year;
    private final BigDecimal PRICE_PER_HOUR = BigDecimal.valueOf(10);

    public Bicycle(String type, int year) {
        this.type = type;
        this.year = year;
    }

    @Override
    public String description() {
        return "Bicycle{" +
                "type='" + type + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public BigDecimal calculatePrice(int hours) {
        final BigDecimal bigDecimalHours = BigDecimal.valueOf(hours);
        return PRICE_PER_HOUR.multiply(bigDecimalHours);
    }
}
