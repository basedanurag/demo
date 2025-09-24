import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable {
    private int rollnum;
    private String name;
    private String dept;
    static int data = 10;

    public Student(){

    }
    public Student(int roll, String name, String dept){
            this.rollnum = roll;
            this.name = name;
            this.dept = dept;
            data = 5000;
    }
    public String toString(){
        return "\n Student Details\n"+
                "\n roll number :"+ rollnum+
                "\n name :"+ name+
                "\n department :" + dept;
    }
}
public class ObjectStreamAndSerialisationdemo {
 public static void main(String[] args) throws Exception { 
    /// code for writing the object in afile
    /// 
    FileOutputStream fos  = new FileOutputStream("Student.txt");
    ObjectOutputStream oop = new ObjectOutputStream(fos); 

    Student s = new Student(11, "Anurag Srivastava", "CSE");
    oop.writeObject(s);
    oop.close();
    fos.close();
 
     
    FileInputStream fis = new FileInputStream("Student.txt");
   ObjectInputStream ois = new ObjectInputStream(fis);
    Student s2 = (Student)ois.readObject();
    System.out.println(s2);
   fis.close();
   ois.close();

 }   
}
