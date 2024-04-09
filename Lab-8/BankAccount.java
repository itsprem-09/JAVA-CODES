import java.util.*;

class InSufficientFundException extends Exception{
    public InSufficientFundException(String str){
        super(str);
    }
}

class WrongAmountEnteredException extends Exception{
    public WrongAmountEnteredException(String str){
        super(str);
    }
}

class Account{
    private double currentBalance;
    // double withdrawAmount;   
    // double depositAmount;
    Scanner sc = new Scanner(System.in);

    public Account(double currentBalance){
        this.currentBalance = currentBalance;
    }

    public void withdrawMoney(double withdrawAmount) throws Exception{
        if (withdrawAmount > currentBalance) {
            throw new InSufficientFundException("Insufficient Fund Transfer....");
        }
        currentBalance = currentBalance - withdrawAmount; 
        System.out.println("Amount "+withdrawAmount+" withdrawed From Your Account....");
        display();
    }

    public void depositMoney(double depositAmount) throws Exception{
        
        if (depositAmount < 0) {
            throw new WrongAmountEnteredException("Wrong Amount Entered....");
        }
        currentBalance = currentBalance + depositAmount; 
        System.out.println("Amount "+depositAmount+" Credited in Your Account....");
        display();
    }

    public void display(){
        System.out.println("Current Balance is = "+currentBalance);
    }
    
}
public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Current Balance : ");
        double currentBalance = sc.nextDouble();

        Account ac = new Account(currentBalance);

        System.out.println("Enter Following Number to Start Process :");
        System.out.println("1. Check Current Balance");
        System.out.println("2. Withraw");
        System.out.println("3. Deposit");
        int temp = sc.nextInt();
        if (temp == 1) {
            ac.display();
        }
        else if (temp == 2) {
            try{
                System.out.println("Enter Withdrawal Amount : ");
                double withdrawAmount = sc.nextDouble();
                ac.withdrawMoney(withdrawAmount);
            }
            catch(Exception e){
                System.out.println(e.getMessage()); 
                e.printStackTrace();
            }
        }
        else if (temp == 3) {
            try{
                System.out.println("Enter Deposit Amount : ");
                double depositAmount = sc.nextDouble();
                ac.depositMoney(depositAmount);
            }
            catch(Exception e){
                System.out.println(e.getMessage()); 
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Wrong Input....");
        }
        sc.close();
    }
}
