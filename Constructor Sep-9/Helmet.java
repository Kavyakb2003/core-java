class Helmet {

    public String brand;
    public String color;
    public int size;
    public double price;
    public String material;

    public Helmet() 
	{
		System.out.println("Helmet Details:");
    }

    public Helmet(String brand, String color, int size, double price, String material) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.material = material;
    }
}
