
public abstract class Segment {
	
	protected int position;
	protected String name;
	
	public Segment(int pos, String nme){
		position = pos;
		name = nme;
	}
	
	public void land(Player player){	}
}
