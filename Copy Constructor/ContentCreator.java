class ContentCreator {

    public String name;
    public String platform;
    public int followers;
    public String category;
    public boolean verified;

    public ContentCreator() {
    }

    public ContentCreator(String name, String platform, int followers, String category, boolean verified) {
        this.name = name;
        this.platform = platform;
        this.followers = followers;
        this.category = category;
        this.verified = verified;
    }
}
