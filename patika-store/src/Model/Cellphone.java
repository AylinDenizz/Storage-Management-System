package Model;

import java.math.BigDecimal;

public class Cellphone extends Product{
    private String productType;
    private ColorEnum colorEnum;
    private int power;

    public Cellphone(String productName, Brand brand, int uniqueId, BigDecimal price, double discountRate,
                     int stockAmount, Ram ram, double screenSize, Storage storage, ColorEnum colorEnum, int power) {
        super(productName, brand, uniqueId, price, discountRate, stockAmount, ram, screenSize, storage);
        this.colorEnum = colorEnum;
        this.power = power;
        this.productType = "cellPhone";
    }

}
