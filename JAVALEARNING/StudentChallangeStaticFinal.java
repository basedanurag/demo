
class Student{
    private String rollNO ;
    private static int count = 1;
    public String generateROll(){
        String rn = "UNIV_"  + count;
        count++;
        return rn;
    }
    //constructor
    Student(){
    rollNO = generateROll();
    }
    public String getRoll(){
        return rollNO;
    }

}
public class StudentChallangeStaticFinal{
    public static void main(String[] args) {
        Student s = new Student();
        s.generateROll();
        System.out.println(s.getRoll());
    }
}