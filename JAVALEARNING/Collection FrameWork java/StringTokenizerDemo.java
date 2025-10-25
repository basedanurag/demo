import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args)throws Exception {
        FileInputStream fis = new FileInputStream("Data.txt");
        byte b[] = new byte[fis.available()];
        fis.read(b);
        String data = new String(b);


        StringTokenizer st = new StringTokenizer(data, ",");
        String s;
        ArrayList<Integer> als = new ArrayList<>();

        while(st.hasMoreTokens()){
            s= st.nextToken();
            als.add(Integer.valueOf(s));
            
        }
        System.out.println(als);
        fis.close();
    }
}
