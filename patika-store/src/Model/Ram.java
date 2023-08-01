package Model;

public class Ram {
    private int number;
    private String bit;

    public Ram(int number, String bit) {
        this.number = number;
        this.bit = bit;
    }

    public void setByte() {
        if (bit == "MB") {
            this.number = number * 1024 * 1024;
            bit = "byte";
        } else if (bit == "KB") {
            this.number = number * 1024;
            bit = "byte";
        } else if (bit == "GB"){
            this.number = number * 1024 * 1024 * 1024 ;
            bit = "byte";
        }

    }

}
