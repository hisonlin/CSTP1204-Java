import Employee.Employee;
import Company.Company;

public class App {
    public static void main(String[] args) throws Exception {
        Company VCC = new Company("VCC", "Down Town", 2000);
        Employee Hison = new Employee("Hison", "123", "hison@gmail.com", "30", VCC);

        Hison.employeeInformation();

        
    }
}
