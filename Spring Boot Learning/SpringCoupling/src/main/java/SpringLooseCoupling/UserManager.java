package SpringLooseCoupling;



public class UserManager  {
    UserDataProvider udp;
    public UserManager(UserDataProvider udp) {
        this.udp = udp;
    }

    public String getUserData() {

        return udp.getData();
    }
}
