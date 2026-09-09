class HelmetRunner {

    public static void main(String[] args)
	{
        Helmet h1 = new Helmet();
        Helmet h2 = new Helmet("Vega", "Black", 58, 1500, "ABS");

        System.out.println(h1.brand);
        System.out.println(h1.color);
        System.out.println(h1.size);
        System.out.println(h1.price);
        System.out.println(h1.material);

        System.out.println(h2.brand);
        System.out.println(h2.color);
        System.out.println(h2.size);
        System.out.println(h2.price);
        System.out.println(h2.material);
    }
}