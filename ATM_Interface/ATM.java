package ATM_Interface;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
			//int balance = 7000;
			int withdraw, deposit;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Account ");
			int balance=sc.nextInt();
			
			while(true)
			{
				System.out.println("ATM Interface");
				System.out.println("1. Withdrawing\n 2. Depositing\n 3. Checking the balance\n 4. Exit");
				System.out.println("Choose option");
				int choice = sc.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.println("Enter amount to withdraw");
					withdraw = sc.nextInt();
					
					if(balance>= withdraw)
					{
						balance= balance - withdraw;
						System.out.println("Please Collect your Amount");
					}
					else
					{
						System.out.println("Insufficient Balance");
					}
					System.out.println(" ");
				break;
					
				
				case 2:
					System.out.println("Enter amount to deposit");
					deposit = sc.nextInt();
					
						balance= balance + deposit;
						System.out.println("Your amount has been deposited");
						System.out.println(" ");
				break;
				
				
				case 3:
					System.out.println("Balance: "+balance);
					System.out.println(" ");
				break;
				
				
				case 4:
					System.out.println("Please collect your atm card\n Visit Again!!");
					System.exit(0);
				}
			}
		}
}

