class SchoolBagRunner {

    public static void main(String[] args) {
        SchoolBag s1 = new SchoolBag();
        SchoolBag s2 = new SchoolBag("Skybags", "Blue", 5, 1800, 25);

        System.out.println(s1.brand);
        System.out.println(s1.color);
        System.out.println(s1.pockets);
        System.out.println(s1.price);
        System.out.println(s1.capacity);

        System.out.println(s2.brand);
        System.out.println(s2.color);
        System.out.println(s2.pockets);
        System.out.println(s2.price);
        System.out.println(s2.capacity);
    }
}