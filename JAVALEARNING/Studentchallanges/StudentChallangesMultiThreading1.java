class ATM{
    synchronized public void checkBalance(String name){
         System.out.println(name + " started checking balance at time: " + System.currentTimeMillis());
         try{
            Thread.sleep(1000);
         }catch(InterruptedException e){
            System.out.println("Operation interrupted: " + e.getMessage());
         }
         System.out.println(name + " finished checking balance at time: " + System.currentTimeMillis());
    }
    
    synchronized public void withdraw(String name, int amount){
        System.out.println(name + " started withdrawing Rs." + amount + " at time: " + System.currentTimeMillis());
        try{
            Thread.sleep(1000);
         }catch(InterruptedException e){
            System.out.println("Operation interrupted: " + e.getMessage());
         }
         System.out.println(name + " finished withdrawing Rs." + amount + " at time: " + System.currentTimeMillis());
    }
}
class Customer extends Thread{
    String name;
    int amount;
    ATM d;
    public Customer(String name, int amt, ATM atm){
        this.name = name;
        this.amount = amt;
        this.d = atm;
    }
    public void useATM(){
        d.checkBalance(name);
        d.withdraw(name, amount);
        
    }
    public void run(){
        useATM();
    }
}

public class StudentChallangesMultiThreading1 {
    public static void main(String[] args) {
        ATM d = new ATM();
       Customer c1 = new Customer("Anurag", 90000, d);
       Customer c2 = new Customer("manan", 987331, d);
        c1.start();
        c2.start();
    }
}
