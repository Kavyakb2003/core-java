class Guitar {

    public String brand;
    public String type;
    public String color;
    public int strings;
    public double price;

    public Guitar() 
	{
		System.out.println("Running the Guitar Details:");
    }

    public Guitar(String brand, String type, String color, int strings, double price) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.strings = strings;
        this.price = price;
    }
}
