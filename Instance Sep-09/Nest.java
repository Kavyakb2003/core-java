class Nest {

    public String birdName;
    public String location;
    public int eggs;
    public String material;

    public Nest(String birdName, String location, int eggs, String material) {
        this.birdName = birdName;
        this.location = location;
        this.eggs = eggs;
        this.material = material;
			System.out.println("Running the Nest Information:");
    }

    public void NestInfo() {
        System.out.println("Bird Name: " + birdName);
        System.out.println("Location: " + location);
        System.out.println("Eggs: " + eggs);
        System.out.println("Material: " + material);
        System.out.println();
    }
}