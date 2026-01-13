package Assignment3;

public class SalesPerson extends Employee{
    // Fields
    private double commission;

    // Parameterized constructor
    public SalesPerson(int id, String name, double baseSalary, double commission){
        super(id,name,baseSalary);
        this.commission = commission;
    }

    // Overridden method
    @Override
    public double calculateSalary(){
        return getBaseSalary()+commission;
    }
}
