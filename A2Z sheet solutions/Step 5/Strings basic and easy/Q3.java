import java.lang.Integer;
public class Q3  {
    public static String mySOl(String s){
       //may work on small integers 
        int num  =  Integer.parseInt(s);
        int ans = 0;
        if(num%2 == 1) return String.valueOf(num);

        while(num >0){
            int last = num%10;
            if(last % 2 == 0){
                num /=  10;
            }
            else{
                ans =  num;
                break;
            }
        }
       
        return String. valueOf(ans);

    }
    public static String solve(String s){
        int len  =  s.length();
        int idx  = -1;
        for (int i = len - 1; i >= 0; i--) {
            if((s.charAt(i) - '0') %2 == 1){
                idx = i;
                break;
            }
        }
        if(idx==-1){
            return "";
        }
        int i= 0;
        while(i <= idx && s.charAt(i) == '0'){
            i++;
        }
        return s.substring(i,idx+1);
    }
    public static void main(String[] args) {
        String n  =  "0214638";
        String s =  "5437";
        System.out.println(mySOl(s));
        System.out.println(mySOl(n));
        //trying another solm
        System.out.println(solve(s));
        System.out.println(solve(n));
    }
}