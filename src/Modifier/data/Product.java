package Modifier.data;

public class Product {
    protected String name;
    protected int price;

    public Product(String name, int price){
        this.name = name;
        this.price =price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
