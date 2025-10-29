package SpringLooseCoupling;

public class WebDataprovider implements UserDataProvider{
    @Override
    public String getData(){
        return "fetching data from web database";
    }
}
