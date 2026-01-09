package day7;

public class Person {
    // Fields
    private String name;
    private int age;
    private String gender;

    // Default Constructor
    public Person(){
        setName("Khadija");
        System.out.println("Im Person default constructor");
    }
    // Parameterized Constructor
    public Person(String name){
        System.out.println("Im Person parameterized constructor");
    }

    // Setters
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    // Getters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
}
