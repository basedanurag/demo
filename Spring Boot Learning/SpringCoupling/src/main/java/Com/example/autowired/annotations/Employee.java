package Com.example.autowired.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("employee")
public class Employee {
    @Value("#{1}")
    private int EmployeeId;
    @Value("Anurag ")
    private String  FirstName;
    @Value("Srivastava")
    private String lastName;
    @Value("#{900000 * 12}")
    private double salary;

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId( int employeeId) {
        EmployeeId = employeeId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId='" + EmployeeId + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
