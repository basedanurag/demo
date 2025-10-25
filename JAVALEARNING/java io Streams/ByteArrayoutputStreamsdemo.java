import java.io.*;
public class ByteArrayoutputStreamsdemo {
    public static void main(String[] args)throws Exception {
       
        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
        bos.write('s');
        bos.write('a');
        bos.write('l');
        bos.write('e');
        bos.write('i');
        bos.write('s');
        bos.write('l');
        bos.write('i');
        bos.write('v');
        bos.write('e');
        byte[] b = bos.toByteArray();
        for(byte bb : b)
        System.out.print((char)bb);
        bos.close();
    }
}
