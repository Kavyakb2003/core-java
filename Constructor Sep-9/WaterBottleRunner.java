class WaterBottleRunner{

	public static void main(String[] args)
	{
		WaterBottle waterbottle = new WaterBottle();
		WaterBottle waterbottle1 = new WaterBottle("Milton","Silver",500,900,"Steel");
		
		System.out.println(waterbottle.brand);
		System.out.println(waterbottle.color);
		System.out.println(waterbottle.price);
		System.out.println(waterbottle.capacity);
		System.out.println(waterbottle.material);
		
		System.out.println(waterbottle1.brand);
		System.out.println(waterbottle1.color);
		System.out.println(waterbottle1.price);
		System.out.println(waterbottle1.capacity);
		System.out.println(waterbottle1.material);
	}

}