import java.io.*;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("C:\\DU-PROGRAMS\\JAVA PROGRAMS",args[0]);
        if (!f.exists()) {
            System.out.println("Error 404 File Not Found....");
        }
        else{
            if (f.isFile()) {
                System.out.println(f.length());
            }
            else{
                File[] files = f.listFiles();
                for (int i = 0; i < files.length; i++) {
                    System.out.println(files[i].getName());
                }
            }
        }
    }   
}
