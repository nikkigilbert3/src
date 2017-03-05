
public class FreeParking extends Segment {
	
	public FreeParking(String nme, int pos ){
		super(pos, nme);
	}
	
	static int parked = 1000;

	public void land(Player player){
		freeParking(player);
	}
	
	public void freeParking(Player player){
		player.balance.addBalance(parked);
		parked = 0;
	}
}
