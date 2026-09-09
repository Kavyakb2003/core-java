class MuseumRunner {

    public static void main(String[] args) {
        Museum m1 = new Museum();
        Museum m2 = new Museum("Government Museum", "Bangalore",
                2000, 1000, 50);

        System.out.println(m1.name);
        System.out.println(m1.location);
        System.out.println(m1.exhibits);
        System.out.println(m1.visitors);
        System.out.println(m1.ticketPrice);

        System.out.println(m2.name);
        System.out.println(m2.location);
        System.out.println(m2.exhibits);
        System.out.println(m2.visitors);
        System.out.println(m2.ticketPrice);
    }
}