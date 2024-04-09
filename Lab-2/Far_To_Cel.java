import java.util.Scanner;

public class Far_To_Cel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of Temp in Fahrenheit");
        float a = sc.nextFloat();
        System.out.println("Conversition in Celsius = "+((a-32)*0.5556));
        sc.close();
    }
}
