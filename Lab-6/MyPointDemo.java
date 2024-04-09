import java.util.Scanner;

class MyPoint{
    int x;
    int y;
    Scanner sc = new Scanner(System.in);

    public MyPoint(){
        x = 0;
        y = 0;
    }

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void getPoint(){
        System.out.print("Enter X-coordinate: ");
        this.x=sc.nextInt();
        System.out.print("Enter Y-coordinate: ");
        this.y=sc.nextInt();
    }

    public double distance(MyPoint p){
        return Math.sqrt(Math.pow((p.x-this.x), 2) + Math.pow((p.y-this.y), 2));
    }
}


public class MyPointDemo {
    public static void main(String[] args) {
        System.out.println("Enter Coordinates Of Point 1 : ");
        MyPoint p1 = new MyPoint();
        p1.getPoint();
        System.out.println("=========================================");

        System.out.println("Enter Coordinates Of Point 2 : ");
        MyPoint p2 = new MyPoint();
        p2.getPoint();
        System.out.println("=========================================");

        System.out.println("You entered: Point A("+p1.x+","+p1.y+")");
        System.out.println("You entered: Point B("+p2.x+","+p2.y+")");
        System.out.println("Distance between A("+p1.x+","+p1.y+") and B("+p2.x+","+p2.y+") : "+p1.distance(p2));

        System.out.println("=========================================");
        MyPoint p = new MyPoint(1,2);
        System.out.println("Let a particular point be P(1,2)");
        System.out.println("Distance between A("+p1.x+","+p1.y+") and P(1,2): "+p1.distance(p));
    }
}
