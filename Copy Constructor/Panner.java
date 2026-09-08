class Panner {
    public String type;
    public double weight;
    public double price;
    public String brand;
    public boolean fresh;

    public Panner() {
    }

    public Panner(String type, double weight, double price, String brand, boolean fresh) {
        this.type = type;
        this.weight = weight;
        this.price = price;
        this.brand = brand;
        this.fresh = fresh;
    }
}
