class ATM{
    synchronized public void checkBalance(String name){
         System.out.println("user "+ name+" checking balance" );

    }
    synchronized public void withdraw(String name , int amount){
        System.out.println("user "+ name+" withdrawing money" + " " +amount );
    }
}
class Mythread1 extends Thread{
    ATM d;
    public Mythread1(ATM data){
        this.d = data;
    }
    public void run(){
        d.checkBalance("Anurag");
        d.withdraw("Anurag", 9000);
    }
}
class Mythread2 extends Thread{
    ATM d;
    public Mythread2(ATM data){
        this.d = data;
    }
    public void run(){
        d.checkBalance("manan");
        d.withdraw("manan", 7000);
    }
} 
public class StudentChallangesMultiThreading1 {
    public static void main(String[] args) {
        ATM d = new ATM();
        Mythread1 t1 = new Mythread1(d);
        Mythread2 t2 = new Mythread2(d);

        t1.start();
        t2.start();
    }
}
