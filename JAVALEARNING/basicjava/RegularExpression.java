public class RegularExpression {
    public static void main(String[] args) {
        
        //Regular expressions 

        /*String str1="f";
        System.out.println(str1.matches("."));*/
        
        /*String str1="a";//b,c
        System.out.println(str1.matches("[abc]"));*/
        
        /*String str1="p";//true for alphabets other than abc
        System.out.println(str1.matches("[^abc]"));*/
        
        /*String str1="7";//A,a7
        System.out.println(str1.matches("[a-zA-Z0-9]"));//[a-z][0-9]*/
        
        /*String str1="b";
        System.out.println(str1.matches("a|b"));
        either a or b else false*/
        

        // Meta character 


        String str1="b";
        System.out.println(str1.matches("\\w"));// anything wither a number or a alphabet it will work
         
        
        /*String str1="5";
        System.out.println(str1.matches("\\d")); it works for digits */
        
      //  String str1="$";
        System.out.println(str1.matches("\\D")); //it is not a 
        
        //Quantifiers
               /*String str1="abcdef";//ab6cdef,abBcdef
        System.out.println(str1.matches("[abc]*"));*/
        
        
        /*String str1="accbdefg";//accb
        System.out.println(str1.matches("[abc]{3,7}"));*/
        
        /*String str2="john@gmail.com";
        //System.out.println(str2.matches(".*gmail.*"));
        System.out.println(str1.matches("\\w*@gmail(.*)"));*/
        
    }
}
