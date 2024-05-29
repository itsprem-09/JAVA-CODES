import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f1=0,f2=1;
        System.out.println("Enter How Many Term You Want :");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series :");
        System.out.print(f1+" "+f2);
        sc.close();
        for (int i = 0; i <= n; i++) {
            int f3 = f1 + f2;
            System.out.print(" "+f3);
            f1 = f2 ;
            f2 = f3;
        }
    }
}
