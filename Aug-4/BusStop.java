class BusStop{
	public static void board(String...var){
		String busNumber = "KA-15 AB 1234";
		String busName = "BMTC";
		int capacity = 50;
		
		Bus.transport(busNumber,busName,capacity);
	}
}