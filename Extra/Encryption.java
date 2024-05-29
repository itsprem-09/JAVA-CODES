import java.util.*;

public class Encryption{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose From the Following Option");
        System.out.println("1. Encrypt Your Message.");
        System.out.println("2. Dycript Your Message.");
        int a = sc.nextInt();
        sc.nextLine();
        if(a==1)
        {
            System.out.println("Enter Your Message:");
            String msg = sc.nextLine();
            System.out.println("Your Encrypted Message is:");
            for(int i=0; i < msg.length();i++)
            {
                int c = msg.charAt(i);
                c=c^3;
                System.out.print((char)c);
            }
        }
        else if(a==2)
        {
            System.out.println("Enter Your Encrypted Message:");
            String msg = sc.nextLine();
            System.out.println("Your Encrypted Message is:");
            for(int i=0; i < msg.length(); i++)
            {
                int c = msg.charAt(i);
                c=c^3;
                System.out.print((char)c);
            }
        }
        sc.close();
    }
}