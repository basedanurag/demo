public class Q8 {
    public static String solve(String s) {
        StringBuilder str = new StringBuilder();

        int start = 0;
        int end = 0;
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0)
                break;

            end = i;

            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            start = i + 1;
            if (str.length() > 0)
                str.append(" ");
            str.append(s.substring(start, end + 1));

        }
        return str.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(solve(s));
    }
}
