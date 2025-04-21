package org.SpringLerning;

import java.util.List;
import java.util.Scanner;

// Bank Account Management system

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);


        System.out.println("Welcome to the Bank Account Management System!");
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(name, initialBalance);

        int choice;
        do {
            System.out.println("\n----- Menu -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.depositAmount(depositAmount);
                    System.out.print("Amount deposited Successfully ");
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double widthdrawAmount = sc.nextDouble();
                    account.withdrawAmount(widthdrawAmount);
                    System.out.print("Amount widthdrawn Successfully ");
                    break;

                case 3:
                    System.out.print("Availiable balance :  " + account.getBalance());


                case 4:
                    List<Transection> history = account.getHistory();
                    if(history.isEmpty()){
                        System.out.println("No Transection to show ......");
                    }
                    else{
                        System.out.println( "--------TRANSECTION HISTORY---------");
                        for(Transection t : history){
                            System.out.println(t.getDetails());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }while (choice != 5);

        sc.close();
    }
}
