package ProductStore;

public class Product {

    private int id ;
    private String name ;
    private double price;
    private  double discountRate;
    private int amount;
    private  Brand brand;
    private double screenSize;
    private int ram;
    private int memory;

    public Product(String name,
                   double price,
                   double discountRate,
                   int amount,
                   Brand brand,
                   double screenSize,
                   int ram,
                   int memory) {
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.amount = amount;
        this.brand = brand;
        this.screenSize = screenSize;
        this.ram = ram;
        this.memory = memory;

    }

    public Product(
            String name, double price, double discountRate,
            int amount, double screenSize, int ram, int memory) {
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.amount = amount;
        this.screenSize = screenSize;
        this.ram = ram;
        this.memory = memory;

    }

    public Product() {
    }

    public  int getId() {
        return id;
    }

    public  void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id = "+id+
                " name='" + name + '\'' +
                ", price=" + price +
                ", discountRate=" + discountRate +
                ", amount=" + amount +
                ", brand=" + brand +
                ", screenSize=" + screenSize +
                ", ram=" + ram +
                ", memory=" + memory +
                '}';
    }
}
