package Product;

public class Product {
    private int price;
    private String description;
    private String name;
    private int quantity=0;
   public Product ( int price,String description,String name,int quantity){
        this.price=price;
        this.description=description;
        this.name=name;
        this.quantity=quantity;

    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }
}
