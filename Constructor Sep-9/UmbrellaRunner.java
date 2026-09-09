class UmbrellaRunner {

    public static void main(String[] args) 
	{
        Umbrella u1 = new Umbrella();
        Umbrella u2 = new Umbrella("Wildcraft", "Blue", 900, "Nylon", true);

        System.out.println(u1.brand);
        System.out.println(u1.color);
        System.out.println(u1.price);
        System.out.println(u1.material);
        System.out.println(u1.folding);

        System.out.println(u2.brand);
        System.out.println(u2.color);
        System.out.println(u2.price);
        System.out.println(u2.material);
        System.out.println(u2.folding);
    }
}