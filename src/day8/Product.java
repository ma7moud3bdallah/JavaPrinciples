package day8;

public interface Product {
    //Interface fields must be public,static,final

    // Setters
    void setPrice(int price);
    void setName(String name);
    void setColor(String color);

    // Getters
    int getPrice();
    String getName();
    String getColor();

    // Deafult method (from Java 8)
    default String getBarcode(){
        return "No Barcode";
    }
}
