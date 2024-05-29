import java.util.Scanner;

class Odd implements Runnable{
    int n;

    public Odd(int n){
        this.n = n;
    }
    public void run(){
        for (int i = 1; i <= n; i++) {
            if (i%2!=0) {
                System.out.println(i+" ");
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
    }
}
class Even implements Runnable{
    int n;

    public Even(int n){
        this.n = n;
    }
    public void run(){
        for (int i = 1; i <= n; i++) {
            if (i%2==0) {
                System.out.println(i+" ");
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
    }
}


public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int n = sc.nextInt();
        Thread myThread1 = new Thread(new Odd(n));
        Thread myThread2 = new Thread(new Even(n));
        myThread1.start();
        myThread2.start();
    }
}
