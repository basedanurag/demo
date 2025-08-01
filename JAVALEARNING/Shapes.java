//rectangle class
class Rectangle {
    public double length;
    public double breadth;
    public double area(){
        return length * breadth;
    }
    public double perimeter(){
        return 2*( length + breadth);
    }
    public boolean isSquare(){
        if ( length == breadth){
            return true;
        }
        return false;
    }
}
//here learning how to write a class
class Cylinder{
    public double radius;
    public double height;
    public double lidArea(){
        return Math.PI*radius *radius;
    }
    public double totalSurfaceArea(){
        return 2 * lidArea() + circumference() *height;
    }
    public double circumference(){
        return 2 * Math.PI * radius;
    }
    public double volume(){
        return lidArea() * height;
    }

}
public class Shapes {
    public static void main(String[] args){
        Cylinder c = new Cylinder();
       Rectangle R1 = new Rectangle();
       R1.length = 5;
       R1.breadth = 6;
       //radius and height of the cylinder 
       c.radius = 7;
       c.height = 10;
       System.out.println("Area " + R1.area());
       System.out.println("Perimeter " + R1.perimeter());
       System.out.println("Square " + R1.isSquare());


       System.out.println("lid Area " + c.lidArea());
       System.out.println("total Surface Area " + c.totalSurfaceArea());
       System.out.println("circumeference " + c.circumference());
       System.out.println("volume " + c.volume());
    }
}