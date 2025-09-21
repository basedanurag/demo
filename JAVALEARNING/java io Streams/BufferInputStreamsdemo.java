//import java.io.BufferedInputStream;

//import java.io.FileInputStream;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferInputStreamsdemo {
    public static void main(String[] args) throws Exception {
       /* FileInputStream fis  = new FileInputStream("Test2.txt");
        BufferedInputStream bis = new BufferedInputStream(fis) ;

        int x;
        while((x = bis.read()) !=-1){
            System.out.print((char) x);
        }
        bis.close();*/
        FileReader fr = new FileReader("Test2.txt");
        BufferedReader br = new BufferedReader(fr);
        

        //for a full line at once 
       // System.out.print(br.readLine());

       System.out.print((char)br.read());
      System.out.print((char)br.read());
      System.out.print((char)br.read());
      System.out.print((char)br.read());
      System.out.print((char)br.read());
      System.out.print((char)br.read());
      System.out.print((char)br.read());
       br.mark(10);
      System.out.print((char)br.read());
      System.out.print((char)br.read());
      System.out.print((char)br.read());
      System.out.print((char)br.read());
      System.out.print((char)br.read());
      System.out.print((char)br.read());
      System.out.print((char)br.read());
       br.reset();
       System.out.print((char)br.read());
      System.out.print((char)br.read());
      System.out.print((char)br.read());
      System.out.print((char)br.read());
      System.out.print((char)br.read());
      System.out.print((char)br.read());
      System.out.print((char)br.read());

        br.close();
    }
}
