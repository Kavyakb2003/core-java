class JuiceRunner{
	public static void main(String[] args){
		
		String name = "Apple";
		int appleJuicePrice = Juice.getPriceByJuiceName(name);
		System.out.println("Price:"+appleJuicePrice);
		
		String name2 = "Watermelon";
		int watermelonJuicePrice = Juice.getPriceByJuiceName(name2);
		System.out.println("Price:"+watermelonJuicePrice);
		
		String name3 = "Orange";
		int orangeJuicePrice = Juice.getPriceByJuiceName(name3);
		System.out.println("Price:"+orangeJuicePrice);
		
		String name4 = "PineApple";
		int pineAppleJuicePrice = Juice.getPriceByJuiceName(name4);
		System.out.println("Price:"+pineAppleJuicePrice);
		
		String name5 = "Pomogranate";
		int pomogranateJuicePrice = Juice.getPriceByJuiceName(name5);
		System.out.println("Price:"+pomogranateJuicePrice);
	}
}