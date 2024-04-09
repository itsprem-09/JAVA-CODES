
class Rect {
    static int length;
    static int width;

    public Rect(int length,int width){
        this.length = length;
        this.width = width;
    }
    public void printRect(){
        System.out.println("Length is = "+length);
        System.out.println("Width is = "+width);
    }
    
}

public class This {
    public static void main(String[] args) {
        Rect r1 = new Rect(6,6);
        r1.printRect();
        
    }
}
