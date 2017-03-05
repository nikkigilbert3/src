public class Go extends Segment{

	public Go(String nme, int pos) {
		super(pos, nme);
	}
	
	public void land(Player player){
		player.balance.addBalance(200);
	}
}
