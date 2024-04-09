import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Bank_Account a = new Bank_Account();
        Scanner sc = new Scanner(System.in);

        int accountNo,accountBalance;
        String userName,email,accountType;

        System.out.println("Enter Account No. :");
        accountNo = sc.nextInt();
        System.out.println("Enter Account Balance :");
        accountBalance = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Username :");
        userName = sc.nextLine();
        System.out.println("Enter Email :");
        email = sc.nextLine();
        System.out.println("Enter Account Type :");
        accountType = sc.nextLine();
        a.getAccountDetails(accountNo,accountBalance,userName,email,accountType);
        a.print();
        sc.close();
    }
}

class Bank_Account {
    int accountNo,accountBalance;
    String userName,email,accountType;

    void getAccountDetails(int accountNo,int accountBalance,String userName,String email,String accountType){
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
    }
    
    void print(){
        System.out.println("=====================================");
        System.out.println("Details of Employee :");
        System.out.println("Username : "+userName);
        System.out.println("Account No. : "+accountNo);
        System.out.println("Account Balance : "+accountBalance);
        System.out.println("Email Id : "+email);
        System.out.println("Account Type : "+accountType);
    }

}
