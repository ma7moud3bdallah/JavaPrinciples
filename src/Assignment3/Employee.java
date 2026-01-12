package Assignment3;

public abstract class Employee {
    // Fields
    private int id;
    private String name;
    private double baseSalary;

    // Parameterized constructor
    public Employee(int id, String name, double baseSalary){
        setId(id);
        setName(name);
        setBaseSalary(baseSalary);
    }

    // Setters
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    // Getters
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayInfo(){
        System.out.println("ID: " +id);
        System.out.println("Name: " +name);
        System.out.println("Base Salary: " +baseSalary);
    }
}
