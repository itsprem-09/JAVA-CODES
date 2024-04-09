import java.util.Scanner;

public class Max_Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Secound Number:");
        int b = sc.nextInt();
        System.out.println("Enter Third Number:");
        int c = sc.nextInt();
        if (a>b && a>c) {
            System.out.println(+a+" is Largest Number");
        }
        else if (b>c && b>a) {
            System.out.println(+b+" is Largest Number");
        }
        else if (c>a && c>b) {
            System.out.println(+c+" is Largest Number");
        }
        else if (a==b && b==c) {
            System.out.println("All Numbers are Equal");
        } 
        sc.close();
    }
}
