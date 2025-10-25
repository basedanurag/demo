import java.io.FileInputStream;

public class JavaFileInputStreams {
    public static void main(String[] args) throws Exception{

        try (FileInputStream fis = new FileInputStream("D:/demo/JAVALEARNING/java io Streams/Test2.txt");) {
            
            byte b [] = new byte[fis.available()];
          
            fis.read(b);
            String str = new String(b);
            System.out.println(str);
            fis.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
