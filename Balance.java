
public class Balance {
	/** balance of player */
	int balance;
	
	/**
	Constructor
	@param b Balance of player. Must have content.
	*/
	public Balance(int b){
		balance = b;
	}
	
	/**
	returns the balance of the player 
	@return balance of the player
	*/
	public int getBalance(){
		return balance;
	}
	
	/**
	adds amount to player's balance
	@param amount amount that is added to the balance
	*/
	public void addBalance(int amount){
		balance += amount;
	}
	
	/**
	subtracts amount from player's balnce
	@param amount amount that is subtracted from the balance
	*/
	public void subtractBalance(int amount){
		balance -= amount;
	}
}
