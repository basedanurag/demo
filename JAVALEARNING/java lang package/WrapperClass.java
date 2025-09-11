public class WrapperClass {
  public static void main(String[] args) {
    Integer i = Integer.valueOf(10);
    Boolean b = Boolean.valueOf("false");
    Byte c = 15;
    Byte d = Byte.valueOf(c);
    System.out.println(i+" "+b+" "+ d );
  }
}
