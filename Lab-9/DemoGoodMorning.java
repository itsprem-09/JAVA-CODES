class GoodMorning implements Runnable{
    public void run(){
        try{
            while (true) {
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
class GoodAfternoon implements Runnable{
    public void run(){
        try {
            while (true) {
                System.out.println("Good Afternoon");
                Thread.sleep(3000);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
public class DemoGoodMorning {
    public static void main(String[] args) {
        GoodMorning gm = new GoodMorning();
        GoodAfternoon ga = new GoodAfternoon();

        Thread myThread1 = new Thread(gm);
        Thread myThread2 = new Thread(ga);
        
        myThread1.start();
        myThread2.start();
    }
}
