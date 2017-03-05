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
		
		payRent(player);
		sell(player);
		buy(player);
		
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
		System.out.println(player.getPlayerName() + " has the option to buy. They have " + player.balance.getBalance() + ". Enter Y to buy or N to not buy: ");
		Scanner sc = new Scanner(System.in);
		String i = sc.next();
		if(!isOwned){
			if(i.equals("Y") && player.balance.getBalance()> getCost()){
				System.out.println(player.getPlayerName() + " has bought this property. They now have " + player.balance.getBalance());
				player.balance.subtractBalance(getCost());
				owner = player;
			}
			else if (i.equals("N")){
				System.out.println("You do not want this train station");
			}
			else if(player.balance.getBalance()< getCost()){
				System.out.println("You do not have enough money for this"); 
			}
			else{
				System.out.println("Input is incorrect. input ' Y ' for yes and ' N ' for no");
				buy(player);
			}
		
		}
	}
	
	public void sell(Player player){
		if(isOwned){
			player.balance.addBalance(getCost());
			owner = null;
			System.out.println("You have sold the property");
		}
	}
	
	
	
	
}



