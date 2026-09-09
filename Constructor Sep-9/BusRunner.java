class BusRunner {

    public static void main(String[] args)
	{
        Bus b1 = new Bus();
        Bus b2 = new Bus("500D", "Bangalore", "Mysore",
                50, 250);

        System.out.println(b1.number);
        System.out.println(b1.source);
        System.out.println(b1.destination);
        System.out.println(b1.seats);
        System.out.println(b1.fare);

        System.out.println(b2.number);
        System.out.println(b2.source);
        System.out.println(b2.destination);
        System.out.println(b2.seats);
        System.out.println(b2.fare);
    }
}