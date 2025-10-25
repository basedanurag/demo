import java.io.ByteArrayInputStream;
public class ByteArrayInputStreamsdemo{
    public static void main(String[] args) throws Exception {
        byte b[] = {'a','b','c','d','e','f','g','h','i','j'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        //when reading all bytes at ones 
       /*  
        String str = new String(bis.readAllBytes());
        System.out.println(str);
        */
        // when reading byte by byte
       /* int x;
        while( (x = bis.read()) != -1){
                System.out.print((char) x);

        }*/

        bis.close();
    }
}