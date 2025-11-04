package SpringLooseCoupling;

public class UserDatabase implements UserDataProvider {
    private String datamsg;

    public void setDatamsg(String datamsg) {
        this.datamsg = datamsg;
    }

    @Override
    public String getData(){

        return datamsg;
    }
}
