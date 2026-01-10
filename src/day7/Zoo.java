package day7;

public class Zoo {
    static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.makeSound();
//
//        Dog dog = new Dog();
//        dog.makeSound();
//
//        Cat cat = new Cat();
//        cat.makeSound();

         // Reference type: animal -- Object type: Dog()
//        Animal animal = new Dog();
//        animal.makeSound();
//        ((Dog)animal).bite();
//        feed(animal);
        // Reference type: animal -- Object type: Cat()
        Animal animal = new Cat();
        animal.makeSound();
        ((Cat)animal).scratch();
        feed(animal);
    }
   static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Dog food");
        }
        else{
            System.out.println("Cat food");
        }
   }
}
