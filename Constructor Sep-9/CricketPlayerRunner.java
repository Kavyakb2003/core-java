class CricketPlayerRunner {

    public static void main(String[] args) {
        CricketPlayer c1 = new CricketPlayer();
        CricketPlayer c2 = new CricketPlayer("Virat Kohli", "India",
                37, "Batsman", 18);

        System.out.println(c1.name);
        System.out.println(c1.country);
        System.out.println(c1.age);
        System.out.println(c1.role);
        System.out.println(c1.jerseyNumber);

        System.out.println(c2.name);
        System.out.println(c2.country);
        System.out.println(c2.age);
        System.out.println(c2.role);
        System.out.println(c2.jerseyNumber);
    }
}