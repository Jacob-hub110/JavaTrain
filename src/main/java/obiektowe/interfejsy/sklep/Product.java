package obiektowe.interfejsy.sklep;

import java.math.BigDecimal;

public interface Product {

    String description();

    BigDecimal calculatePrice(int amount);

}
