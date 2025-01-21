public class Stringmethods {
    public static void main (String[] args )
    {
         String str = new String ("Anurag srivastava");
     /* using .length();method
            System.out.println(str.length()); 
            or we can do this
            int len = str.length();
            System.out.println(len);
            */
     /* using .toUpperCase();
      in this method the method will change the lower cases into upper cases of the String but it will not modify the String but it will give a new String
      here if we donot take the new variable for new String and want to modify the same name to the previous String variable then it can be done the String will give the new address of the new String 
      but the prev String is deleted or we can say it as it is a garbage collected String 
      example:
      String str2 = str.toUpperCase();
      System.out.println(str2);
       // similarly we can use the lower case method to convert all of them into a lowercase String 
       example :
       String str2 = str.toLowerCase();
      System.out.println(str2);
      */ 
     /* using .trim();
       * here the trim method will trim the String it will remove the empty spaces in the String 
       * the trim method will only ewmove the spaces from the begining and  the end of the String 
       * example : 
       * String Str2 = str.trim();
       System.out .println(Str2);

       */ 
     /* using .replace();       
      * in this method we can replace the character from the String to another character 
      example :
       String str2  = str.replace('i','m');
     System.out.println(str2 +"<-new String , old String -> " + str);
     */
     /* using .startsWith()/endsWith() method 
     System.out.println(str.startsWith("va" ));
      System.out.println(str.endsWith("va" )); */
     /* using .charAt(index of Strings);
      System.out.println(str.charAt(1));
      // we can use it for printing the whole String
      for(int i =0 ; i< str.length(); i++){
        System.out.print(str.charAt(i)); 
    }//if we use println then the output of the string will be one element per line but to print it all together we use print */
     /* using .indexOf(); ,method
     System.out.println(str.indexOf('a',5));
     System.out.println(str.lastIndexOf('a')); */
     System.out.println(str);
     

        
      }


    }
