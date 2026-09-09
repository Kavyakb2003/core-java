class Printer {

    public String brand;
    public String type;
    public String color;
    public double price;
    public int speed;

    public Printer() 
	{
		System.out.println("Running the Printer Details:");
    }

    public Printer(String brand, String type, String color, double price, int speed) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.speed = speed;
    }
}