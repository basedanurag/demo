
import java.util.*;
import java.io.*;

class Accounts implements Serializable {
     String accNum;
     String Name;
     double balance;

    public Accounts(){

    }
    public Accounts(String accNum, String name, double balance){
        this.accNum = accNum;
        this.Name = name;
        this.balance = balance;
    }

    public String toString(){ 
        return "Account number :\n "+ accNum +"Name : \n"+ Name + "balance:  "+ balance;
    }
}
public class MenuDrivenProgDemo {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       Accounts acc = null;
       HashMap<String, Accounts> hm = new HashMap<>();

       try (FileInputStream fis = new FileInputStream("Accounts.txt");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
            int count = ois.readInt();
            for(int i = 0; i < count ; i++){
                acc = (Accounts)ois.readObject();
                System.out.println(acc);
                hm.put(acc.accNum, acc);
            }
       } catch (Exception e) {
           // File might not exist yet, that's okay for first run
       }
         FileOutputStream fos = new FileOutputStream("Accounts.txt");
         ObjectOutputStream oos = new ObjectOutputStream(fos);

         int choice;
         String accNum, Name;
         double balance;
         do{
            System.out.println("1.Create Account");
            System.out.println("2.Delete Account");
            System.out.println("3.view Account");
            System.out.println("4.view all Account");
            System.out.println("5.save Account");
            System.out.println("choose your option");
            choice = sc.nextInt();
            sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            switch (choice) {
                case 1:System.out.println("Enter details ");
                System.out.println("Account number = ");
                accNum = sc.next();
                sc.nextLine(); // consume the remaining newline
                System.out.println("User Name = ");
                Name = sc.nextLine(); // use nextLine() to read full name
                System.out.println("balance = ");
                balance = sc.nextDouble();

                acc = new Accounts(accNum,Name,balance);
                hm.put(accNum,acc);
                System.out.println("Account Created for : "+ Name);
                    break;
            case 2 : System.out.println("enter the account number you want to delete");
            System.out.println("Account number");
            accNum = sc.next();
            hm.remove(accNum);
            System.out.println("Account removed");
                    break;
            case 3: System.out.println("enter details to view account");
            System.out.println("enter account number : ");
            accNum = sc.next();
            System.out.println("the account details are : " +hm.get(accNum));
            break;
            case 4:
            for(Accounts a: hm.values()){
                System.out.println(a);
            }
            
            break;
            case 5:System.out.print("saving all accounts...");
            System.out.println("Account saved");
            break;

            case 6: oos.writeInt(hm.size());

                for(Accounts a : hm.values()){
                    oos.writeObject(a);
                }
                break;
                default : System.out.println("Wrong choice");
                break;
            }
         }
         while (choice != 6); 
            fos.close();
            oos.close();
            sc.close();
            
         
         

    }
}