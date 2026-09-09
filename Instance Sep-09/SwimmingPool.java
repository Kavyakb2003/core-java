class SwimmingPool {

    public String location;
    public double length;
    public double width;
    public double depth;

    public SwimmingPool(String location, double length, double width, double depth) {
        this.location = location;
        this.length = length;
        this.width = width;
        this.depth = depth;
			System.out.println("Running the SwimmingPool Details:");
    }

    public void SwimmingPoolInfo() {
        System.out.println("Location: " + location);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Depth: " + depth);
        System.out.println();
    }
}