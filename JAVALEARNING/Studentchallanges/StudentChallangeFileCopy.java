import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class StudentChallangeFileCopy {
    public static void main(String[] args) throws Exception {
        // creating a new file 
        FileWriter fr = new FileWriter("D:/demo/JAVALEARNING/java io Streams/Test1.txt");

        String str  = "Hello this is me creating the file";
        fr.write(str.toUpperCase());
        fr.close();
        //reading a file and copying it
        FileInputStream fis = new FileInputStream("D:/demo/JAVALEARNING/java io Streams/Test1.txt");
        byte b[] = new byte[fis.available()];

        String str2 = new String(b).toLowerCase();
        System.out.print("the content that has been copied is " + str2);
        //pasting the content in another file 
        FileOutputStream fos = new FileOutputStream("D:/demo/JAVALEARNING/java io Streams/Test2.txt");
        byte b2[] = str2.getBytes();
            fos.write(b2);
            fis.close();
            fos.close();


    }
}
