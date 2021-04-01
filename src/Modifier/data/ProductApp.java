package Modifier.data;

class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("kipas",50000);
        product.name = "sepatu";
        System.out.println(product.name);

    }
}
