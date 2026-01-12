package Assignment3;

public class BusinessSystem {
    static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Manager(1, "Mahmoud", 10000,2000);
        employees[1] = new SalesPerson(2, "Sara", 15000,1000);
        employees[2] = new Intern(3, "Omar");

        for(int i=0;i<employees.length; i++){
            employees[i].displayInfo();
            double salary = employees[i].calculateSalary();
            System.out.println("Salary: "+salary);
        }
    }
}
