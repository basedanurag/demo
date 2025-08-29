class Rectangle{
    private double length;
    private double breadth;
    public double getLength(){
        return length;
    }
    public double getBreadth(){
        return breadth;
    }
    public void setLength(double l){
      if(l > 0)
        length = l;
      else
        length =0;
    }
    public void setBreadth(double b){
      if(b > 0)
        breadth = b;
      else
       breadth =0;
    }

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
   public Rectangle(){
      length = 1;
      breadth = 3;

   }
   public Rectangle(double l , double b){
      setBreadth(b);
      setLength(l);

   }
   public Rectangle(double s){
      length = breadth = s;
   }
}
class Cylinder{
    private double radius;
    private double height;
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
    public Cylinder(){
      radius = 1;
      height = 1;
   }
   public Cylinder(double r){
      radius = r;
      height = 1;
   }
   public Cylinder(double r, double h){
      setHeight(h);
      setRadius(r);
   }
     public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }
    public void setRadius(double l){
      if(l > 0)
        radius = l;
      else
        radius =0;
    }
    public void setHeight(double b){
      if(b > 0)
        height = b;
      else
        height =0;
    }

}
public class Constructors {
   // in this i will learn about the constructors
   public static void main(String[] args) {
      Rectangle r  = new Rectangle(-19,-2);
      System.out.println("the area is " + r.getLength());
      Cylinder c = new Cylinder(9,7);
      System.out.println("the cylinder lid area " + c.lidArea());
      
   }
}
