class Table {

    public String material;
    public String color;
    public double length;
    public double price;
    public String shape;

    public Table() 
	{
		System.out.println("Running Table Details:");
    }

    public Table(String material, String color, double length, double price, String shape) {
        this.material = material;
        this.color = color;
        this.length = length;
        this.price = price;
        this.shape = shape;
    }
}
