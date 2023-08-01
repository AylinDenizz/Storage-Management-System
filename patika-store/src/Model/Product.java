package Model;

import java.math.BigDecimal;

public class Product {
    private String productName;
    private Brand brand;
    private int uniqueId;
    private BigDecimal price;
    private double discountRate;
    private int stockAmount;
    private Ram ram;
    private double screenSize;
    private Storage storage;
    private String productType;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Object getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(int uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Product(String productName, Brand brand, int uniqueId, BigDecimal price, double discountRate, int stockAmount, Ram ram, double screenSize, Storage storage) {
        this.productName = productName;
        this.brand = brand;
        this.uniqueId = uniqueId;
        this.price = price;
        this.discountRate = discountRate;
        this.stockAmount = stockAmount;
        this.ram = ram;
        this.screenSize = screenSize;
        this.storage = storage;
    }
}
