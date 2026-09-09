class CameraShopRunner {

    public static void main(String[] args)
	{
        CameraShop c1 = new CameraShop();
        CameraShop c2 = new CameraShop("Digital World", "Bangalore",
                100, 45000, "Kiran");

        System.out.println(c1.name);
        System.out.println(c1.location);
        System.out.println(c1.cameras);
        System.out.println(c1.rent);
        System.out.println(c1.owner);

        System.out.println(c2.name);
        System.out.println(c2.location);
        System.out.println(c2.cameras);
        System.out.println(c2.rent);
        System.out.println(c2.owner);
    }
}