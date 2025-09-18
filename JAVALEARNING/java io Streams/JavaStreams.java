import java.io.*;
public class JavaStreams {
    public static void main(String[] args) {
        try {
             FileOutputStream fos = new FileOutputStream("Test.txt");
             fos.close();
        } catch (Exception e) {}
       
    }
}
