import java.util.Scanner;

class Cat{
    static int catCount = 0;
    String name;
    int age;

    public Cat(){
        catCount++;
    }
}

public class Static {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Object You Want to Create :");
        int n = sc.nextInt();

        sc.close();

        for (int i = 0; i < n; i++) {
            Cat ci = new Cat();
        }
        System.out.println("Count of Object Created are = "+Cat.catCount);
    }
}
