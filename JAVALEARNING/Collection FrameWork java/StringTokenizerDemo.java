import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        String data = "1=Anurag;2=Nishant;3=Manish;4=Neelam";
        StringTokenizer st = new StringTokenizer(data, "=;");
        String s ;
        while(st.hasMoreTokens()){
            s = st.nextToken();
            System.out.print(s + " ");
        }
    }
}
