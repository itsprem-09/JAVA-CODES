import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircleClass c1 = new CircleClass();
        System.out.println("Enter Radius Of Circle:");
        c1.rad = sc.nextFloat();
        c1.area();
        sc.close();
    }
}
