import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(value = {ElementType.LOCAL_VARIABLE,ElementType.METHOD,ElementType.TYPE})
@interface MyAnno{
    String name ();
   /*  String project();
    String date() default "16/09/2025";
    String version() default  "1.0"; 
    */
}
@MyAnno(name ="anurag")
public class userdefinedannotations {
    @MyAnno(name = "anurag")
    public static void main(String[] args) {
        
    }
}
