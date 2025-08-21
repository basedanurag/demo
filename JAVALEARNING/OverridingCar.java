class Car{
    public void Start(){
        System.out.println("car is started");
    }
    public void accelerate(){
        System.out.println("car is accelerated");
    }
    public void changeGear(){
        System.out.println("car gear changed");
    }
    
}
class LuxuryCar extends Car{
    public void changeGear(){
        System.out.println("Automatic car gear changed");
    }
    public void openRoof(){
        System.out.println("sun roof opened");
    }
}


public class OverridingCar {
    public static void main(String[] args) {
        // object of car
        Car c = new Car();
        c.Start();
        c.accelerate();
        c.changeGear();
        // object of luxury car
        LuxuryCar cc = new LuxuryCar();
        cc.Start();
        cc.accelerate();
        cc.changeGear();
        cc.openRoof();
        //dynamic method dispatch
        Car c2 = new LuxuryCar();
        c2.Start();
        c2.accelerate();
        c2.changeGear();
    }
}
