package Car.example.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext
                = new ClassPathXmlApplicationContext("applicationcontextbean.xml");
        MyBean myBean = (MyBean) applicationContext.getBean("myBean");
        String string = myBean.toString();
        System.out.println(string);
    }


}
