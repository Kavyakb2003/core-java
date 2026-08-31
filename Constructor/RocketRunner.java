class RocketRunner{
	
	public static void main(String[] args){
		
		Rocket rocket1 = new Rocket();
		rocket1.name = "PSLV";
        rocket1.country = "India";
        rocket1.height = 44.4;
        rocket1.stages = 4;
		
		System.out.println(rocket1.name);
		System.out.println(rocket1.country);
		System.out.println(rocket1.height);
		System.out.println(rocket1.stages);
		
		Rocket rocket2 = new Rocket();
		rocket2.name = "GSLV";
        rocket2.country = "India";
        rocket2.height = 49.1;
        rocket2.stages = 3;
		
		System.out.println(rocket2.name);
		System.out.println(rocket2.country);
		System.out.println(rocket2.height);
		System.out.println(rocket2.stages);


	}

}