package obiektowe.interfejsy.wypozyczalnia;

import java.math.BigDecimal;

public interface Rentable {

    String description();

    BigDecimal calculatePrice(int hour);

}
