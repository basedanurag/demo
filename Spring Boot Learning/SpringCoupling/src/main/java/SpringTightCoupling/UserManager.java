package SpringTightCoupling;

public class UserManager {
    UserDatabase object = new UserDatabase();
        public String getData(){
            return object.getUserData();
        }
}
