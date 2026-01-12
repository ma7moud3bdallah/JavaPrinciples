package day8;

public class Customer {
    static void main(String[] args) {
        Product product = new Book();
        product.setPrice(20);
        System.out.println(product.getPrice());
    }
}
