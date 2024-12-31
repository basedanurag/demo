public class test {


public static void main(String[] args) {
    int a[] = {1,2,3,4};
    int b[] = a;
    a[0]= 99 ;
    for (int i=0;i<b.length; i++)
    System.out.println(b[i] + " " );
}
}
