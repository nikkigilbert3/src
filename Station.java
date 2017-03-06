import java.util.Scanner;

public class Station extends Buyable {

	int numOwnedByPlayer;
	
	
	public Station(String nme, int cost, int pos ){
		super(cost, pos, nme);
	}
	
	public int rent(){
		float rent = 12.5f;
		for(int x = 1; x <= 4; x++){
			rent *= 2;
			if(x == numOwnedByPlayer){
				break;
			}
		}
		return (int)rent;
	}
	
	public void land(Player player){
			if(turn == true && !isOwned){
				
				System.out.println(player.getPlayerName() + " has the option to buy the property " + name + " at pos" + player.getBoardPosition() + ". The property costs " + getCost() + " . They have " + player.balance.getBalance());
				
				buy(player);
				
			}
			else if (turn == true && getOwner() == player){
				sell(player);
			}
			
		}
	
	public void payRent(Player player){
		if(!isOwned && owner != null){
			player.balance.subtractBalance(rent());
		}
	}
	
	public int getCost(){
		return 200;
	}
	
public void buy(Player player){
		
		//Buy
		System.out.println("1");
		
		//Get Input
		
		if(player.balance.getBalance()> getCost()){
			player.balance.subtractBalance(getCost());
			System.out.println(player.getPlayerName() + " has bought this property. They now have " + player.balance.getBalance());
			this.SetOwner(player);
			System.out.println("2");
		}
		else if(player.balance.getBalance()< getCost()){
			System.out.println(player.getPlayerName() +" has an insufficient balace to buy this property");
			System.out.println("3");
		}
		else{
			System.out.println("Input is incorrect");
			buy(player);
			System.out.println("4");
		}

	}
	
	public void sell(Player player){
		if(isOwned){
			player.balance.addBalance(getCost());
			owner = null;
			isOwned = false;
			System.out.println("You have sold the property");
		}
	}
	
	
	
	
}



