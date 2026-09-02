class SteelRunner {

	public static void main(String[] args)
	{

		Steel steel;
		steel = new Steel();

			System.out.println(steel.type);
			System.out.println(steel.price);
			System.out.println(steel.brand);
			System.out.println(steel.code);
			System.out.println(steel.weight);
			System.out.println(steel.strong);
			System.out.println(steel.size);
			System.out.println(steel.rating);
			System.out.println(steel.quantity);
			System.out.println(steel.id);

			Steel steel2 = new Steel();

			steel.brand = "JSW";
			steel.type = "Carbon Steel";

				System.out.println(steel.brand);
				System.out.println(steel.price);
				System.out.println(steel.type);

}
}