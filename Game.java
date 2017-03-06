import java.awt.EventQueue;

public class Game implements GameInterface{
	
	public Player currentPlayer;
	
	private Segment seg;
	static int jailCounter = 0;
	boolean jailed = false;
	int turnCounter = 0;

	Dice dice = new Dice();
	Board board = new Board();
	
	public void turn(Player player){
		currentPlayer = player;
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


	@Override
	public void takeTurn(Player player) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void buy()
	{
		getCurrentPlayer();
	}


	@Override
	public Player getCurrentPlayer() {
		return currentPlayer;
	}


	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}
	
	

}
