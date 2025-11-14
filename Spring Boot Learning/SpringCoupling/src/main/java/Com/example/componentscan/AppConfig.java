package Com.example.component.annotations;

import org.springframework.context.annotation.ComponentScan;

public class AppConfig {
    Employee employee;
    @ComponentScan("Com.example.component.annotations")
    public AppConfig(Employee employee) {
        this.employee = employee;
    }

}
