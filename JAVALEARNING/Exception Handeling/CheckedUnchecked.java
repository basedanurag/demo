import java.io.*;
public class CheckedUnchecked {
    void method4(){
        try {
            FileInputStream fi= new FileInputStream("my.txt");
 fi.close();
        } catch (Exception e) {
           System.out.println("file not found");
           
        }
    }
    void method1(){
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
            
        }
        System.out.println("bye");
    }
    void method2(){
        method1();
    }
    void method3(){
        method2();
    }
    public static void main(String[] args) {
        CheckedUnchecked c= new CheckedUnchecked();
        c.method3();
        c.method4();
    }
}
