class PrinterRunner {

    public static void main(String[] args) 
	{
        Printer p1 = new Printer();
        Printer p2 = new Printer("HP", "Laser", "Black", 15000, 30);

        System.out.println(p1.brand);
        System.out.println(p1.type);
        System.out.println(p1.color);
        System.out.println(p1.price);
        System.out.println(p1.speed);

        System.out.println(p2.brand);
        System.out.println(p2.type);
        System.out.println(p2.color);
        System.out.println(p2.price);
        System.out.println(p2.speed);
    }
}