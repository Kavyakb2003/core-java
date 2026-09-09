class SupermarketRunner {


    public static void main(String[] args) 
	{
        Supermarket s1 = new Supermarket();
        Supermarket s2 = new Supermarket("More", "Bangalore",
                5000, 50, 2500000);

        System.out.println(s1.name);
        System.out.println(s1.location);
        System.out.println(s1.products);
        System.out.println(s1.employees);
        System.out.println(s1.turnover);

        System.out.println(s2.name);
        System.out.println(s2.location);
        System.out.println(s2.products);
        System.out.println(s2.employees);
        System.out.println(s2.turnover);
    }
}