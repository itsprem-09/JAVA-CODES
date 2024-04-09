import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Operation:");
        char ch = sc.nextLine().charAt(0);
        System.out.println("Enter First Number:");
        float a = sc.nextFloat();
        System.out.println("Enter Secound Number:");
        float b = sc.nextFloat();
        
        switch (ch) {
            case '+':
                System.out.println("Sum of Given two Number is :"+(a+b));
                break;
            case '-':
                System.out.println("Sum of Given two Number is :"+(a-b));
                break;
            case '*':
                System.out.println("Sum of Given two Number is :"+(a*b));
                break;
            case '/':
                while (b==0) {
                    System.out.println("Enter Secound Number:");
                    b = sc.nextFloat();
                }
                System.out.println("Sum of Given two Number is :"+(a/b));
                break;
            default:
                System.out.println("Enter Valid Operation");
                break;
        }
        sc.close();
    }
}
