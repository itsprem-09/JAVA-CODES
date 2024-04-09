import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        
        int numOfReplacement = 0;
        try {
            FileReader f1 = new FileReader("file1.txt");
            FileWriter f2 = new FileWriter("file2.txt");

            Scanner sc = new Scanner(f1);
            String[] str = null;
            int i=0;
            while (sc.hasNextLine()) {
                str = sc.nextLine().split(" ");
                for (int j = 0; j < str.length; j++) {
                    if (str[j].equals("word1")) {
                        numOfReplacement++;
                        str[j] = "word2 ";
                        f2.write(str[j]);
                    }
                    else{
                        f2.write(str[j]+" ");
                    }
                }
                f2.write("\n");
                
                    
                
            }
            sc.close();
            f2.close();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("No of Replacement = "+numOfReplacement);
    }
}
