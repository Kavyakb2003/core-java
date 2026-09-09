class Clinic {

    public String name;
    public String location;
    public int doctors;
    public double fees;

    public Clinic(String name, String location, int doctors, double fees) {
        this.name = name;
        this.location = location;
        this.doctors = doctors;
        this.fees = fees;
			System.out.println("Running the Clinic Details:");
    }

    public void ClinicInfo() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Doctors: " + doctors);
        System.out.println("Fees: " + fees);
        System.out.println();
    }
}