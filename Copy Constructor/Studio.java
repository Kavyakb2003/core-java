class Studio {
    public String name;
    public String location;
    public int rooms;
    public String type;
    public boolean available;

    public Studio() {
    }

    public Studio(String name, String location, int rooms, String type, boolean available) {
        this.name = name;
        this.location = location;
        this.rooms = rooms;
        this.type = type;
        this.available = available;
    }
}
