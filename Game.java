import java.awt.EventQueue;

public class Game{
	
	public Player currentPlayer;
	
	Segment seg;
	static int jailCounter = 0;
	boolean jailed = false;
	int turnCounter = 0;
	
	Dice dice = new Dice();
	Board board = new Board();
	GUI gui = new GUI();

	public volatile boolean check = false;
	
	public void turn(Player player){
		currentPlayer = player;
		System.out.println("turn starting for " + currentPlayer.playerName);
		if(!player.jailed){
			System.out.println(player.getPlayerName() + " is starting their turn at " + board.getSegment(player.getBoardPosition()).name);
			dice.RollDice();
			int movement = dice.getMovement();	
			player.setBoardPosition(movement + player.getBoardPosition());
			seg = board.getSegment(player.getBoardPosition());
			pressCheck(player);
			check =  false;
			System.out.println("turn() has ended");
		}
	}
	
	public void buy(){
		if(seg != null){
			System.out.println(seg);
			seg.buy(currentPlayer);
		}
	}
	
	public void pressCheck(Player player){
		if(check = true){
			seg.land(player);
		}
		else{
			pressCheck(player);
		}
	}
	
	
	
	public void moveDirectly(Player player, int position){
		player.boardPosition = position;
		seg.land(player);
		
	}

	public boolean clicked(){
		return gui.Roll.getModel().isPressed();
	}



	public Player getCurrentPlayer() {
		return currentPlayer;
	}
	
}