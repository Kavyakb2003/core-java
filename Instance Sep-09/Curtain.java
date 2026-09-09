class Curtain {

    public String color;
    public String material;
    public double height;
    public double price;

    public Curtain(String color, String material, double height, double price) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.price = price;
			System.out.println("Running the Curtain Details:");
    }

    public void CurtainInfo() {
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Height: " + height);
        System.out.println("Price: " + price);
        System.out.println();
    }
}