interface MyLambda {
    public void display();
    
}
class useLambda{
    public void callLambda(MyLambda n){
        n.display();
    }
}
class Demo{
    public void method1(){
        useLambda u = new useLambda();
        u.callLambda(() ->{System.out.println("hello");});
    }
}
public class Lambdademo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
    }
}
