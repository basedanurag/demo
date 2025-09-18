//import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class javaFileReader {
   public static void main(String[] args) {
    /*try (FileInputStream fis = new FileInputStream("D:/demo/JAVALEARNING/java io Streams/Test2.txt");) {
            
            byte b [] = new byte[fis.available()];
          
            fis.read(b);
            String str = new String(b);
            System.out.println(str);
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }
            */

        try (FileReader fr = new FileReader("D:/demo/JAVALEARNING/java io Streams/Test2.txt")) {
            int x;
            while(( x = fr.read()) != -1){
                System.out.print((char)x);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

   } 
}
