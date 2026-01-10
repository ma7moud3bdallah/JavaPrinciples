package day7;

public class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Bark");
    }
    public void bite(){
        System.out.println("Im a dog, I bite");
    }
    public void print(String name){
        System.out.println("Im dog print method");
    }
}
