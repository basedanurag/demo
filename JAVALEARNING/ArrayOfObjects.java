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
    }
}
