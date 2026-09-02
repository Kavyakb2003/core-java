class PalaceRunner {

	public static void main(String[] args)
	{

	Palace palace;
	palace = new Palace();

		System.out.println(palace.type);
		System.out.println(palace.price);
		System.out.println(palace.brand);
		System.out.println(palace.code);
		System.out.println(palace.height);
		System.out.println(palace.open);
		System.out.println(palace.size);
		System.out.println(palace.rating);
		System.out.println(palace.rooms);
		System.out.println(palace.id);

	Palace palace2 = new Palace();

	palace.brand = "Bangalore Palace";
	palace.type = "Historic";

		System.out.println(palace.brand);
		System.out.println(palace.price);
		System.out.println(palace.type);

}
}