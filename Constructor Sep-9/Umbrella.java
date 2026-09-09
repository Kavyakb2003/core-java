class Umbrella {
    
	public String brand;
    public String color;
    public double price;
    public String material;
    public boolean folding;

    public Umbrella()
	{
		System.out.println("Running Umbrella Details:");
    }

    public Umbrella(String brand, String color, double price, String material, boolean folding) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.material = material;
        this.folding = folding;
    }
}