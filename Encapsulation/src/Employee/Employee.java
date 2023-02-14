package Employee;
import Company.Company;

public class Employee {
    private String name;
    private String employeeID;
    private String employeeEmail;
    private String age;
    private Company company;

    //default constructor
    public Employee(){

    }

    public Employee(String name, String employeeID, String employeeEmail, String age, Company company) {
        this.name = name;
        this.employeeID = employeeID;
        this.employeeEmail = employeeEmail;
        this.age = age;
        this.company = company;
    }

    public Employee(String name){
         
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 4){
            this.name ="Not a vaild name!";
        }
        this.name = name;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    

    public void employeeInformation(){
        System.out.println("Employee Name: " + this.getName());
        System.out.println("Employee ID: " + this.getEmployeeID());
        System.out.println("Employee email: " + this.getEmployeeEmail());
        System.out.println("Employee age: " + this.getAge());
        System.out.println("Company name: " + this.getCompany().getName());

    }

  
    
}
