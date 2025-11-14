package Com.example.component;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("component.xml");
        //bean name should be same as mentioned in the class path
        Employee1 employee =  applicationContext.getBean("employee1", Employee1.class);
        System.out.println(employee.toString());
    }
}
