import java.util.*;

class Points implements Comparable{
    int x, y;
    public Points(int x, int y){
        this.x = x;
        this.y  = y;
    }
    public String toString(){
        return " x = "+ x + " y = "+y;
    }
    public int compareTo(Object o){
        Points p = (Points) o;
        if (this.x < p.x){
            return -1;
        }
        if(this.x> p.x){
            return 1;
        }
        else{
             if (this.y < p.y)
            return -1;
        
            if(this.y> p.y)
            return 1;
            else
            return 0; 
        }
        
    }
}
public class ComparableInterfaceDemo {

    public static void main(String[] args) {
      TreeSet<Points> p = new TreeSet<>();
      p.add(new Points(5, 7));
      p.add(new Points(6, 2));
      p.add(new Points(4, 9));

         System.out.println(p);

    }
}
