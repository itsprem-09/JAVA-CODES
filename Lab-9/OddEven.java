class Odd implements Runnable{
    public void run(){
        for (int i = 1; i <= 20; i++) {
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
    public void run(){
        for (int i = 1; i <= 20; i++) {
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
        Thread myThread1 = new Thread(new Odd());
        Thread myThread2 = new Thread(new Even());
        myThread1.start();
        myThread2.start();
    }
}
