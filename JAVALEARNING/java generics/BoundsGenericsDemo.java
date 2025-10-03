// class A{}
// class B extends A{}
// class C extends A{}

// class MyArray<T>{
//     @SuppressWarnings("unchecked")
//     T a[] = (T[])new Object[10];
//     int length = 0;
//     public void append(T v){
//         a[length++] = v;
//     }
//     public void display(){
//         for(T x: a){
//             System.out.print(" " +x);
//         }
//     }
// }
public class BoundsGenericsDemo {
    // generic method kaise likhte hai is ke neeche hai 
    // iske liye koi extra class ki need nahi hai
    
    static <E> void show(E[] list){
       for(E c : list)
        System.out.println(c);
    }
    public static void main(String[] args) throws Exception {
        // MyArray<Double> m = new MyArray<>();
        // m.append(122.233);
        // m.append(20.21432);
        // m.append(5.32131);
        //  m.append(122.131431412);
        // m.append(20.1314233);
        // m.append(5.1341213);
        //  m.append(122/.131231);
        // m.append(20.1231312414234);
        // m.append(5.43267567);
        // m.display();
        show(new Integer[]{10, 12, 34});
        show(new String[]{"Hi", "Hello", "Bye"});

    }
}
