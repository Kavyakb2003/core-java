class PipeRunner {

	public static void main(String[] args)
	{

		Pipe pipe;
		pipe = new Pipe();

			System.out.println(pipe.type);
			System.out.println(pipe.price);
			System.out.println(pipe.brand);
			System.out.println(pipe.code);
			System.out.println(pipe.weight);
			System.out.println(pipe.available);
			System.out.println(pipe.size);
			System.out.println(pipe.rating);
			System.out.println(pipe.quantity);
			System.out.println(pipe.id);

		Pipe pipe2 = new Pipe();

		pipe.brand = "Supreme";
		pipe.type = "Water Pipe";

			System.out.println(pipe.brand);
			System.out.println(pipe.price);
			System.out.println(pipe.type);

	}
}