
public class Tax extends Segment {
	
	public Tax(String nme, int cost, int pos) {
		super(pos, nme);
		// TODO Auto-generated constructor stub
	}

	public void land(Player player){
		player.balance.subtractBalance(200);
		System.out.println("They've been taxed 200");
	}
	

}
