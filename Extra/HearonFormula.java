import java.util.Scanner;

class Hearon{
    int a;
    int b;
    int c;
    double s;

    public Hearon(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int validTriangle(){
        if ((a + b) > c || (c + b) > a || (a + c) > a) {
            return 1;
        }
        return -1;
    }
    public double calcArea(){
        s = (a+b+c)/2.0;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}

public class HearonFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Side of Triangle:");
        int a = sc.nextInt();
        System.out.println("Enter the Secound Side of Triangle:");
        int b = sc.nextInt();
        System.out.println("Enter the Third Side of Triangle:");
        int c = sc.nextInt();
        sc.close();

        Hearon t1 = new Hearon(a, b, c);
        int res = t1.validTriangle();
        if (res == -1) {
            System.out.println("Given Triangle is Not a Valid Triangle");
        }
        double ans = t1.calcArea();
        System.out.println("Area of Triangle is = "+ans);
    }
}
