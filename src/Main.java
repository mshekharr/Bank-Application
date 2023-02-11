import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, balance and Password :-");
        String name = sc.nextLine();
        int balance = sc.nextInt();
        String password = sc.next();

        SBIAccount kunalAcc = new SBIAccount(name,balance,password);
        System.out.println("your Account has been created with Account no "+kunalAcc.getAccountNo());

        //getBalance
        System.out.println("Your current balance is: "+ kunalAcc.getBalance());

        //deposit
        System.out.println(kunalAcc.depositMoney(500));
        System.out.println("New balance "+kunalAcc.getBalance());

        //withdraw
        System.out.println("Enter amount and password ");
        int amount = sc.nextInt();
        String pwd = sc.next();
        System.out.println(kunalAcc.withdraw(pwd,amount));
        System.out.println("Current balance "+kunalAcc.getBalance());

        //Interest
        System.out.println("Enter time period :-");
        int time = sc.nextInt();
        System.out.println("Interest for "+ time +" years is "+ kunalAcc.calculateInterest(time));
    }
}