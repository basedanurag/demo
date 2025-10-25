import java.io.File;

public class FileClassdemo {
    public static void main(String[] args) {
        File f = new File("D:\\demo\\JAVALEARNING");
        System.out.println(f.isDirectory());
        File list[] = f.listFiles();
        
        for (File ls : list)
         System.out.println(ls.getParent()+ls.getAbsolutePath()+ ls.getName()+ ls.listFiles() );

       
    }
}
