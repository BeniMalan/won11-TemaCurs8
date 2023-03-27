package Product;

public class Main {

    public static void main(String[] args) {
        Product product1=new Product(100,"smartTV","LG",1);
        System.out.println("Nume produs:"+product1.getName()+" Descrire: "+product1.getDescription()+" Pret: "+product1.getPrice()+" Cantitate:"+product1.getQuantity());
        Cosmetics product2=new Cosmetics(100,"ruj original","Ruj",2,"rosu",50);
        System.out.println("Nume produs: "+product2.getName()+" Descrire: "+product2.getDescription()+" Pret: "+product2.getPrice()+" Cantitate: "+product2.getQuantity()+" Culoare:"+product2.getColor()+" Grutate: "+product2.getWeight());
        Electronics product3=new Electronics(3000,"Laptop ultraportabil","Dell",1,"Bussines",300,250,30,900);
        System.out.println("Nume produs: "+product3.getName()+" Descrire: "+product3.getDescription()+" Pret: "+product3.getPrice()+" Cantitate: "+product3.getQuantity()+" Tipul:"+product3.getType()+" Lungime:"+product3.getLenght()+" Latime:"+product3.getWidth()+" Inaltime:"+product3.getHeight()+" Greutate:"+product3.getWeight());
        Fridge product4 =new Fridge(2000,"Frigider Smart","Indesit",1,"Home",1500,1500,2000,40000,-10);
        System.out.println("Nume produs: "+product4.getName()+" Descrire: "+product4.getDescription()+" Pret: "+product4.getPrice()+" Cantitate: "+product4.getQuantity()+" Tipul:"+product4.getType()+" Lungime:"+product4.getLenght()+" Latime:"+product4.getWidth()+" Inaltime:"+product4.getHeight()+" Greutate:"+product4.getWeight()+" Temperatura:"+product4.getTemperature());





    }
}