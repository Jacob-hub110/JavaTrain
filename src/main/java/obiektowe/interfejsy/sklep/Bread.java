package obiektowe.interfejsy.sklep;

import java.math.BigDecimal;

public class Bread implements Product {


    private static final BigDecimal PRICE_PER_PIECE = BigDecimal.valueOf(2.5);

    private String companyName;
    private String nameOfProduct;

    public Bread(String companyName, String nameOfProduct) {
        this.companyName = companyName;
        this.nameOfProduct = nameOfProduct;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }


    @Override
    public String description() {
        return nameOfProduct + " marki " + companyName;
    }

    @Override
    public BigDecimal calculatePrice(int amount) {
        return PRICE_PER_PIECE.multiply(BigDecimal.valueOf(amount));
    }
}
