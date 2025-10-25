
//import java.io.DataOutputStream;
//import java.io.FileOutputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;

class Student{
    int roll;
    String Name;
    String Dept;
}
public class DataInputOutputStreamsdemo {
    public static void main(String[] args) throws Exception {
       /* FileOutputStream fos  = new FileOutputStream("MyText.txt");
        DataOutputStream dis = new DataOutputStream(fos);
        Student s = new Student();
        s.roll = 36;
        s.Name = "Anurag";
        s.Dept = "CSE";
        dis.writeInt(s.roll);
        dis.writeUTF(s.Name);
        dis.writeUTF(s.Dept);
        dis.close(); */

        FileInputStream fis  = new FileInputStream("MyText.txt");
        DataInputStream dis = new DataInputStream(fis);

         Student s = new Student();
        s.roll = dis.readInt();
        s.Name = dis.readUTF();
        s.Dept = dis.readUTF();
        System.out.println(s.roll +" " + s.Name +" " + s.Dept);
        
        dis.close();
    }
}
