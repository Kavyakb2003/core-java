class BoatRunner{
	
	public static void main(String[] args){
		
		Boat boat1 = new Boat();
		boat1.name = "Sea Queen";
        boat1.type = "Fishing Boat";
        boat1.length = 20.5;
        boat1.capacity = 10;
		
        System.out.println(boat1.name);
        System.out.println(boat1.type);
        System.out.println(boat1.length);
        System.out.println(boat1.capacity);
		
		Boat boat2 = new Boat();
		boat2.name = "Ocean Star";
        boat2.type = "Speed Boat";
        boat2.length = 25.5;
        boat2.capacity = 8;

        System.out.println(boat2.name);
        System.out.println(boat2.type);
        System.out.println(boat2.length);
        System.out.println(boat2.capacity);
		
	}
}