import java.util.Scanner;

class ThreeDimPoint extends MyPoint{
    double z;
    Scanner sc = new Scanner(System.in);

    public ThreeDimPoint(){
        super();
        z = 0;
    }

    public ThreeDimPoint(int x,int y,double z){
        super(x,y);
        this.z = z;
    }

    public double getZ(){
        System.out.print("Enter Z-coordinate: ");
        z = sc.nextDouble();
        return z;
    }

    public double distance(ThreeDimPoint p){
        return Math.sqrt(Math.pow(this.x-p.x,2)+Math.pow(this.y-p.y,2)+Math.pow(this.z-p.z,2));
    }
}

public class ThreeDPoint {
    public static void main(String[] args) {

        ThreeDimPoint p1 = new ThreeDimPoint();

        ThreeDimPoint p2 = new ThreeDimPoint(10,30,25.5); 

        System.out.println("Distance between A("+p1.x+","+p1.y+","+p1.z+") and B("+p2.x+","+p2.y+","+p2.z+") : "+p1.distance(p2));


    }
}
