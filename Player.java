
public class Player{
	String playerName;
	int playerID;
	
	int boardPosition = 0;
	public Balance balance = new Balance(1500);
	public boolean jailed;
	/**
	 * Constructor
	 *
	 * @param id is a specific identifier for each player
	 * @para name is the name of the player
	 */
	public Player(int id, String name){
		this.playerID = id;
		this.playerName = name;
	}
	
	/**
	 * @return specific player ID
	 */
	public int getPlayerID(){
		return playerID;
	}
	
	/**
	 * @return specific player name
	 */
	public String getPlayerName(){
		return playerName;
	}
	/**
	 * @return players position on the board
	 */
	public int getBoardPosition(){
		return boardPosition;
	}
	/**
	 * @return players balance
	 */
	public int seeBalance(){
		return balance.getBalance();
	}
	
	/**
	 * @param position sets the position of the player on the board
	 */
	public void setBoardPosition(int position) {
		boardPosition = position;
		
	}
}
