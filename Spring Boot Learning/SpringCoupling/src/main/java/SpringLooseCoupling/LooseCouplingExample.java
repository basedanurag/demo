package SpringLooseCoupling;

public class LooseCouplingExample {


    public static void main(String[] args) {
        UserDataProvider udp = new UserDatabase();
        UserManager um = new UserManager(udp);
        System.out.println(um.getUserData());

        UserDataProvider udp2 = new WebDataprovider();
        UserManager um2 = new UserManager(udp2);
        System.out.println(um2.getUserData());
    }
}
