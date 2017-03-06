import java.util.Scanner;

public class Properties extends Buyable {
	
	volatile boolean buy;
	
	public Properties(String nme, int cost, int pos ){
		super(cost, pos, nme);
	}
	
	public void land(Player player){
		if(!isOwned){
			
			System.out.println(player.getPlayerName() + " has the option to buy the property " + name + " at pos" + player.getBoardPosition() + ". The property costs " + getCost(value) + " . They have " + player.balance.getBalance());
			//buy(player);
			
		}
		else if (turn == true && getOwner() == player){
			sell(player);
		}
		//hotel(player);
		
	}
	
	public int getCost(int position){
		return value;
	}
	
	public void buy(Player player){
		
		//Buy
		System.out.println("1");
		
		//Get Input
		
		if(player.balance.getBalance()> getCost(value)){
			player.balance.subtractBalance(getCost(player.boardPosition));
			System.out.println(player.getPlayerName() + " has bought this property. They now have " + player.balance.getBalance());
			this.SetOwner(player);
			System.out.println("2");
		}
		else if(player.balance.getBalance()< getCost(value)){
			System.out.println(player.getPlayerName() +" has an insufficient balace to buy this property");
			System.out.println("3");
		}
		else{
			System.out.println("Input is incorrect");
			buy(player);
			System.out.println("4");
		}

	}
	
	/*public void buy(Player player){
		System.out.println(player.getPlayerName() + " has the option to buy the property " + name + " at pos" + player.getBoardPosition() + ". The property costs " + getCost(value) + " . They have " + player.balance.getBalance() + ". Enter Y to buy or N to not buy: ");
		Scanner sc = new Scanner(System.in);
		String i = sc.next();
		if(!isOwned){
			if(i.equals("Y") && player.balance.getBalance()> getCost(value)){
				player.balance.subtractBalance(getCost(player.boardPosition));
				System.out.println(player.getPlayerName() + " has bought this property. They now have " + player.balance.getBalance());
				owner = player;
			}
			else if (i.equals("N")){
				System.out.println(player.getPlayerName() +" has decided to not buy the property");
			}
			else if(player.balance.getBalance()< getCost(value)){
				System.out.println(player.getPlayerName() +" has an insufficient balace to buy this property");
			}
			else{
				System.out.println("Input is incorrect. input ' Y ' for yes and ' N ' for no");
				buy(player);
			}
		
		}
	}*/
	
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
