import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius Of Circle:");
        float a = sc.nextFloat();
        System.out.println("Area of Circle is = "+(3.14 * a * a));
        sc.close();
    }
}
