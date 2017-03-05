
public class Balance {
	int balance;
	
	public Balance(int b){
		balance = b;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public void addBalance(int amount){
		balance += amount;
	}
	
	public void subtractBalance(int amount){
		balance -= amount;
	}
}
