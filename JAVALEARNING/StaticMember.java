class HondaCity{
    static long price = 237131373L;
    int a,b;
    static double OnRoadPrice(String city){
        switch (city) {
            case  "Delhi":
            return (double) price + price * 0.01;
                
            case  "Mumbai":
            return (double) price + price * 0.09;
        }
        return price;
        
    }
}
class Test{
    static void method1(){
        System.out.println("method 1");

    }
    static void method2(){
        System.out.println("method 2");
    }
}

public class StaticMember {

     static 
     {
        System.out.println("method 1");

    }
    static
    {
        System.out.println("method 2");
    }
    public static void main(String[] args) {
        
        System.out.println(HondaCity.OnRoadPrice("Delhi"));
    }
}
