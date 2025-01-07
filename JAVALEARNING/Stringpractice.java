package JAVALEARNING;
public class Stringpractice {
    public static void main(String[] args){
        String str1 = "java program";
        String str2 = new String("java");
        //byte string "String str3 = new String(b,1,2 );"this will store the string in heap memory and the numbers are indexes which is going to be stored not the full string "
        byte b[] =  {65,66,67,68,69};
        String str3 = new String(b);
        //char string "String str3 = new String(c,1,2 );"this will store the string in heap memory and the numbers are indexes which is going to be stored not the full string "
        char c[] = {'h','e','l','l','o'};
        String str4 = new String(c);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }
    
}
