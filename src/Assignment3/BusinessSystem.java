package Assignment3;

public class BusinessSystem {
    static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Manager(1, "Mahmoud", 10000,2000);
        employees[1] = new SalesPerson(2, "Sara", 15000,1000);
        employees[2] = new Intern(3, "Omar");

        for(int i=0;i<employees.length; i++){
            employees[i].displayInfo();
            System.out.println("Salary: "+employees[i].calculateSalary());
            checkType(employees,i);
        }
    }
    static void checkType(Employee[] employees,int i){
        if(employees[i] instanceof Manager){
            System.out.println("Type is manager");
        }
        else if(employees[i] instanceof SalesPerson){
            System.out.println("Type is sales person");
        }
        else{
            System.out.println("Type is intern");
        }
    }
}
