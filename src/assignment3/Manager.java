package assignment3;

public class Manager extends Employee{
    // Fields
    private double bonus;

    // Parameterized constructor
    public Manager(int id, String name, double baseSalary, double bonus){
        super(id,name,baseSalary);
        this.bonus = bonus;
    }

    // Overridden method
    @Override
    public double calculateSalary(){
        return getBaseSalary()+bonus;
    }
}
