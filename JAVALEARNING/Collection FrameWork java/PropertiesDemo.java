import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesDemo {
    //iske andar key and value both are strings
    public static void main(String[] args) throws Exception {
        Properties ps = new Properties();
        // ps.setProperty("1","Hello" );
        // ps.setProperty("2","How" );
        // ps.setProperty("3","are" );
        // ps.setProperty("4","you" );
        // ps.storeToXML(new FileOutputStream("MyFileDemo.xml"), "My name is Anurag Srivasytava and this is my laptop of Lenov brand" );
        ps.loadFromXML(new FileInputStream("MyFileDemo.xml"));
        System.out.println(ps);
        ps.forEach((k,v)-> System.out.println(k+" "+ v));
    }
}
