
//static class
class Outer4{
    int x  =10;
    static int y = 20;
  
        static class My{
            public void show(){
                System.out.println(" "+ y);
            }

        }
        public void display(){
            My m = new My();
            m.show();
        }
    
}

interface Ts{
    void showInterface();
}
class Outer3{
    public void display(){
        Ts t = new Ts() {
            @Override
            public void showInterface(){
                System.out.println("message from the interface class");
            }
        };
        t.showInterface();
    }
}

abstract class My{
    abstract void show();

}
class Outer2{
    public void display(){
       My m =  new My() {
            @Override
            void show() {
                
                System.out.println("hey this one is comming from abstract message");
            }
        };
        m.show();
    }
}

class Outer1{
    public void show(){
        class InnerCLass2{
            public void display(){
                System.out.println("hello");
            }
        }
        InnerCLass2 i2 = new InnerCLass2();
        i2.display();
    }
}
class Outer{
 int x  = 10;
 class InnerCLass1{
    int y  = 20;
    public void innerdisplay(){
        System.out.println(x);
        System.out.println(y);

    }

 }
 public void outerDisplay(){
    InnerCLass1 i = new InnerCLass1();
        i.innerdisplay();
 }
}
public class InnerCLass {
    public static void main(String[] args) {
        Outer.InnerCLass1 o = new Outer().new InnerCLass1();// ye line me hamne InnerClass1 ka object banaya hai islie 
        // x and y dono ko access kar pa rhe hai par method sirf inner class ke accesable hai 
        //outer class ke nhi 

        o.innerdisplay();
        Outer1 o1 = new Outer1();
        o1.show();
        Outer2 o2 = new Outer2();
       o2.display();
        Outer3 o3 = new Outer3();
       o3.display();
       Outer4 o4 = new Outer4();
       o4.display();
        
    }
}



