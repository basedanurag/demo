/** @author Anurag Srivastava
 * @version Book 1.0
 * @since 2025
 */
public class Book{
    /**
     * @value 10 default value
     */
    static int val  = 10;
    /**
     * @value  1.23
     */
    public float f = 1.23f;
    /**
     * @param s
     */
    public Book(String s){

    }
     /**
      * 
      * @param roll it take roll number of the student 
      * @throws Exception if book is not there throws exception
      */
    public void issue(int roll ) throws Exception{

    }
    /**
     * 
     * @param str it takes the book name and check if available or not
     * @return if available return true else false
     */
    public boolean availabe(String str){
        return true;
    }
    /**
     * 
     * @param id the id of the book
     * @return returns the name of the book 
     */
    public String getName(int id){
        return "name";
    }
}