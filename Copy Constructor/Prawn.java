class Prawn {
    public String type;
    public double weight;
    public double price;
    public String size;
    public boolean fresh;

    public Prawn() {
    }

    public Prawn(String type, double weight, double price, String size, boolean fresh) {
        this.type = type;
        this.weight = weight;
        this.price = price;
        this.size = size;
        this.fresh = fresh;
    }
}
