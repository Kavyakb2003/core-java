class DroneRunner{
	
	public static void main(String[] args){
		
		Drone drone1 = new Drone();
		drone1.brand = "DJI";
        drone1.weight = 500.0;
        drone1.cameraPixels = 48;
        drone1.price = 75000;

		System.out.println(drone1.brand);
        System.out.println(drone1.weight);
        System.out.println(drone1.cameraPixels);
        System.out.println(drone1.price);
		
		Drone drone2 = new Drone();
		drone2.brand = "Autel";
        drone2.weight = 600.0;
        drone2.cameraPixels = 50;
        drone2.price = 90000;
		
		System.out.println(drone2.brand);
        System.out.println(drone2.weight);
        System.out.println(drone2.cameraPixels);
        System.out.println(drone2.price);

	}

}