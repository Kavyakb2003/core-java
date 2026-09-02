class CementRunner {

	public static void main(String[] args)
	{

		Cement cement;
		cement = new Cement();

			System.out.println(cement.type);
			System.out.println(cement.price);
			System.out.println(cement.brand);
			System.out.println(cement.code);
			System.out.println(cement.weight);
			System.out.println(cement.strong);
			System.out.println(cement.grade);
			System.out.println(cement.rating);
			System.out.println(cement.quantity);
			System.out.println(cement.id);

		Cement cement2 = new Cement();

		cement.brand = "ACC";
		cement.type = "White Cement";

			System.out.println(cement.brand);
			System.out.println(cement.price);
			System.out.println(cement.type);

}
}