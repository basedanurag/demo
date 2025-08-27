package mypack1;

public class Demo {
    int x = 10;
    public int y= 20;
    private int z= 30;
    protected  int a = 40;
    public int sum = 0;

    public void display(){
        sum = a+x+y+z;
        System.out.println("hello from demo 1 " + sum );

    }
}
