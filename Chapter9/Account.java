import java.util.Date;
/**
 * The Account class creates a bank account with an ID, balance, and annual interest rate. You are able to change these values, and deposit or withdraw.
 * @author Dallen Corry
 * @version 1.2
 * @since 27 Aug. 2021
 */
public class Account {

	/**
	 * Main Method to test the Account class
	 * @param args (String[]) unused
	 */
	public static void main(String[] args) {
		Account a1 = new Account(1122,20000);
		a1.withdraw(2500);
		a1.deposit(3000);
		System.out.printf("Account ID: %d%nBalance: $%.2f%nMonthly Interest: $%.2f%nDate Created: %tD", a1.id, a1.balance, a1.getMonthlyInterest(), a1.dateCreated);
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
	}
	
	/**
	 * adds a certain amount to an account
	 * @param amount (double) the amount to be deposited
	 */
	void deposit(double amount) {
		balance += amount;
	}
}
