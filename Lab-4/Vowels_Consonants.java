import java.util.Scanner;

public class Vowels_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String a = sc.nextLine();
        int vowels=0,consonants=0;
        for (int i = 0; i < a.length(); i++) {
            if ( a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i)== 'o' || a.charAt(i)== 'u' || a.charAt(i)== 'A' || a.charAt(i)== 'E' || a.charAt(i)== 'O' || a.charAt(i)== 'U' || a.charAt(i)== 'I') {
                vowels++;
            }
            else{
                consonants++;
            }
        }
        System.out.println("Consonants = "+consonants);
        System.out.println("Vowels = "+vowels);
        sc.close();
    }
}
