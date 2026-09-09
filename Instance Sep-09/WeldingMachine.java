class WeldingMachine {


    public String brand;
    public String model;
    public double power;
    public double price;

    public WeldingMachine(String brand, String model, double power, double price) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.price = price;
			System.out.println("Running the WeldingMachine Details:");
    }

    public void WeldingMachineInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Power: " + power);
        System.out.println("Price: " + price);
        System.out.println();
    }
}