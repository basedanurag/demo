class Data<T>{
    private T obj;
    public void SetData(T a){
        this.obj = a;
    }
    public T getData(){
        return obj;
    }
}
public class GenericClassDemo {
    public static void main(String[] args) {
        Data<Integer> d = new Data<>();
        d.SetData(19); // auto boxing other wise we use new Integer(19); inside the Set data method
        System.out.println(d.getData());

    }
}
