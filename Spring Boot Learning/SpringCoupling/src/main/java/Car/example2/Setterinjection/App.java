package Com.example.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationcontextconstructorinjection.xml");
        Car car = (Car) context.getBean("myCar");
        car.getDispay();

    }
}
