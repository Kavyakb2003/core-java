class SeatRunner{
	
	public static void main(String[] args)
	{
		Seat seat = new Seat();
		seat.number = 15;
		seat.booked = true;
		seat.passenger = new Passenger();
		
		seat.passenger.name = "Kavya";
		
		seat.info();
		seat.passenger.info();
	}
}