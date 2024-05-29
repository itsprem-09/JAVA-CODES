
class Point{

    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    }

    public double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
    }

    public int isInside(int x1, int y1, int x2,int y2, int x3, int y3, int x, int y) {
        /* Calculate area of triangle ABC */
        double A = area(x1, y1, x2, y2, x3, y3);

        /* Calculate area of triangle PBC */
        double A1 = area(x, y, x2, y2, x3, y3);

        /* Calculate area of triangle PAC */
        double A2 = area(x1, y1, x, y, x3, y3);

        /* Calculate area of triangle PAB */
        double A3 = area(x1, y1, x2, y2, x, y);

        /* Check if sum of A1, A2 and A3 is same as A */
        if(A == A1 + A2 + A3){
            return 1;
        }
        return 0;
    }
}

public class PointInsideTriangle {
    public static void main(String[] args) {

        Point t1 = new Point();

        System.out.println(t1.distance(2, 2, 1, 1));
        
        if (t1.isInside(0, 0, 20, 0, 10, 30, 10, 15) == 1)
            System.out.println("Point lies Inside the Triangle");
        else
            System.out.println("Point lies Outside the Triangle");

    }
}