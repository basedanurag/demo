class product {
    private long itemno = 131232310313L;
    private String name = "ANyuwhfruwe87yrwehfuwh";
    private double price;
    private int qty;
    
    //methods 
    public product(){
        itemno = 236423434224832904L;
        name = "Dog food";
        price = 70.587;
        qty = 5;
    }
    public product( double p, int q){

        getItemNo();
        getName();
        setPrice(p);
        setQty(q);
    }
    public product(long i, String s, double d, int q){
        itemno = i;
        name = s;
        setPrice(d);
        setQty(q);
        

    }
    //readable get methods
    public long getItemNo(){
        return itemno;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }

    // set methods 
     
    public void setPrice(double p){
        price =p;
    }
    public void setQty(int q){
        qty = q;
    }
    public String prodDetails(){
        return "product name :-" + name + "\n"
            + "product item number:- " + itemno + "\n"
            + "product Price:- " + price + "\n"
            + "product marks Quantity: " + qty + "\n";
    }


}
public class ProductAndCustomer {
    public static void main(String[] args) {
        System.out.println("the product details are" );
        product pr = new product(72381.1379173,10);
        System.out.println("these are the details" +pr.prodDetails());
    }
}
