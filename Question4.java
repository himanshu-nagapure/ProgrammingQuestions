import java.util.Scanner;

/*
In the ATM program, the user has to select an option from the options displayed on the screen. 
The options are related to withdraw the money, deposit the money, check the balance, and exit.
*/

public class Question4 {
    public static void main(String[] args) {
        int balance = 50000, withdraw, deposit;  
          
        //create scanner class object to get choice of user  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform : ");

            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
                    System.out.print("Enter money to be withdrawn:"); 
                    withdraw=sc.nextInt();
                    if(withdraw>balance)
                        System.out.println("Insufficient Balance!!");
                    else if(withdraw < 0)
                        System.out.println("Invalid entry!!");
                    else if(withdraw==0)
                        System.out.println("Enter a valid amount to withdraw!!");
                    else{
                        balance-=withdraw;
                        System.out.println("Successfully withdrawn: ₹"+withdraw);
                    }
                    break; 

                case 2:  
                    System.out.print("Enter money to be deposited:"); 
                    deposit = sc.nextInt();
                    if(deposit>0){
                        balance+=deposit;
                        System.out.println("Money successfully deposited ✔");
                    }
                    else{
                        System.out.println("Invalid entry!!");
                    }
                    break;

                case 3:  
                    System.out.println("Balance: ₹"+balance); 
                    break;

                case 4:  
                    System.out.println("Thank you for using our service.Do visit again.");
                    sc.close();
                    System.exit(0); 

                default:
                    System.out.println("Choose only from above options!!");
                    break;
            }
            System.out.println();
        }
        
    }
}