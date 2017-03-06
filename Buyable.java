
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
	
	public Player getOwner(){
		if(!isOwned){
			return null;
		}else{
			return owner;
		}
	}
	
	public void SetOwner(Player player){
		owner = player;
		isOwned = true;
	}
	
}
