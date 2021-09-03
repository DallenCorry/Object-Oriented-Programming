import java.util.Scanner;
/**
 * Driver for the account project. currently makes checking and savings accounts and can modify them.
 * @author Dallen Corry
 * @version 1.1
 * @since 3 Sept. 2021
 */
public class Driver {

	/**
	 * Main method
	 * @param args (String[]) unused
	 */
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			//create the 2 new classes
			SavingsAccount s1 = new SavingsAccount(1,200);
			CheckingAccount c2 = new CheckingAccount(2,100);
			
			//print out the 2 classes using their own unique toString() method
			System.out.println(s1.toString());
			System.out.println();
			
			
			//withdraw from each account
			System.out.println("Enter the amount to withdraw from Savings");
			s1.withdraw(input.nextDouble());
			System.out.println(s1.toString());
			System.out.println("-------------");
			
			System.out.println(c2.toString());
			
			System.out.println();	
			
			
			System.out.println("Enter the amount to withdraw from Checking");
			c2.withdraw(input.nextDouble());
			System.out.println(c2.toString());

			
			//code for the ATM simulation, exercise 10-7
			/*
			//create and populate the array
			Account[] array = new Account[10];
			for(int i=0;i<array.length; i++)
				array[i]= new Account(i,100);
			
			//ask user for an ID of an account
			while(1==1) {//this WILL loop forever, as instructed (see break case below...)
				System.out.print("Enter a valid ID");
				int account = input.nextInt();
				//validate the account selection
				if (account<array.length&&account>=0) {
					int choice=0;
					//loop while exit is not the selection
					while(choice!=4) {
						System.out.println("Main Menu");
						System.out.println(" 1. Check balance");
						System.out.println(" 2. Withdraw");
						System.out.println(" 3. Deposit");
						System.out.println(" 4. Exit");
						
						choice = input.nextInt();
						double amount = 0;
						//cases for each option
						switch (choice){
						case 1: 
							System.out.println("The balance is $"+array[account].getBalance());
							break;
						case 2:
							System.out.print("How much would you like to withdraw? $");
							amount = input.nextDouble();
							if(amount <=array[account].getBalance()) {
								array[account].withdraw(amount); 
								System.out.println("success");
							}else
								System.out.println("insufficient funds");
							break;
						case 3: 
							System.out.print("How much would you like to deposit? $");
							array[account].deposit(input.nextDouble());
							break;
						case 4: break;
						default:System.out.println("invalid input");
						}
					}
				}
				//the exit code is 1234567890 (to avoid infinite loops)
				else if(account==1234567890) {
					System.out.println("goodbye");
					System.exit(1);
				}
			}
		*/

	}

}
