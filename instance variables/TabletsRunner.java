class TabletsRunner {

	public static void main(String[] args)
	{

		Tablets tablets;
		tablets = new Tablets();

			System.out.println(tablets.type);
			System.out.println(tablets.price);
			System.out.println(tablets.brand);
			System.out.println(tablets.code);
			System.out.println(tablets.weight);
			System.out.println(tablets.available);
			System.out.println(tablets.size);
			System.out.println(tablets.rating);
			System.out.println(tablets.quantity);
			System.out.println(tablets.id);

		Tablets tablets2 = new Tablets();

		tablets.brand = "Dolo";
		tablets.type = "Fever";

			System.out.println(tablets.brand);
			System.out.println(tablets.price);
			System.out.println(tablets.type);

	}
}