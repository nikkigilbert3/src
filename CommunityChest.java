import java.util.Random;
public class CommunityChest extends Segment{
	
	
	public CommunityChest(String nme, int pos ){
		super(pos, nme);
	}
	
	
	public void land(Player player){
		//getCommunity(player);
		getCommunity(player);
	}
	
	
	Random rand = new Random();
	public void getCommunity(Player player){
		int card = 1 +rand.nextInt(13);
		if (card == 1){
			System.out.println("Advance to Go! - Collect 200!");
			//Add 200 to bank balance
			player.balance.addBalance(200);
		}
		else if (card == 2){
			System.out.println("Bank error in your favor - Collect 200!");
			//Add 200 to bank balance
			player.balance.addBalance(200);
		}
		else if (card == 3){
			System.out.println("Doctor's fee - Pay 50!");
			//Subtract 50 from bank balance
			player.balance.subtractBalance(50);
		}
		else if (card == 4){
			System.out.println("Sale of Stock - Collect 50!");
			//Add 200 to bank balance
			player.balance.addBalance(200);
		}
		else if (card == 5){
			System.out.println("Get Out of Jail Free!");
			//Make get out of jail free card
			//Must do
		}
		else if (card == 6){
			System.out.println("Go to Jail!");
			// send person to spot 10 lock them in
			player.setBoardPosition(10);
		}
		else if (card == 7){
			System.out.println("Holiday Fund Matures - Collect 100!");
			//Add 100 to bank balance
			player.balance.addBalance(100);
		}
		else if (card == 8){
			System.out.println("Income tax refund - Collect 20!");
			//add 20 to bank balance
			player.balance.addBalance(20);
		}
		else if (card == 9){
			System.out.println("Life Insurance Matures - Collect 100!");
			//Add 100 to bank balance
			player.balance.addBalance(100);
		}
		else if (card == 10){
			System.out.println("Hospital Fees - Pay 100!");
			// Subtract 100 from bank balance
			player.balance.subtractBalance(100);
		}
		else if (card == 11){
			System.out.println("School Fees - Pay 150!");
			//subtract 150 from bank balance
			player.balance.subtractBalance(150);
		}
		else if (card == 12){
			System.out.println("Consultancy Fee - Collect 25!");
			//add 25 to bank balance
			player.balance.addBalance(25);
		}
		else if (card == 13){
			System.out.println("You Have Won Second Prize in a Beauty Contest - Collect 10!");
			//add 10 to bank balance
			player.balance.addBalance(10);
		}
		
		System.out.println("CC " + player.getPlayerName() + " " +player.balance.getBalance());
}
}

//1.Advance to Go (Collect $200)/
//2Bank error in your favor – Collect $200
//3Doctor's fees {fee} – Pay $50 
//4From sale of stock you get $50
//5Get Out of Jail Free
//6Go to Jail
//7Holiday {Xmas} Fund matures - Receive {Collect} $100 
//8Income tax refund – Collect $20
//9Life insurance matures – Collect $100
//10Pay hospital fees of $100
//11Pay school fees {tax} of $150 
//12Receive $25 consultancy fee
//13You have won second prize in a beauty contest – Collect $10 
