
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class BufferOutputStreamdemo {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("Text2.txt");
        BufferedOutputStream bop = new BufferedOutputStream(fos);
        String str = "hello hii kaise ho ";

        bop.write(str.getBytes());

        FileReader fr  = new FileReader("Text2.txt");
        int x;
        while((x=fr.read()) != -1){
        System.out.println((char)x);
        }
        bop.close();
        fos.close();
        fr.close();

    }
}
