package day8;

public class Book implements Product{
    private int price;
    private String name;
    private String color;
    private String author;
    private int pages;

    // Setters
    @Override
    public void setPrice(int price){
        this.price = price;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void setColor(String color){
        this.color = color;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    // Getters

    @Override
    public int getPrice(){
        return price;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public String getColor(){
        return color;
    }

    public String getAuthor(){
        return author;
    }

    public int getPages(){
        return pages;
    }

    // Default method override
    public String getBarcode(){
        return "Barcode is 00012";
    }
}
