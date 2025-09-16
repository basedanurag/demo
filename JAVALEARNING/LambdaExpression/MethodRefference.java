interface MyLambda1 {
    public void display(String s);
}

public class MethodRefference {
    public static void reverse(String str) {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {
        MyLambda1 m = MethodRefference::reverse;
        m.display("Anurag");
    }
}
