import java.util.Date;
/**
 * The Account class creates a bank account with an ID, balance, and annual interest rate. You are able to change these values, and deposit or withdraw.
 * @author Dallen Corry
 * @version 1.4
 * @since 3 Sept. 2021
 */
public class Account {

	/**
	 * Main Method to test the Account class.
	 * @param args (String[]) unused
	 */


	//Data fields
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated = new Date();
	
	/**
	 * Default constructor
	 */
	Account(){
		this(1,1);
		annualInterestRate=0;
		dateCreated.getTime();
	}
	/**
	 * Constructor with ID and Balance specified, and annual interest rate constant
	 * @param newId ID for the account
	 * @param newBalance Beginning balance of the account
	 */
	Account(int id, double balance){
		this.id=id;
		this.balance=balance;
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
	void setId(int id) {
		this.id=id;
	}
	
	/**
	 * Sets the balance of an account to a new balance
	 * @param newBalance (Double) the new balance of the account
	 */
	void setBalance(double balance) {
		this.balance=balance;
	}
	
	/**
	 * Sets the annual interest rate of an account to a new rate
	 * @param newRate (double) the new annual interest rate of the account
	 */
	void setAnnualInterestRate(double rate) {
		annualInterestRate=rate;
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
	
	public String toString() {
		return"Account "+getId()+"\nDate created: "+getDateCreated()+"\nBalance: "+getBalance();
	}
}
