package Assignment3;

public class Intern extends Employee{
    // Parameterized constructor
    public Intern(int id, String name){
        super(id,name,0);
    }

    // Overridden method
    @Override
    public double calculateSalary(){
        return 3000;
    }
}
