import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Count {
    public static void main(String[] args)  {
        File f1 = new File("abc.txt");
        int wordCount = 0;
        int lineCount = 0;
        
        try {
            String str1 = "";
            String str2 = "";
            Scanner sc = new Scanner(f1);

            while (sc.hasNextLine()) {
                str1 += sc.nextLine();
                lineCount++;
            }
            sc.close();

            sc = new Scanner(f1);

            while (sc.hasNext()) {
                str2 = sc.next() + " ";
                wordCount++;
            }
            sc.close();
            System.out.println("Lines = "+line
            Count);
            System.out.println("Char = "+(int)f1.length());
            System.out.println("Words = "+wordCount);
            

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
            e.printStackTrace();
        }

    }
}
