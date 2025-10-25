import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
//import java.io.FileOutputStream;
//import java.io.PrintStream;
class Student{
    int rollno;
    String name;
    String dept;
}
public class PrintStreamDemo {
    public static void main(String[] args)throws Exception {
      /*  FileOutputStream fos  = new FileOutputStream("MyText.txt");
        PrintStream p = new PrintStream(fos);

        Student s = new Student();
        s.rollno = 36;
        s.name = "Anurag";
        s.dept = "CSE";
        p.println(s.rollno);
        p.println(s.name);
        p.println(s.dept);

        fos.close();
        p.close(); */

        FileInputStream fis = new FileInputStream("MyText.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));
        Student s = new Student();
        s.rollno = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();
        System.out.println("roll number is "+s.rollno);
       System.out.println("name is "+s.name);
       System.out.println("Dept is "+s.dept);
       br.close();

    }
}
