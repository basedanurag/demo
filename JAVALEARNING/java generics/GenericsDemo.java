public class GenericsDemo<T> {
    @SuppressWarnings({ "Unchecked", "unchecked" })
    T data[] =(T[]) new Object[3];
    public static void main(String[] args) {
        GenericsDemo<String> gd = new GenericsDemo<>();
        gd.data[0] = "Hello";
        gd.data[1] = "how are you";
        // gd.data[2] =  new Integer(19);
      
        String str = gd.data[0];
        System.out.println(str);
        str = gd.data[1];
        System.out.println(str);

    }
}
