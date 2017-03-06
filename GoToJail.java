
public class GoToJail extends Segment{
	/**
	 * Constructor 
	 *
	 * @param nme name of player
	 * @param pos position of player
	 * 
	 */
	public GoToJail(String nme,int pos ){
		super(pos, nme);
	}
	/**
	 * @param player which player is it
	 */
	public void land(Player player){
		jailed(player);
	}
	/**
	 * @param player puts player in jail
	 */
	public void jailed(Player player){
		player.setBoardPosition(10);
		player.jailed = true;
	}
	
}
