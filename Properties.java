

public class Properties extends Buyable {
	
	volatile boolean buy;
	
	public Properties(String nme, int cost, int pos ){
		super(cost, pos, nme);
	}
	
	public void land(Player player){
		if(!isOwned){
			System.out.println(player.getPlayerName() + " has the option to buy the property " + name + " at pos" + player.getBoardPosition() + ". The property costs " + getCost(value) + " . They have " + player.balance.getBalance());
		}
		else if (getOwner() == player){
			sell(player);
		}
	}
	
	public int getCost(int position){
		return value;
	}
	
	public void buy(Player player){
		
		if(player.balance.getBalance()> getCost(value)){
			player.balance.subtractBalance(getCost(player.boardPosition));
			System.out.println(player.getPlayerName() + " has bought this property. They now have " + player.balance.getBalance());
			this.SetOwner(player);
		}
		else if(player.balance.getBalance()< getCost(value)){
			System.out.println(player.getPlayerName() +" has an insufficient balace to buy this property");
		}
		else{
			System.out.println("Input is incorrect");
			buy(player);
			System.out.println("4");
		}

	}
	
	public void sell(Player player){
		if(isOwned){
			player.balance.addBalance(getCost(player.boardPosition));
			owner = null;
			isOwned = false;
			System.out.println("You have sold the property");
		}
	}
	
	public void hotel(Player player){
		if(isOwned){
			player.balance.subtractBalance(getCost(player.boardPosition)*3);
		}
	}
	
	public void rent(Player player){
		if(!isOwned){
			int rent = getCost((player.boardPosition)*4)/5;
			player.balance.subtractBalance(rent);
			owner.balance.addBalance(rent);
		}
	}
}
