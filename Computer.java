public class Computer {
    private double price;
    private String brand;
    private int memorySize;

    // Constructor
    public Computer(double price, String brand, int memorySize) {
        this.price = price;
        this.brand = brand;
        this.memorySize = memorySize;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for memory size
    public int getMemorySize() {
        return memorySize;
    }

    // Setter for memory size
    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }
}
