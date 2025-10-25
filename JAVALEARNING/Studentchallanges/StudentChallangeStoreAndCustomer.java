interface members{
    void callBack();
}
class customer implements members{
    String name ;
    customer(String n){
        this.name =  n;
    }
    @Override
   public void callBack(){
        System.out.println("ok, i will attend");
    }
}
class store   {
    members[] mem = new members[200];
    int count;
    void register(members  m){
        mem[count++] = m;  

    }
    public void inviteSale(){
        for( int i = 0;i  < count; i++){
            mem[i].callBack();
        }
    }

}
public class StudentChallangeStoreAndCustomer {
    public static void main(String[] args) {
        store s = new store();
        customer c1  = new customer("Anurag");
        s.register(c1);
        s.inviteSale();
    }
}
