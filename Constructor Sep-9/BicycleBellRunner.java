class BicycleBellRunner{

	public static void main(String... args)
	{
		BicycleBell bicyclebell = new BicycleBell();
		BicycleBell bicyclebell1 = new BicycleBell("Hornit", "Red", "Steel", 600, true);
		
		System.out.println(bicyclebell.brand);
		System.out.println(bicyclebell.color);
		System.out.println(bicyclebell.material);
		System.out.println(bicyclebell.price);
		System.out.println(bicyclebell.loud);
		
		System.out.println(bicyclebell1.brand);
		System.out.println(bicyclebell1.color);
		System.out.println(bicyclebell1.material);
		System.out.println(bicyclebell1.price);
		System.out.println(bicyclebell1.loud);
	}

}