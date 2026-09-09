class CameraShop {

    public String name;
    public String location;
    public int cameras;
    public double rent;
    public String owner;

    public CameraShop()
	{
		System.out.println("Running the CameraShop Details:");
    }

    public CameraShop(String name, String location, int cameras, double rent, String owner) 
	{
        this.name = name;
        this.location = location;
        this.cameras = cameras;
        this.rent = rent;
        this.owner = owner;
    }
}