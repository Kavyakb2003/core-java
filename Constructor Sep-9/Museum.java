class Museum {

    public String name;
    public String location;
    public int exhibits;
    public int visitors;
    public double ticketPrice;

    public Museum() 
	{
		System.out.println("Running the Museum Details:");
    }

    public Museum(String name, String location, int exhibits,int visitors, double ticketPrice)
	{
        this.name = name;
        this.location = location;
        this.exhibits = exhibits;
        this.visitors = visitors;
        this.ticketPrice = ticketPrice;
    }
}
