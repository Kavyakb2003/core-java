class Bus {

    public String number;
    public String source;
    public String destination;
    public int seats;
    public double fare;

    public Bus()
	{
		System.out.println("Running the Bus Details:");
    }

    public Bus(String number, String source, String destination, int seats, double fare) {
        this.number = number;
        this.source = source;
        this.destination = destination;
        this.seats = seats;
        this.fare = fare;
    }
}