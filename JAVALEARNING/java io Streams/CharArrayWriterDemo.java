import java.io.CharArrayWriter;

public class CharArrayWriterDemo {
    public static void main(String[] args) throws Exception{
        char[] c = {'a','b', 'c', 'd'};
    CharArrayWriter caw = new CharArrayWriter();
   
    caw.write(c);
     caw.append(" ajhbasfhjga");
        char[] c2  = caw.toCharArray();
        for(char cc : c2){
            System.out.print(cc);
        }
        caw.close();
    }
}
