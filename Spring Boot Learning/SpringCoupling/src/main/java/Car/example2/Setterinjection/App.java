package Car.example2.Setterinjection;

import Car.example2.Setterinjection.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationcontextsetterinjection.xml");
        Car car = (Car) context.getBean("myCar");
        car.getDispay();

    }
}
