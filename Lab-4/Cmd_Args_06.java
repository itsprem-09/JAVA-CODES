
public class Cmd_Args_06 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("The command line" + " arguments are:");
        
            for (String val : args){
                char[] ch = val.toCharArray();
                if (ch[0] >='A' && ch[0] <= 'Z' ) {
                    System.out.println(val);
                }
            }        
        }
        else{
            System.out.println("Error Error Error!! Please Enter Arguments");
        }
    }
}