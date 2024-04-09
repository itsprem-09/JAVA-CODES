public class Multiplication {
    public static void main(String[] args) {
        try {
            System.out.println(repetMulti(args));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Incorrect Number Format");
            e.printStackTrace();
        }
        

    }
    public static int repetMulti(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int ans=1;
        for (int i = 0; i < y; i++) {
            ans *= x;
        }
        return ans;
    }
}
