import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.SequenceInputStream;
public class StudentChallangeSequenceInputStream {
    public static void main(String[] args) throws Exception {
        FileInputStream fis1 = new FileInputStream("d:/demo/JAVALEARNING/java io Streams/Test1.txt");
        FileInputStream fis2 = new FileInputStream("d:/demo/JAVALEARNING/java io Streams/Test2.txt");
        // using the sequence input stream
        SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
        FileOutputStream fos = new FileOutputStream("d:/demo/JAVALEARNING/java io Streams/Destination.txt");

        int b ;
        while((b = sis.read()) != -1){
             fos.write(b);
        }
       
       
        fis1.close();
        fis2.close();
        fos.close();
        sis.close();


    }
}
