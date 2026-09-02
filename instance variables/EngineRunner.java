class EngineRunner {

	public static void main(String[] args)
	{

		Engine engine;
		engine = new Engine();

			System.out.println(engine.type);
			System.out.println(engine.price);
			System.out.println(engine.brand);
			System.out.println(engine.code);
			System.out.println(engine.weight);
			System.out.println(engine.running);
			System.out.println(engine.size);
			System.out.println(engine.rating);
			System.out.println(engine.cylinder);
			System.out.println(engine.id);

		Engine engine2 = new Engine();

		engine.brand = "Toyota";
		engine.type = "Diesel";

			System.out.println(engine.brand);
			System.out.println(engine.price);
			System.out.println(engine.type);

}
}