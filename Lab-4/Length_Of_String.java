import java.util.Scanner;

public class Length_Of_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();
        System.out.println("Length of String is : "+(str.length()));
        for (int i = 0; i < (str.length()/2); i++) {
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}
