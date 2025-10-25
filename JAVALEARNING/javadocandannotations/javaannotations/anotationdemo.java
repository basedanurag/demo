

abstract class My {
    abstract public void display();
    abstract public void show();
}
class  B extends My{
     // there are two types of annotation 
    //user defined pre built and user defined
    @Override // this will give error if the method is not overridden 
    public void display(){
        System.out.println("hello");
    }
    @SuppressWarnings("Deprecated")
    @Deprecated
    public void show(){
        System.out.println("hii");
    }
}

public class anotationdemo {
   
    
    public static void main(String[] args) {
        
    
       B b = new B();
       
        b.show();
    }

}
