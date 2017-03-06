
public class Buyable extends Segment {
	
	
	protected int value;
	protected boolean isOwned = false;
	protected Player owner;
	
	public Buyable(int cost, int pos, String nme){
		super(pos, nme);
		value = cost;
	}

	public boolean isOwned(){
		return isOwned;
	}
	
	public boolean isMine(Player player){
		if(owner == player){
			return true;
		}else{
			return false;
		}
	}
	
	public void sell(){
		// link to player to be able to sell at any time
	}
	
	public Player getOwner(){
		if(!isOwned){
			return null;
		}else{
			return owner;
		}
	}
	
}
