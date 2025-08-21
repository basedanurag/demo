 interface Test{
    void method1();
    void method2();
}
class New implements Test{
    public void method1(){
        System.out.println("method 1 of class new");
    }
    public void method2(){
        System.out.println("method 2 of class new");
    }
}
public class PracticeInterface {
    public static void main(String[] args) {
        Test m = new New();
        m.method1();
        m.method2();
    }
}
