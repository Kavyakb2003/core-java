class Environment {

    public String type;
    public String location;
    public double temperature;
    public String climate;
    public boolean polluted;

    public Environment() {
    }

    public Environment(String type, String location, double temperature, String climate, boolean polluted) {
        this.type = type;
        this.location = location;
        this.temperature = temperature;
        this.climate = climate;
        this.polluted = polluted;
    }
}
