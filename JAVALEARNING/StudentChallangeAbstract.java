abstract class Shape{
   public Shape(){System.out.println("shapes constructor");}
    abstract void parameter();
    abstract void area();
}
class circle extends Shape{
    public void parameter(){
        System.out.println("parameter of circle");
    }
    public void area(){
        System.out.println("area of circle");
    }

}
class Rectangle extends Shape{
    public void parameter(){
        System.out.println("parameter of Rectangle");
    }
    public void area(){
        System.out.println("area of Rectangle");
    }

}

public class StudentChallangeAbstract {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        Shape s2 = new circle();
        s.area();
        s.parameter();
        s2.area();
        s2.parameter();9
    }
}
