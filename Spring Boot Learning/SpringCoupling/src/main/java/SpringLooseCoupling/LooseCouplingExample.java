package SpringLooseCoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LooseCouplingExample {


    public static void main(String[] args) {
        //these all are the previous
//        UserDataProvider udp = new UserDatabase();
//        UserManager um = new UserManager(udp);
//        System.out.println(um.getUserData());
//
//        UserDataProvider udp2 = new WebDataprovider();
//        UserManager um2 = new UserManager(udp2);
//        System.out.println(um2.getUserData());
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationcontextforloosecoupling.xml");
       UserManager userManager = (UserManager) context.getBean("userData");
        System.out.println(userManager.getUserData());
       UserManager userManager1 = (UserManager) context.getBean("webData");
        System.out.println( userManager1.getUserData());

    }
}
