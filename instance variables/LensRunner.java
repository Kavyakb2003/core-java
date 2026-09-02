class LensRunner {

	public static void main(String[] args)
	{

		Lens lens;
		lens = new Lens();

			System.out.println(lens.type);
			System.out.println(lens.price);
			System.out.println(lens.brand);
			System.out.println(lens.code);
			System.out.println(lens.weight);
			System.out.println(lens.available);
			System.out.println(lens.size);
			System.out.println(lens.rating);
			System.out.println(lens.quantity);
			System.out.println(lens.id);


		Lens lens2 = new Lens();

		lens.brand = "alpha";
		lens.type = "convex";

			System.out.println(lens.brand);
			System.out.println(lens.price);
			System.out.println(lens.type);

	}
}