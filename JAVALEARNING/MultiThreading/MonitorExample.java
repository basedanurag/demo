class MyData{ //class to achive synchronisation
    synchronized public void display(String s){
        for(int i = 0; i <s.length(); i++){
            System.out.print(s.charAt(i));
        }
    }
}
class MyThread1 extends Thread{
    MyData d;
    public MyThread1( MyData data){
        this.d = data;
    }
    public void run(){
        d.display("hello world");
    }
}
class MyThread2 extends Thread{
    MyData d;
    public MyThread2( MyData data){
        this.d = data;
    }
    public void run(){
      d.display(" kaise ho sab wdhgwsvbdfjashDBCJHASB");
    }
}


public class MonitorExample {
    public static void main(String[] args) {
        MyData d = new MyData();
        MyThread1 t1 = new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);

        t1.start();
        t2.start();
    }
}
