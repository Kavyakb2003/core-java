class WashingMachine {

    public String brand;
    public int capacity;
    public String type;
    public double price;
    public int programs;

    public WashingMachine() 
	{
		System.out.println("Running the WashingMachine Details:");
    }

    public WashingMachine(String brand, int capacity, String type, double price, int programs) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
        this.price = price;
        this.programs = programs;
    }
}
