public class ThreadInterface implements Runnable  {
    public void run(){
        int i = 1;
        while(true){
         System.out.println(i+ " hello");
         i++;
        }
    }
    public static void main(String[] args) throws Exception{
        ThreadInterface t = new ThreadInterface();
        Thread th = new Thread(t);
        th.start();
        t.wait(90);
        


        // int i = 1;
        // while(true){
        //  System.out.println(i+ "bye");
        //  i++;
        // }
    }
}
