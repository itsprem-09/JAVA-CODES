import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int flag = 0;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println("Given Number is a Prime Number.");
            } else {
                System.out.println("Given Number is not a Prime Number.");
            }
        }
        sc.close();
    }
}
