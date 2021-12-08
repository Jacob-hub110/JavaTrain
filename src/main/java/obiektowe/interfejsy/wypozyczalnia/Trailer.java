package obiektowe.interfejsy.wypozyczalnia;

import java.math.BigDecimal;

public class Trailer implements Sellable {


    @Override
    public String description() {
        return "trailer";
    }

    @Override
    public BigDecimal calculatePrice(int hour) {
        return BigDecimal.valueOf(hour);
    }

    @Override
    public BigDecimal bruttoPrice() {
        return BigDecimal.valueOf(1200);
    }

}
