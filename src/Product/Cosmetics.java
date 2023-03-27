package Product;

class Cosmetics extends Product{
    private String color;
    private int weight;

    public Cosmetics(int price, String description, String name, int quantity,String color,int weight) {
        super(price, description, name, quantity);
        this.color=color;
        this. weight=weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
