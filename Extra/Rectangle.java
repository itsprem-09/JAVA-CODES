import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle_Class r1 = new Rectangle_Class();
        System.out.println("Enter Height of Rectangle:");
        r1.height = sc.nextInt();
        System.out.println("Enter Width of Rectangle:");
        r1.width = sc.nextInt();
        System.out.println("Type : \nTrue For Full Rectangle Else Type False");
        r1.isSquare = sc.nextBoolean();
        System.out.println("---------------------------------------------");
        r1.print();
        sc.close();
    }
}
