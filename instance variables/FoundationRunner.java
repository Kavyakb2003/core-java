class FoundationRunner {

	public static void main(String[] args)
	{

		Foundation foundation;
		foundation = new Foundation();

			System.out.println(foundation.type);
			System.out.println(foundation.price);
			System.out.println(foundation.brand);
			System.out.println(foundation.code);
			System.out.println(foundation.weight);
			System.out.println(foundation.strong);
			System.out.println(foundation.size);
			System.out.println(foundation.rating);
			System.out.println(foundation.quantity);
			System.out.println(foundation.id);

		Foundation foundation2 = new Foundation();

		foundation.brand = "ACC";
		foundation.type = "Concrete";

			System.out.println(foundation.brand);
			System.out.println(foundation.price);
			System.out.println(foundation.type);

	}
}