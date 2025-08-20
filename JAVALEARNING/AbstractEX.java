abstract class Super {
    public  Super(){
        System.out.println("Super constructor");
    }
    abstract void method2();
}
class sub extends Super{
  @Override
   void method2(){
    System.out.println("sub method 2");
   }
}

public class AbstractEX {
    public static void main(String[] args) {
        Super s = new sub();

        s.method2();
      
    }
}
