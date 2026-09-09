class TableRunner {


    public static void main(String[] args)
	{
        Table t1 = new Table();
        Table t2 = new Table("Wood", "Brown", 6.5, 8000, "Rectangle");

        System.out.println(t1.material);
        System.out.println(t1.color);
        System.out.println(t1.length);
        System.out.println(t1.price);
        System.out.println(t1.shape);

        System.out.println(t2.material);
        System.out.println(t2.color);
        System.out.println(t2.length);
        System.out.println(t2.price);
        System.out.println(t2.shape);
    }
}