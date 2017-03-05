
public class TurnManager {

	private Player currentPlayer;
	
	private static TurnManager instance = null;
	
	protected TurnManager(){}
	
	protected TurnManager(Player first){
		this.currentPlayer = first;
	}
	
	public static TurnManager getInstance(){
		if(instance == null){
			instance = new TurnManager();
		}
		return instance;
		
	}
	
	public static TurnManager getInstance(Player first){
		if(instance == null){
			instance = new TurnManager();
		}
		return instance;
	}
	
	public Player getCurrentPlayer(){
		return currentPlayer;
	}
	
	public void setCurrentPlayer(Player currentPlayer){
		this.currentPlayer = currentPlayer;
	}
}
