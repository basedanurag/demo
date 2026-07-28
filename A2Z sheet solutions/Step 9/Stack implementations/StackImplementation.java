public class  StackImplementation{
   static int arr[] =  new int[10];
    static int top = -1;

    public static void push(int n){
        if(top >= 10) return;
        top += 1;
        arr[top] =  n;
    }
    public static void pop(int n){
        if (top == -1) return;
        
        top += -1;

    }
    public static int top(){
        if(top == -1) return 0;

        return arr[top];
    }
    public static int size(){
        return top +1;
    }
    public static void main(String[] args) {
        push(5);
        top();
        push(4);
        pop(top);
        top();
        push(3);
        push(2);
        push(1);

    }
}