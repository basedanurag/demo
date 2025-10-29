package SpringLooseCoupling;

public class UserDatabase implements UserDataProvider {
    @Override
    public String getData(){
        return "fetching data from database";
    }
}
