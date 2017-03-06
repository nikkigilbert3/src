
public abstract class Segment {
	
	volatile boolean turn = false;
	volatile boolean buy = false;
	
	protected boolean buyable = false;
	
	
	protected int position;
	protected String name;
	
	public Segment(int pos, String nme){
		position = pos;
		name = nme;
	}
	
	public void land(Player player){
		
	}

	public void buy(Player currentPlayer){
		
	}
	
	public void sell(Player currentPlayer){
		
	}
}
