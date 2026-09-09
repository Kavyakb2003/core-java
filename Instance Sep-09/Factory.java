class Factory {

    public String name;
    public String location;
    public int employees;
    public double production;

    public Factory(String name, String location, int employees, double production) {
        this.name = name;
        this.location = location;
        this.employees = employees;
        this.production = production;
			System.out.println("Running the Factory Details:");
    }

    public void FactoryInfo() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Employees: " + employees);
        System.out.println("Production: " + production);
        System.out.println();
    }
}