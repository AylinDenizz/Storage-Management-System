package Model;

import java.math.BigDecimal;

public class Notebook extends Product {
    private String productType;
    public Notebook(String productName, Brand brand, int uniqueId, BigDecimal price, double discountRate, int stockAmount, Ram ram, double screenSize, Storage storage) {
        super(productName, brand, uniqueId, price, discountRate, stockAmount, ram, screenSize, storage);
        this.productType = "notebook";
    }
}
