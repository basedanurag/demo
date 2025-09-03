class MyThread extends Thread{
    public MyThread(String Name){
        super(Name);
        setPriority(Thread.MAX_PRIORITY);
    }
    public void run(){
        int count = 1;
        while(true){
            System.out.println(count++);
            try {
                 Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }
           
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        MyThread t= new MyThread("Anurag");

        System.out.println("ID "+ t.getId());
        System.out.println("Name "+ t.getName());
        System.out.println("state "+ t.getState());
        t.start();
        System.out.println("state2 "+ t.getState());
        System.out.println("Priority"+ t.getPriority());
        System.out.println("Alive"+ t.isAlive());
        t.interrupt();
        System.out.println("state3 "+ t.getState());
        try{
        t.stop();
        }catch (Exception e){
        System.out.println("state4 "+ t.getState() +e);
        }
        
    }
}
