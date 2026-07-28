public class QueueImplementation {
  static  int arr[] =  new int[10];
    static int top= -1;
    static int start  , end  = -1;
    static int currSize = size();
    public static void push(int n){
        
        if(currSize >= 10){
            return;
        }
        if (currSize == 0) {
            start = 0;
            end = 0;
        }
        else{
            end  = (end + 1)% size();
        }

        arr[end] =  n; 
        currSize +=1;
    }
    public static void pop(int n){
        if(currSize == 0){
            return;
        }
        if(currSize == 1){
            start = end = -1;
        }
        else{
            start = start + 1;
        }
        currSize -= 1;

    }

    public static int top(){
       if(currSize == 0){
        return -1 ;
       }
        return arr[start];

    }
    public static int size(){
        return  currSize;
    }
    public static void main(String[] args) {
        
    }
}
