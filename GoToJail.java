
public class GoToJail extends Segment{
	
	public GoToJail(String nme,int pos ){
		super(pos, nme);
	}
	
	public void land(Player player){
		jailed(player);
	}
	
	public void jailed(Player player){
		player.setBoardPosition(10);
		player.jailed = true;
	}
	
}
