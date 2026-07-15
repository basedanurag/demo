public class Q4 {
    public static int findXOR(int left, int right) {
        int i = left - 1;
        if (i % 4 == 1)
            left = 1;
        else if (i % 4 == 2)
            left = i + 1;
        else if (i % 4 == 3)
            left = 0;
        else if (i % 4 == 0)
            left = i;

        int j = right;
        if (j % 4 == 1)
            right = 1;
        else if (j % 4 == 2)
            right = j + 1;
        else if (j % 4 == 3)
            right = 0;
        else if (j % 4 == 0)
            right = j;

        return (left ^ right);
    }

    public static void main(String[] args) {

    }
}
