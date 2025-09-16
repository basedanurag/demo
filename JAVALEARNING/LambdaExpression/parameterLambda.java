
@FunctionalInterface 
interface MyLambda {
    public void display(String name);
}
class my implements MyLambda {
    public void display(String name ){
        System.out.println("hello from inheritance ");
    }
}
public class parameterLambda {
    public static void main(String[] args) {
        MyLambda m1 = new my(); // object for calling
        MyLambda m = (s) -> {System.out.println(s);}; // this is the lambda expression overriding 
        m.display("hello from lambda expression ");
        m1.display("hello from method overriding expression ");
    }  
}
