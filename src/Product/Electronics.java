package Product;

 class Electronics extends Product{
    private String type;
    private int lenght;
    private int width ;
    private int height;
    private int weight;

    public Electronics(int price, String description, String name, int quantity, String type, int lenght, int width, int height, int weight) {
        super(price, description, name, quantity);
        this.type = type;
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getLenght() {
        return lenght;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}
