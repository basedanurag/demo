class MyData{
    int value;
    boolean flag = true;

    synchronized public void set(int data){
        while(flag != true)try {wait();} catch (Exception e) {}
        
        this.value = data;
        flag = false;
        notify();
    }
    synchronized public int get(){
         while(flag != false)try {wait();} catch (Exception e) {}
        
        int x = value;
        flag = true;
        notify();
        return x;
    }
}
class Producer extends Thread{
    MyData d;
    public Producer(MyData data){
        this.d = data;
    }
   public void run(){
    int count =1;
    while(true){
        d.set(count);
        System.out.println( "producer "+count);
        count++;
    }
   }
}
class Consumer extends Thread{
    MyData d;
    public Consumer(MyData data){
        this.d = data;
    }
   public void run(){
    
    while(true){
    
     System.out.println("consumer" +d.get());
    }
   }
}
public class InterComuniccation {
    public static void main(String[] args) {
        MyData d  = new MyData();
        Producer p = new Producer(d);
        Consumer c = new Consumer(d);

        p.start();
        c.start();
    }
}
