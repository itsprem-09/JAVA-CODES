import java.util.Scanner;

public class Sum_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        float avg;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter an Element in Array:");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        avg = (float) (sum / n);
        System.out.println("Sum of Given Array is : "+sum);
        System.out.println("Avg of Given Array is : "+avg);
        sc.close();
    }
}


