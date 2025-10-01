import java.io.*;
import java.util.Scanner;
class CustomerStream implements Serializable {
    String custId ;
    String name ;
    String phonenumber;
     
    static int count = 0;
    CustomerStream(){

    }
    CustomerStream(String name , String phonenumber){
        count++;
        custId = "C" + count; 
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public String toString(){
        return "custId " +custId + "\nname " +name+ "\nphonenumber " + phonenumber;
    }
}

public class StudentChallangeStream2 {
    // public static void main(String[] args)throws Exception {
    //     CustomerStream [] list = {new CustomerStream("anurag", "9711860790") , new CustomerStream("manan", "84279827418231")};

    //     FileOutputStream fos  = new FileOutputStream("Customer.txt");
    //     ObjectOutputStream oos = new ObjectOutputStream(fos);
    //     oos.writeInt(list.length);
    //     for (CustomerStream c : list){
    //        oos.writeObject(c);

    //     }

    //     fos.close();
    //     oos.close();
    // }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileInputStream  fis = new FileInputStream("Customer.txt");
        ObjectInputStream ois  = new ObjectInputStream(fis);

        int stp = ois.readInt();
        CustomerStream[] list =  new CustomerStream[stp];

        for(int i  = 0; i < stp; i++){
            list[i] =(CustomerStream) ois.readObject();
        }
        System.out.println("Enter the name");
        String name = sc.next();
        for(int i = 0; i < stp; i++){
            if (name.equalsIgnoreCase(list[i].name)){
                System.out.println(list[i]);
            }
        }
        sc.close();
        fis.close();
        ois.close();
    }
}
