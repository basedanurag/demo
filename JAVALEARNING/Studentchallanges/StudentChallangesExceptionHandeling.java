class Stack{
    private int size;
    private int top = -1;
    private int c[];

    public Stack(int size){
        this.size = size;
        c = new int[size];
    }

    public void push(int x) throws StackOverflow {
        if (top  == size -1){
            throw new StackOverflow();
        }
        top++;
        c[top] =  x;

    }
    public int pop()throws StackUnderflow{
      int x=-1;
        
        if(top==-1)
            throw new StackUnderflow();
        x=c[top];
        top--;
        return x;  
    }

}
class StackOverflow extends Exception{
     public String toString(){
        return "overFlow exception";
    }
}
class StackUnderflow extends Exception{
    public String toString(){
        return "underFlow exception";
    }
    
}
public class StudentChallangesExceptionHandeling{
    public static void main(String[] args){
        Stack s = new Stack(5);
      try{  //overflow condition
            s.push(10);
            s.push(10);
            s.push(10);
            s.push(10);
         //. under flow exception body
         s.pop();
         s.pop();
         s.pop();
         s.pop();
         s.pop();
      }
      catch(StackUnderflow e){
        System.out.println(e);
      }catch(Exception e){
        System.out.println(e);
      }
      

    }
}