import java.util.Date;
import java.util.Scanner;
/**
 * The Account class creates a bank account with an ID, balance, and annual interest rate. You are able to change these values, and deposit or withdraw.
 * @author Dallen Corry
 * @version 1.3
 * @since 1 Sept. 2021
 */
public class Account {

	/**
	 * Main Method to test the Account class
	 * @param args (String[]) unused
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
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
					double ammount = 0;
					//cases for each option
					switch (choice){
					case 1: 
						System.out.println("The balane is $"+array[account].getBalance());
						break;
					case 2:
						System.out.print("How much would you like to withdraw? $");
						ammount = input.nextDouble();
						if(ammount <=array[account].getBalance()) {
							array[account].withdraw(ammount); 
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
	
	}


	//Data fields
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	
	/**
	 * Default constructor
	 */
	Account(){
		id=0;
		balance=0;
		annualInterestRate=0;
		dateCreated.getTime();
	}
	/**
	 * Constructor with ID and Balance specified, and annual interest rate constant
	 * @param newId ID for the account
	 * @param newBalance Beginning balance of the account
	 */
	Account(int newId, double newBalance){
		id=newId;
		balance=newBalance;
		annualInterestRate=.045;//standard rate is 4.5%
		dateCreated.getTime();
	}
	
	/**
	 * Returns the ID of an account
	 * @return the ID
	 */
	int getId(){
		return id;
	}
	
	/**
	 * Returns the balance of an account
	 * @return Balance of the account
	 */
	double getBalance() {
		return balance;
	}
	
	/**
	 * Returns the annual interest rate of an account
	 * @return The annual interest rate
	 */
	double getAnnualInterstRate() {
		return annualInterestRate;
	}
	
	/**
	 * Returns the date that an account was created
	 * @return Date created
	 */
	Date getDateCreated(){
	 	return dateCreated;
	  }
	 
	/**
	 * Sets the ID of an account to a new ID
	 * @param newId (int) The new ID of the account
	 */
	void setId(int newId) {
		id=newId;
	}
	
	/**
	 * Sets the balance of an account to a new balance
	 * @param newBalance (Double) the new balance of the account
	 */
	void setBalance(double newBalance) {
		balance=newBalance;
	}
	
	/**
	 * Sets the annual interest rate of an account to a new rate
	 * @param newRate (double) the new annual interest rate of the account
	 */
	void setAnnualInterestRate(double newRate) {
		annualInterestRate=newRate;
	}
	
	/**
	 * Returns the monthly interest rate, which is the annual interest divided by 12
	 * @return (double) monthly interest rate
	 */
	double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}

	/**
	 * Returns the interest of an account after 1 month
	 * @return Monthly interest
	 */
	double getMonthlyInterest() {
		return balance*annualInterestRate/12;
	}
	
	/**
	 * subtracts a certain amount from an account
	 * @param amount (double) the amount to be withdrawn
	 */
	void withdraw(double amount) {
		balance -= amount;
		//this extra math is to avoid rounding issues with the double type.
		balance=Math.round(balance*100);
		balance = balance/100;
		
	}
	
	/**
	 * adds a certain amount to an account
	 * @param amount (double) the amount to be deposited
	 */
	void deposit(double amount) {
		balance += amount;
		//this extra math is to avoid rounding issues with the double type.
		balance=Math.round(balance*100);
		balance = balance/100;
	}
}
