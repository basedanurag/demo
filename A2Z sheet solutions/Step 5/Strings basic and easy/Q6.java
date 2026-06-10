public class Q6 {
    public static boolean rotateString(String s1 , String s2){
        if(s1.length() != s2.length()) return false;

        String newS = s1 + s1;

        

        return newS.contains(s2);
    }
    public static void main(String[] args) {
        String s =  "rotation", s2 = "tionrota";

        System.out.println(rotateString(s, s2));
        
    }
}
