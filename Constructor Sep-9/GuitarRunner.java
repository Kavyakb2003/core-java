class GuitarRunner {

    public static void main(String[] args)
	{
        Guitar g1 = new Guitar();
        Guitar g2 = new Guitar("Yamaha", "Acoustic", "Brown", 6, 15000);

        System.out.println(g1.brand);
        System.out.println(g1.type);
        System.out.println(g1.color);
        System.out.println(g1.strings);
        System.out.println(g1.price);

        System.out.println(g2.brand);
        System.out.println(g2.type);
        System.out.println(g2.color);
        System.out.println(g2.strings);
        System.out.println(g2.price);
    }
}