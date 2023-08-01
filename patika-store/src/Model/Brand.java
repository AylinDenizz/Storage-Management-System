package Model;

public class Brand {
    private int brandId;
    private BrandEnum brandEnum;

    public int getId() {
        return brandId;
    }

    public void setId(int id) {
        this.brandId = id;
    }

    public BrandEnum getBrandEnum() {
        return brandEnum;
    }

    public void setBrandEnum(BrandEnum brandEnum) {
        this.brandEnum = brandEnum;
    }

    public Brand(int brandId, BrandEnum brandEnum) {
        this.brandId = brandId;
        this.brandEnum = brandEnum;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandId=" + brandId +
                ", brandEnum=" + brandEnum +
                '}';
    }
}
