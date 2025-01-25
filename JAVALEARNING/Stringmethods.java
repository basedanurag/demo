public class Stringmethods {
    public static void main (String[] args )
    {
        // String str = new String ("Anurag srivastava");
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
     /* using .indexOf(); ,methof
     System.out.println(str.indexOf('a',5));
     System.out.println(str.lastIndexOf('a')); */
    /*  using .equals();
       String str1 = "pyramid";
       // String str2 = "pyramid"; // true 
        String str3 = "Pyramid"; //false 
        // this happens because both the String contains different chars they are not equals
        System.out.println(str1.equals(str3));
      */
      /*using .equalsIgnoreCase();
      this method works the same as .equals() it just ignore the cases of a string 
       *  String str1 = "pyramid";
       // String str2 = "pyramid"; // true 
        String str3 = "Pyramid"; //true here this method will ignore the case of String and give output
       */
     /* // using (==);

     here we are using the refrences of the base address we are comparing these two String it doesnt means that both the Strings are equal it means that both the refferences are pointing towards the same object 
       String str1 = "pyramid"; 
       String str2 = "pyramid"; // true 
      // String str3 = "Pyramid"; //false 
         System.out.println(str1==str2);
          String str4 = new "pyramid"; // false as the new object created in heap memory the reference address will be different and the output will be false here 
     */
     /*// using .compareTo();
     // here the String will compare the Strings pass through it and will return the difference of those Strings ASCII codes of the first letter of the String 
     String str1 = "pyramid";
    // String str3 = "pyramid"; // both the first letters are same so the difference will be 0
    //String str3 = "Pyramid"; // here the output will be + because of the character ASCII codes the 'p' is > 'P' hence the positive result 
      // if i use a smaller letter as 'a' at str1 and a bigger letter for example 'w' at str3 then the output will be -
     // System.out.println(str1.compareTo(str3));
     // we also have one more method which is .compareToIgnoreCase(); this will ignore the case of the Strings and give output so if the word is same in other Strings and the case are not same so if we use this method then we can use it to find the diff but the result will be 0"if the Strings are same "
     */
    /*  // using .contains();
      // this method will tell if there is object present or not 
      String str1 = "the great wall of china";
      System.out.println(str1.contains("wall"));// true
      System.out.println(str1.contains("anurag")); //false
      */
     /* //using .concat();
      //here this method will add these Strings and create a new String as the Strings are immutable means they cant be modified so it will create a new String 
      String str1 = "the great";
      String str2 = " wall of china";
      System.out.println(str1.concat(str2));
      System.out.println(str1 + str2); // this also works so its not necessary to call the method to add a String the output will be same as the  .concat() 
      // NOTE : the + is not adding those String but it is attaching those Strings 
*/
    /*  // using .valueOf();
      // we can use this method to convert other type of data into String type of data
      int i =10 ;
      String.valueOf(i);
     */ 
  

    }
}
