class TV{
    public void switchOn(){ System.out.println("TV is switched on");}
    public void changeaChannel(){ System.out.println("TV  channel is changed");}


}
class SmartTv extends TV{
    @Override
    public void switchOn(){ System.out.println("smartTV is switched on");}
    @Override
    public void changeaChannel(){ System.out.println("smartTV  channel is changed");}
    public void browsing(){ System.out.println("smartTv is browsing");}
}

public class overridingTv {
    public static void main(String[] args) {
        TV t = new TV();   
        t.switchOn();
        t.changeaChannel();
        SmartTv s = new SmartTv();
        t.switchOn();
        t.changeaChannel();
        s.browsing();
        // dynamic method dispatch
        TV t1 = new SmartTv();
        t1.switchOn();
        t1.changeaChannel();

    }
}
