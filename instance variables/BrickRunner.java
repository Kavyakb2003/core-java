class BrickRunner {

	public static void main(String[] args)
	{

		Brick brick;
		brick = new Brick();

			System.out.println(brick.type);
			System.out.println(brick.price);
			System.out.println(brick.brand);
			System.out.println(brick.code);
			System.out.println(brick.weight);
			System.out.println(brick.strong);
			System.out.println(brick.size);
			System.out.println(brick.rating);
			System.out.println(brick.quantity);
			System.out.println(brick.id);

		Brick brick2 = new Brick();

		brick.brand = "Acc";
		brick.type = "Concrete Brick";

			System.out.println(brick.brand);
			System.out.println(brick.price);
			System.out.println(brick.type);

}
}