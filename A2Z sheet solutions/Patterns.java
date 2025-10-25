//import java.util.*;

public class Patterns {
    public static void p1(int n) {
        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void p2(int n) {
        /*
         * 
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         */
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void p3(int n) {

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }

    public static void p4(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }

    }

    public static void p5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void p6(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(n - j + 1);
            }
            System.out.println();
        }
    }

    public static void p7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int s = 0; s < (2 * i + 1); s++) {
                System.out.print("*");
            }
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void p8(int n) {
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            } // stars
            for (int s = 0; s < (2 * n) - (2 * i + 1); s++) {
                System.out.print("*");
            }
            // space
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void p9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int s = 0; s < (2 * i + 1); s++) {
                System.out.print("*");
            }
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }

            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            } // stars
            for (int s = 0; s < (2 * n) - (2 * i + 1); s++) {
                System.out.print("*");
            }
            // space
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void p10(int n) {
        // Outer loop for number of rows.
        for (int i = 1; i <= 2 * n - 1; i++) {

            // stars would be equal to the row no. uptill first half
            int stars = i;

            // for the second half of the rotated triangle.
            if (i > n)
                stars = 2 * n - i;

            // for printing the stars in each row.
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }

    public static void p11(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print(" 1 ");
                else
                    System.out.print(" 0 ");
            }
            System.out.println();
        }
    }

    public static void p12(int n) {
        int space = 2 * (n - 1);

        for (int i = 1; i < n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {

                System.out.print(k);
            }
            System.out.println();

            space -= 2;
        }
    }

    public static void p13(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count += 1;
            }
            System.out.println();
        }
    }

    public static void p14(int n) {

        for (int i = 0; i < n; i++) {

            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }

    public static void p15(int n) {
        for (int i = 0; i < n; i++) {

            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {

                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }

    public static void p16(int n) {
        char c = 'A';
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(c + " ");

            }
            c++;
            System.out.println();
        }
    }

    public static void p17(int n) {
        for (int i = 0; i < n; i++) {
            char c = 'A';
            int breakPoint = (2 * i + 1) / 2;
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int s = 0; s < (2 * i + 1); s++) {
                if (s < breakPoint) {

                    System.out.print(c);
                    c++;
                } else {
                    System.out.print(c);
                    c--;
                }
            }
            for (int k = 0; k < n - i - 1; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void p18(int n) {

        for (int i = 0; i < n; i++) {
            for (char c = (char) (int) ('A' + n - 1 - i); c <= (char) (int) ('A' + n - 1); c++) {
                System.out.print(c + " ");

            }
            System.out.println();
        }
    }

    public static void p19(int n) {
        int space = 0;
        int space2 = 2 * n;
        // upper
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= n - i; k++) {
                System.out.print("*");
            }
            space += 2;

            System.out.println();
        }
        // lower
        for (int i = 0; i <= n; i++) {
            // space
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            } // stars
            for (int s = 1; s <= space2; s++) {
                System.out.print(" ");
            }
            // space
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            space2 -= 2;
            System.out.println();
        }

    }

    public static void p20(int n) {

        int space = 0;
        int space2 = 2 * n;
        for (int i = 0; i < n; i++) {
            // space
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            } // stars
            for (int s = 1; s <= space2; s++) {
                System.out.print(" ");
            }
            // space
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            space2 -= 2;
            System.out.println();
        }
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= n - i; k++) {
                System.out.print("*");
            }
            space += 2;

            System.out.println();
        }
    }

    public static void p21(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void p22(int n) {
        
        for (int i = 0; i <=  2 *n - 1; i++) {
            for (int j = 0; j <= 2 *n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 1) - i;
                int down = (2 * n - 1) -j;
                System.out.print(n - Math.min(Math.min(top,down) ,Math.min(left, right))+ " ");
            }
            System.out.println();
        }
    }
    public static  void p23(int n){
        for (int i = 0; i < n; i++) {              // rows
            for (int j = 0; j < n; j++) {          // columns
                if (i == 0 || i == n - 1 ||        // border rows
                    j == 0 || j == n - 1 ||        // border cols
                    i == n / 2 || j == n / 2 ||    // middle row/col
                    i == j || i + j == n - 1) {    // both diagonals
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("pattern 1");
        p1(5);
        System.out.println("pattern 2");
        p2(5);
        System.out.println("pattern 3");
        p3(5);
        System.out.println("pattern 4");
        p4(5);
        System.out.println("pattern 5");
        p5(5);
        System.out.println("pattern 6");
        p6(5);
        System.out.println("pattern 7");
        p7(5);
        System.out.println("pattern 8");
        p8(5);
        System.out.println("pattern 9");
        p9(5);
        System.out.println("pattern 10");
        p10(5);
        System.out.println("pattern 11");
        p11(5);
        System.out.println("pattern 12");
        p12(5);
        System.out.println("pattern 13");
        p13(5);
        System.out.println("pattern 14");
        p14(5);
        System.out.println("pattern 15");
        p15(5);
        System.out.println("pattern 16");
        p16(5);
        System.out.println("pattern 17");
        p17(5);
        System.out.println("pattern 18");
        p18(5);
        System.out.println("pattern 19");
        p19(5);
        System.out.println("pattern 20");
        p20(5);
        System.out.println("pattern 21");
        p21(5);
        System.out.println("pattern 22");
        p22(5);
         System.out.println("pattern 23");
        p23(5);


    }
}