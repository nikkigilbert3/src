import java.awt.EventQueue;

public class Game{
	
	
	private Segment seg;
	static int jailCounter = 0;
	boolean jailed = false;
	
	//GUI gui = new GUI();

	Dice dice = new Dice();
	Board board = new Board();
	
	public void turn(Player player){
		if(!player.jailed){
			System.out.println(player.getPlayerName() + " is starting their turn at " + board.getSegment(player.getBoardPosition()).name);
			dice.RollDice();
			int movement = dice.getMovement();	
			player.setBoardPosition(movement + player.getBoardPosition());
			seg = board.getSegment(player.getBoardPosition()); 
			seg.land(player);
			if(dice.DiceEqual()){
				System.out.println("Rolled a double. Gets to go again");
				turn(player);
			}
		}
		else if(jailCounter > 2){
			player.jailed = false;
			turn(player);
		}
		else{
			jailCounter++;
			if(dice.DiceEqual()){
				player.jailed = false;
				turn(player);
				jailCounter = 0;
			}
		}
	}
	
	
	public void moveDirectly(Player player, int position){
		player.boardPosition = position;
		seg.land(player);
		
	}
	
	

}
