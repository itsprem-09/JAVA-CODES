public class Swich_Update {
    public static void main(String[] args) {
        String str = "Wed";
        String result = "";

        // result = switch (str) {
        //     case "Mon","Tues" ->  "6 am";
        
        //     default -> "7 am";
                
        // };

        // result = switch (str) {
        //     case "Mon": yield "6 am";
        
        //     default: yield "7 am";
                
        // };

        switch (str) {
            case "Mon" -> System.out.println("Monday");
        
            default -> System.out.println("Wrong");
                
        }
        System.out.println(result);

        // StringBuffer sb = new StringBuffer();
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());
        // sb.append("Hi");
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());
        
    }
}
