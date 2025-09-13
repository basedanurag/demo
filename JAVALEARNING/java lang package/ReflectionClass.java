class My{
    //private int a; class ke bahar accesable nahi hai 
    protected int b;
    public int c;
    int d;
    
    public My() {}
    
    public My(int x,int y) {}
    
    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}
}
public class ReflectionClass {
    public static void main(String[] args) {
        Class  c = My.class; //1st method for geting all the info about the class
        My m = new My();
        Class  c1 = m.getClass();
        System.out.println( " "+ c1);
    }
}
