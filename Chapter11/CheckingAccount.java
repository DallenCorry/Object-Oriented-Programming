/**
 * The Checking Account class makes an Account that is able to be overdrawn to a certain ammount
 * @author Dallen Corry
 * @version 1.0
 * @since 3 Sept. 2021
 */
public class CheckingAccount extends Account {
	private double overDraft;
	
	/**
	 * Default constructor. values are id:0, balance:0
	 */
	public CheckingAccount() {
		super(0,0);
		overDraft=0;
	}

	/**
	 * constructor with parameters id and balance
	 * @param (int) id the ID of the account
	 * @param (double) balance the starting balance of the account
	 */
	public CheckingAccount(int id, double balance) {
		super(id, balance);
		overDraft=100;
	}
	
	/**
	 * constructor with parameters id and balance
	 * @param id (int) id the ID of the account
	 * @param balance (double) balance the starting balance of the account
	 * @param overDraft (double) amount of money able to be withdrawn past 0
	 */
	public CheckingAccount(int id, double balance, double overDraft) {
		super(id, balance);
		this.overDraft=overDraft;
	}
	
	/**
	 * this method withdraws a specified amount of money from the account. It will not withdraw if the amount is greater than the balance and the over draft limit
	 * @param amount (double) amount of money to be withdrawn from the account
	 */
	public void withdraw(double amount) {
		if(getBalance()+overDraft>=amount) {
			setBalance(getBalance()-amount);
			//this extra math is to avoid rounding issues with the double type.
			double temp = Math.round(getBalance()*100);
			setBalance(temp/100);
		}else
			System.out.println("ERROR-insufficient funds");
	}
	
	/**
	 * Converts the account information into a readable string
	 * @return the account information as a string
	 */
	@Override
	public String toString() {
		return "Checking "+super.toString()+"\nOver Draft limit: "+overDraft;
		//return"";//default value
	}
}
