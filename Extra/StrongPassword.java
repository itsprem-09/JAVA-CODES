import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String specialChar = "!@#$%^&*()-_+=";
        boolean isUpperCase = false, isLowerCase = false, isDigit = false, isSpecial = false, isNanAdj = true;
        System.out.println("Enter Password :");
        String str = sc.next();
        sc.close();
        if (str.length() < 8) {
            return;
        }
        for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z' && !isUpperCase ) {
                    isUpperCase = true;
                }
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' && !isLowerCase) {
                    isLowerCase = true;
                }
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9' && !isDigit) {
                    isDigit = true;
                }
                if (str.indexOf(specialChar.charAt(i)) != -1 && !isSpecial) {
                    isSpecial = true;
                }
                if (i != str.length()-1 && str.charAt(i) == str.charAt(i+1) ) {
                    isNanAdj = false;
                }
        }

        if (isUpperCase && isDigit && isLowerCase && isNanAdj && isSpecial) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
            System.out.println("UPEER = "+isUpperCase);
            System.out.println("Lower = "+isLowerCase);
            System.out.println("digit = "+isDigit);
            System.out.println("Nan Adj = "+isNanAdj);
            System.out.println("Special = "+isSpecial);
        }
    }
}
