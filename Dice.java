import java.util.Random;
public class Dice {
	Random rand = new Random();
	int face1;
	int face2;
	volatile boolean pressed;
	
	public Dice(){
		
	}
	
	public void RollDice(){
		/*
		gui.rollPressed = false;
		System.out.println(gui);
		pressed = gui.rollPressed;
		
		while (!gui.rollPressed){
			pressed = gui.rollPressed;
		}
		*/
		 face1 = 1+rand.nextInt(12);
		 System.out.println(face1 + " has been rolled.");
	}
	
	public int getMovement(){
		int totalMovement = face1;
		return totalMovement;
	}
	
}
