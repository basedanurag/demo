import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StudentChallangeStream {
    public static void main(String[] args)throws Exception {
        FileOutputStream fos  = new FileOutputStream("Stream.txt");
        DataOutputStream dos  = new DataOutputStream(fos);
        float f[] = {1.2f,3.4f,5.6f,7.7f};
        dos.writeInt(f.length);
        for(float x: f){
            dos.writeFloat(x);
        }
        fos.close();
        dos.close();

        FileInputStream fis  = new FileInputStream("Stream.txt");
        DataInputStream dis  = new DataInputStream(fis);
        int length =dis.readInt();
        
        for (int i = 0; i < length; i++){
               System.out.println( dis.readFloat());
        }
        fis.close();
        dis.close();
    }   
}
