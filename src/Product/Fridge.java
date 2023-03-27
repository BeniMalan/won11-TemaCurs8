package Product;

 class Fridge extends Electronics{
    private int temperature ;

    public Fridge(int price, String description, String name, int quantity, String type, int lenght, int width, int height, int weight, int temperature) {
        super(price, description, name, quantity, type, lenght, width, height, weight);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
