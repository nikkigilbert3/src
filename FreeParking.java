
public class FreeParking extends Segment {
	
	/**
	* Constructor
	* 
	* @param nme name of the player
	* @param pos position of the player
	*
	*/
	public FreeParking(String nme, int pos ){
		super(pos, nme);
	}
	
	static int parked = 1000;

	/**
	*
	* @param player player lands on free parking
	*
	*/
	public void land(Player player){
		freeParking(player);
	}
	
	/**
	* @param player when the player lands on free parking
	* they do not owe or receive any money
	*/
	public void freeParking(Player player){
		player.balance.addBalance(parked);
		parked = 0;
	}
}
