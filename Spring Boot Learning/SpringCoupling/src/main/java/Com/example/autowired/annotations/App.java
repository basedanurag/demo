package Com.example.autowired.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //bean name should be same as mentioned in the class path
        Employee employee =  applicationContext.getBean("employee", Employee.class);
        System.out.println(employee.toString());

        Manager manager = applicationContext.getBean("manager", Manager.class);
        System.out.println(manager.toString());
    }
}
