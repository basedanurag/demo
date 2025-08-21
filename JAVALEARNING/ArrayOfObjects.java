class Subjects{
    private String subId;
    private String name;
    private int maxMarks;
    private float marksObtained;

    public Subjects(String subId, String name ){
        this.subId = subId;
        this.name = name;
        setmarksObtained(marksObtained);
        setmaxMarks(maxMarks);

    } 
    // READABLE GET METHODS 
    public String getSubId(){return subId;}
    public String getname(){return name;}
    public int  getmaxMarks(){return maxMarks;}
    public float getmarksObtained(){return marksObtained;}
    
    // WRITEABLE SET METHODS
    public void setmaxMarks(int mm){
        maxMarks = mm;
    }
    public void setmarksObtained(float m){
        marksObtained = m;
    }
    boolean isQualified(float m){
        return m >= maxMarks / 10 * 4;
    }
    public String toString(){
        return "\nsubject ID "+ subId + "\nsubject name "+ name +
        "\nmaxMarks " +maxMarks+ 
        "\nmarks obtained "+ marksObtained +
         "\n Qualified :-" + isQualified(marksObtained);
    }



}
 class Student {
    private long rollno;
    private String name;
    private String dept;
    private String subjects;

    public Student(long rollno, String name, String dept, String subjects ){
        this.rollno =rollno;
        this.name = name;
        setDept(dept);
       setSubjects(subjects);
    }
    // get methods
    public long getrollno(long rollno){
        return rollno;
    }
    public String getname(String name){
        return name;
    }
    public String getdept(String dept){
        return dept;
    }
    public String  getSubjects(String subjects){
        return subjects;
    }
    // WRITEABLE SET METHODS
    public void setDept(String mm){
        dept = mm;
    }
    public void setSubjects(String m){
        subjects= m;
    }
    public String toString(){
        return "\nstudent roll number  "+ rollno + 
        "\nstudent name "+ name +
        "\nstudent dept " + dept+ 
        "\nStudent subjects "+ subjects;
    }


}
public class ArrayOfObjects {
    public static void main(String[] args) {

     

        Subjects s[] = new Subjects[3];
      // ...existing code...
s[0] = new Subjects("BCS-401", "i dont know");
s[0].setmarksObtained(63.32f);
s[0].setmaxMarks(100);

s[1] = new Subjects("ahgda","gqywe7qyw7ey" );
s[1].setmarksObtained(80.0f);
s[1].setmaxMarks(100);

s[2] = new Subjects("ahgda","gqywe7qyw7ey" );
s[2].setmarksObtained(45.0f);
s[2].setmaxMarks(100);
// ...existing code...
      

     for(Subjects sub : s){
        System.out.println(sub);
     }

     // Create Student objects and fill with data
     // Create array of Student objects
     Student[] students = new Student[3];
     students[0] = new Student(2302300100034L, "Anurag", "CSE", "BCS-401, ahgda");
     students[1] = new Student(2302300100035L, "Riya", "ECE", "BCS-401, ahgda");
     students[2] = new Student(2302300100036L, "Amit", "ME", "BCS-401, ahgda");

     for (Student st : students) {
         System.out.println(st);
     }

     
    }
}
