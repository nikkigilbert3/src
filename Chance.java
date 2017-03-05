import java.util.Random;

public class Chance extends Segment{
	
	public Chance(String nme, int pos ){
		super(pos, nme);
	}
	
	public void land(Player player){
		getChance(player);
	}
	
	Random rand = new Random();
	public void getChance(Player player){
			int card = 2;//1+rand.nextInt(13);
			if (card == 1){
				System.out.println("Advance to Go! - Collect 200!");
				player.balance.addBalance(200);
				player.setBoardPosition(0);
				
			}
			if (card == 2){
				System.out.println("Advance to Pall Mall - Collect 200 if you pass Go!");
				if(player.getBoardPosition() > 25){	
					player.balance.addBalance(200);
					player.setBoardPosition(25);
					
				}
				else{
					player.setBoardPosition(25);
				}
			}
			if (card == 3){
				System.out.println("Take a trip to Marylebone Station - Collect 200 if you pass Go!");
				if(player.getBoardPosition() > 5){	
					player.balance.addBalance(200);
					player.setBoardPosition(5);
				}
				else{
					player.setBoardPosition(5);
				}
			}
			if (card == 4){
				System.out.println("Advance to Trafalgar Square -  Collect 200 if you pass Go!");
				if(player.getBoardPosition() > 13){	
					player.balance.addBalance(200);
					player.setBoardPosition(13);
				}
				else{
					player.setBoardPosition(13);
				}
			}
			if (card == 5){
				System.out.println("Get Out of Jail Free!");
				//Make get out of jail free card
			}
			if (card == 6){
				System.out.println("Go to Jail!");
				// send person to spot 10 lock them in
			}
			if (card == 7){
				System.out.println("Go back three spaces");
				player.setBoardPosition(player.getBoardPosition() - 3);
			}
			if (card == 8){
				System.out.println("Pay school fees of 150");
				//Subtract 150 from bank balance
				player.balance.subtractBalance(150);
			}
			if (card == 9){
				System.out.println("Drunk and Disorderly - Pay 20");
				//Subtract 20 from bank balance
				player.balance.subtractBalance(20);
			}
			if (card == 10){
				System.out.println("Speeding fine - Pay 15");
				// Subtract 15 from bank balance
				player.balance.subtractBalance(15);
			}
			if (card == 11){
				System.out.println("Your building loan matures - Collect 150");
				//add 150 to bank balance
				player.balance.addBalance(200);
			}
			if (card == 12){
				System.out.println("You have won a crossword competition - Collect 100");
				//add 100 to bank balance
				player.balance.addBalance(200);
			}
			if (card == 13){
				System.out.println("Bank pays you dividend of 50");
				//add 50 to bank balance
				player.balance.addBalance(50);
			}
	}
	
	}

