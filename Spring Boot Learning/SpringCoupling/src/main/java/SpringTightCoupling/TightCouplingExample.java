package SpringTightCoupling;

public class TightCouplingExample {


    public static void main(String[] args) {
        UserManager um = new UserManager();
        System.out.println(um.getData());
    }
}
