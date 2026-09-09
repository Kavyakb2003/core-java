class Farm {

    public String owner;
    public String location;
    public double area;
    public String crop;
    public int workers;

    public Farm()
	{
		System.out.println("Running the Farm Details:");
    }

    Farm(String owner, String location, double area, String crop, int workers) 
	{
        this.owner = owner;
        this.location = location;
        this.area = area;
        this.crop = crop;
        this.workers = workers;
    }
}