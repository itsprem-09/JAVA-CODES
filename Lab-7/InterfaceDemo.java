interface P1{
    int a = 5;
    void printP1();
}
interface P2{
    int a = 2;
    void printP2();
}

class A12 implements P1,P2{
    public void printP1(){
        System.out.println("Value in P1 : "+P1.a);
    }
    public void printP2(){
        System.out.println("Value in P2 : "+P2.a);
    }
}



public class InterfaceDemo {
    public static void main(String[] args) {
        A12 a = new A12();
        a.printP1();
        a.printP2();
    }
}
