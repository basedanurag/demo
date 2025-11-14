package Com.example.autowired.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    //this is called the field injection where the @Autiwired annotation is configuring the values of Employee using spring
    @Autowired
    //Qualifer used to dedicate a bean to a class for autowiring it helps when there are more than 1 bean of same type but different name 
    @Qualifier("employee")

    private Employee employee;
    //This is Constructor Injection
//    @Autowired
//    public Manager(Employee employee) {
//        this.employee = employee;
//    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
