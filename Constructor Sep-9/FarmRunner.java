class FarmRunner {

    public static void main(String[] args) 
	{
        Farm f1 = new Farm();
        Farm f2 = new Farm("Ramesh", "Mandya",
                10.5, "Sugarcane", 15);

        System.out.println(f1.owner);
        System.out.println(f1.location);
        System.out.println(f1.area);
        System.out.println(f1.crop);
        System.out.println(f1.workers);

        System.out.println(f2.owner);
        System.out.println(f2.location);
        System.out.println(f2.area);
        System.out.println(f2.crop);
        System.out.println(f2.workers);
    }
}