class RailwayTrack {


    public String material;
    public String location;
    public double length;
    public double width;

    public RailwayTrack(String material, String location, double length, double width) {
        this.material = material;
        this.location = location;
        this.length = length;
        this.width = width;
			System.out.println("Running the RailwayTrack Details:");
    }

    public void RailwayTrackInfo() {
        System.out.println("Material: " + material);
        System.out.println("Location: " + location);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println();
    }
}