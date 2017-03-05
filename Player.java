
public class Player{
	String playerName;
	int playerID;
	
	int boardPosition = 0;
	public Balance balance = new Balance(1500);
	public boolean jailed;
	
	public Player(int id, String name){
		this.playerID = id;
		this.playerName = name;
	}
	
	public int getPlayerID(){
		return playerID;
	}
	
	public String getPlayerName(){
		return playerName;
	}
	
	public int getBoardPosition(){
		return boardPosition;
	}
	
	public int seeBalance(){
		return balance.getBalance();
	}

	public void setBoardPosition(int position) {
		boardPosition = position;
		
	}
}
