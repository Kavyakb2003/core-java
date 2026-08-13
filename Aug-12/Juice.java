class Juice{
	public static int getPriceByJuiceName(String name){
		
		System.out.println("Running getPriceByJuiceName in Juice");
		System.out.println("Juice Name:" +name+ " Juice ");
		
		int appleJuicePrice = 60;
		int watermelonJuicePrice = 40;
		int orangeJuicePrice = 45;
		int pineAppleJuicePrice = 30;
		int pomogranateJuicePrice = 50;
		
		if(name == "Apple"){
			System.out.println("You have selected the Apple Juice");
			return appleJuicePrice;
		} else if(name == "Watermelon"){
			System.out.println("You have selected the Watermelon Juice");
			return watermelonJuicePrice;
		}else if(name == "Orange"){
			System.out.println("You have selected the Orange Juice");
			return orangeJuicePrice;
		}else if(name == "PineApple"){
			System.out.println("You have selected the PineApple Juice");
			return pineAppleJuicePrice;
		}else if(name == "Pomogranate"){
			System.out.println("You have selected the Promogranate Juice");
			return pomogranateJuicePrice;
		}
			
		return 0;
	}
}