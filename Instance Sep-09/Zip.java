class Zip {

    public String brand;
    public String color;
    public double length;
    public double price;

    public Zip(String brand, String color, double length, double price) {
        this.brand = brand;
        this.color = color;
        this.length = length;
        this.price = price;
			System.out.println("Running the Zip Details:");
    }

    public void ZipInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Price: " + price);
        System.out.println();
    }
}