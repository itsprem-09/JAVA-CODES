public class Rectangle_Class {
    int height;
    int width;
    boolean isSquare;

    void print(){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i==0 || i==height-1 || j==0 || j==width-1) || isSquare) {
                    System.out.print("* ");
                }
                    
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");
    }
}
