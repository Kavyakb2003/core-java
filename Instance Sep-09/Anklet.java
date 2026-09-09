class Anklet {


    public String material;
    public String color;
    public double weight;
    public double price;

    public Anklet(String material, String color, double weight, double price) {
        this.material = material;
        this.color = color;
        this.weight = weight;
        this.price = price;
			System.out.println("Running the Anklet Details:");
    }

    public void AnkletInfo() {
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println();
    }
}