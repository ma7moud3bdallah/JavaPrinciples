package day7;

public class Employee extends Person{
    // Fields
    private int id;
    private int salary;
    private String title;

    // Default Constructor
    public Employee(){
        super("Ahmed");
        System.out.println("Im Employee default constructor");
    }

    // Setters
    public void setId(int id){
        this.id = id;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setTitle(String title){
        this.title = title;
    }

    // Getters
    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public String getTitle(){
        return title;
    }

}
