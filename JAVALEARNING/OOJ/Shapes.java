package OOJ;
class Rectangle {
    public double length;
    public double breadth;
    public double area(){
        return length * breadth;
    }
    public double perimeter(){
        return 2*( length + breadth);
    }
}
//here learning how to write a class
class Shapes {
    public static void main(String[] args){
       Rectangle R1 = new Rectangle();
       R1.length = 5;
       R1.breadth = 6;
       System.out.println("Area" + R1.area());
       System.out.println("Perimeter" + R1.perimeter());
    }
}