class InjectionRunner {

	public static void main(String[] args)
	{

		Injection injection;
		injection = new Injection();

			System.out.println(injection.type);
			System.out.println(injection.price);
			System.out.println(injection.brand);
			System.out.println(injection.code);
			System.out.println(injection.weight);
			System.out.println(injection.available);
			System.out.println(injection.size);
			System.out.println(injection.rating);
			System.out.println(injection.quantity);
			System.out.println(injection.id);

		Injection injection2 = new Injection();

		injection.brand = "Sun";
		injection.type = "Vitamin";

			System.out.println(injection.brand);
			System.out.println(injection.price);
			System.out.println(injection.type);

	}
}