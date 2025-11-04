package SpringLooseCoupling;

public class WebDataprovider implements UserDataProvider{
    private String  msg;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String getData(){
        return msg;
    }
}
