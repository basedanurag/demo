import java.io.*;
public class JavaStreams {
    public static void main(String[] args) {
        try {
             FileOutputStream fos = new FileOutputStream("Test2.txt");
             String str = "hello this is me learning streams";
                byte b[] = str.getBytes();

             //   for(byte x : b)
                    fos.write(b,5,str.length()-5);
             
             fos.close();
        } catch (Exception e) {}
       
    }
}
