public class ThreadInterface implements Runnable  {
    public void run(){
        int i = 1;
        while(true){
         System.out.println(i+ "hello");
         i++;
        }
    }
    public static void main(String[] args){
        ThreadInterface t = new ThreadInterface();
        Thread th = new Thread(t);
        th.start();

        int i = 1;
        while(true){
         System.out.println(i+ "bye");
         i++;
        }
    }
}
