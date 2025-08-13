class Super{

    public void display(){
        System.out.println("hello kaise ho this is a Super or parent class");
    }
}
class sub extends Super{
      @Override
    public void display(){
         System.out.println("hello kaise ho this is a Sub class or child class");
    }
}
public class overriding {
    // practising over riding + Dynamic method dispatch
    public static void main(String[] args) {
      Super s = new sub(); // why error ?
      s.display();
    }
}
