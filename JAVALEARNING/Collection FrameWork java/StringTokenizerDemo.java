import java.io.FileInputStream;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args)throws Exception {
        FileInputStream fis = new FileInputStream("Student.txt");
        byte b[] = new byte[fis.available()];
        fis.read(b);
        String data = new String(b);


        StringTokenizer st = new StringTokenizer(data, "=");
        String s ;
        while(st.hasMoreTokens()){
            s = st.nextToken();
            System.out.print(s + " ");
        }
        fis.close();
    }
}
