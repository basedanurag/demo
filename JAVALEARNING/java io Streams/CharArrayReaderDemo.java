import java.io.CharArrayReader;

public class CharArrayReaderDemo {
    // program for char array reader 
    public static void main(String[] args)throws Exception {
        char[] c = {'a','b', 'c', 'd'};
        CharArrayReader car = new CharArrayReader(c);

        int x ;
        while( (x = car.read()) != -1){
            System.out.print((char)x);
        }
        car.close();
    }
}
