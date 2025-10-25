@FunctionalInterface 
interface MyLambda0 {
    public void display();
}
class my implements MyLambda0 {
    public void display(){
        System.out.println("hello from inheritance ");
    }
}
public class intro{
    public static void main(String[] args) {
        MyLambda0 m1 = new my(); // object for calling
        MyLambda0 m = () -> {System.out.println("hello world from lambda expression");}; // this is the lambda expression
        m.display();
        m1.display();
    }
}