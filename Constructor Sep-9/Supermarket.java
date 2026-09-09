class Supermarket {
    
	public String name;
    public String location;
    public int products;
    public int employees;
    public double turnover;

    public Supermarket() 
	{
		System.out.println("Running the Supermarket Details:");
    }

    public Supermarket(String name, String location, int products,
                int employees, double turnover) {
        this.name = name;
        this.location = location;
        this.products = products;
        this.employees = employees;
        this.turnover = turnover;
    }
}
