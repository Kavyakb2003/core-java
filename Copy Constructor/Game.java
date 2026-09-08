class Game {
    public String name;
    public String type;
    public int players;
    public String platform;
    public boolean multiplayer;

    public Game() {
    }

    public Game(String name, String type, int players, String platform, boolean multiplayer) {
        this.name = name;
        this.type = type;
        this.players = players;
        this.platform = platform;
        this.multiplayer = multiplayer;
    }
}
