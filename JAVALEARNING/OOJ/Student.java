class student1 {
    //properties
    public String name;
    public long  rollno;
    public String course;
    public float m1,m2,m3;
    
    //methods
    public float total(){
        float total  = m1 + m2 + m3;
        return total;
    }
    public float average(){
        return total() / 3;
    }
    public String grade(){
        if (total() > 80){
    
        return  "A";
        }
        else if ( total() > 70){
      
        return "B";
        }
        else if(total() <70){
      
        return "C";
        }
        return "Student failed";
    }
    public String details(){
        return "student name :-" + name + "\n"
            + "student course:- " + course + "\n"
            + "student rollno:- " + rollno + "\n"
            + "student marks m1: " + m1 + "\n"
            + "student marks m2: " + m2 + "\n"
            + "student marks m3: " + m3 + "\n";
    }
}
public class Student {
    public static void main(String[] args) {
        student1 s = new student1();
        s.m1 = 30.5f;
        s.m2 = 33.7f;
        s.m3 = 7.56f;
        s.name = "Anurag";
        s.course = "B- Tech";
        s.rollno = 2302300100034L;
        System.out.println("student details:\n" + s.details());
        System.out.println("student total:" + s.total());
        System.out.println("student average: " + s.average());
         System.out.println("student grades: " + s.grade());
        

    }
}
