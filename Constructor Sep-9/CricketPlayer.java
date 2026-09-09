class CricketPlayer {

    public String name;
    public String country;
    public int age;
    public String role;
    public int jerseyNumber;

    public CricketPlayer()
	{
		System.out.println("Running the CricketPlayer Details:");
    }

    public CricketPlayer(String name, String country, int age, String role, int jerseyNumber) 
	{
        this.name = name;
        this.country = country;
        this.age = age;
        this.role = role;
        this.jerseyNumber = jerseyNumber;
    }
}
