import java.awt.Button;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import java.awt.Color;
import javax.swing.JTextArea;

public class GUI implements ActionListener{

	JFrame frame;
	JButton btnNewButton;
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	static int counter = 0;

	static GUI gui = new GUI();
	static Game game = new Game();

	public boolean buy = false;
	
/**
	 * Create the application.
	 */
	public GUI( ) {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 970, 1000 );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Image image =  new ImageIcon(this.getClass().getResource("/img/test1.jpg")).getImage();
		
		
		
		// Buttons
		btnNewButton = new JButton("Roll");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(550, 560, 200, 100);
		btnNewButton.setVisible(true);
		
		btnNewButton_1 = new JButton("Buy");
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(550, 450, 200, 100);
		btnNewButton_1.setVisible(true);
		
		btnNewButton_2 = new JButton("Sell");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBounds(550, 340, 200, 100);
		btnNewButton_2.setVisible(true);
		
	    
		
		JTextArea Current_Player = new JTextArea();
		Current_Player.setBackground(Color.LIGHT_GRAY);
		Current_Player.setForeground(Color.CYAN);
		Current_Player.setBounds(189, 292, 209, 125);
		frame.getContentPane().add(Current_Player);
		frame.getContentPane().add(btnNewButton_2);
		frame.getContentPane().add(btnNewButton_1);
		frame.getContentPane().add(btnNewButton);
		
		
		// Board
		JLabel Board = new JLabel("");
		Board.setIcon(new ImageIcon(image));
		Board.setBounds(0, 0, 950, 950);
		frame.getContentPane().add(Board);
		
		// Four corners
		JLabel lblNewLabel = new JLabel("GO");
		lblNewLabel.setBounds(0, 810, 143, 140);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_8 = new JLabel("Jail");
		label_8.setBounds(0, 0, 143, 140);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Free Parking");
		label_9.setBounds(814, 0, 136, 140);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Go To Jail");
		label_10.setBounds(814, 810, 136, 140);
		frame.getContentPane().add(label_10);
		
		
		
		
		
		// Left Row
		JLabel label_20 = new JLabel("Pos1");
		label_20.setBounds(0, 737, 143, 74);
		frame.getContentPane().add(label_20);
		
		JLabel label_21 = new JLabel("Pos2");
		label_21.setBounds(0, 663, 143, 74);
		frame.getContentPane().add(label_21);
		
		JLabel label_22 = new JLabel("Pos3");
		label_22.setBounds(0, 588, 143, 74);
		frame.getContentPane().add(label_22);
		
		JLabel label_23 = new JLabel("Pos4");
		label_23.setBounds(0, 513, 143, 74);
		frame.getContentPane().add(label_23);
		
		JLabel label_24 = new JLabel("Pos5");
		label_24.setBounds(0, 439, 143, 74);
		frame.getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("Pos6");
		label_25.setBounds(0, 364, 143, 74);
		frame.getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel("Pos7");
		label_26.setBounds(0, 292, 143, 74);
		frame.getContentPane().add(label_26);
		
		JLabel label_27 = new JLabel("Pos8");
		label_27.setBounds(0, 218, 143, 74);
		frame.getContentPane().add(label_27);
		
		JLabel label_28 = new JLabel("Pos9");
		label_28.setBounds(0, 143, 143, 74);
		frame.getContentPane().add(label_28);
		
		
		
		// Top Row
		JLabel label_19 = new JLabel("Pos11");
		label_19.setBounds(143, 1, 75, 140);
		frame.getContentPane().add(label_19);
		
		JLabel label_18 = new JLabel("Pos12");
		label_18.setBounds(216, 0, 75, 140);
		frame.getContentPane().add(label_18);
		
		JLabel label_17 = new JLabel("Pos13");
		label_17.setBounds(291, 0, 75, 140);
		frame.getContentPane().add(label_17);
		
		JLabel label_16 = new JLabel("Pos14");
		label_16.setBounds(366, 1, 75, 140);
		frame.getContentPane().add(label_16);
		
		JLabel label_15 = new JLabel("Pos15");
		label_15.setBounds(440, 0, 75, 140);
		frame.getContentPane().add(label_15);
		
		JLabel label_14 = new JLabel("Pos16");
		label_14.setBounds(514, 0, 75, 140);
		frame.getContentPane().add(label_14);
		
		JLabel label_13 = new JLabel("Pos17");
		label_13.setBounds(588, 0, 75, 140);
		frame.getContentPane().add(label_13);
		
		JLabel label_12 = new JLabel("Pos18");
		label_12.setBounds(663, 1, 75, 140);
		frame.getContentPane().add(label_12);
		
		JLabel label_11 = new JLabel("Pos19");
		label_11.setBounds(737, 0, 75, 140);
		frame.getContentPane().add(label_11);
		
		
		
		
		
		// Right row
		JLabel label_29 = new JLabel("Pos21");
		label_29.setBounds(807, 737, 143, 74);
		frame.getContentPane().add(label_29);
		
		JLabel label_30 = new JLabel("Pos22");
		label_30.setBounds(807, 663, 143, 74);
		frame.getContentPane().add(label_30);
		
		JLabel label_31 = new JLabel("Pos23");
		label_31.setBounds(807, 588, 143, 74);
		frame.getContentPane().add(label_31);
		
		JLabel label_32 = new JLabel("Pos24");
		label_32.setBounds(807, 513, 143, 74);
		frame.getContentPane().add(label_32);
		
		JLabel label_33 = new JLabel("Pos25");
		label_33.setBounds(807, 439, 143, 74);
		frame.getContentPane().add(label_33);
		
		JLabel label_34 = new JLabel("Pos26");
		label_34.setBounds(807, 364, 143, 74);
		frame.getContentPane().add(label_34);
		
		JLabel label_35 = new JLabel("Pos27");
		label_35.setBounds(807, 292, 143, 74);
		frame.getContentPane().add(label_35);
		
		JLabel label_36 = new JLabel("Pos28");
		label_36.setBounds(807, 218, 143, 74);
		frame.getContentPane().add(label_36);
		
		JLabel label_37 = new JLabel("Pos29");
		label_37.setBounds(807, 143, 143, 74);
		frame.getContentPane().add(label_37);
		
		
		
		// Bottom Row
		JLabel label_7 = new JLabel("Pos31");
		label_7.setBounds(737, 810, 75, 140);
		frame.getContentPane().add(label_7);
		
		JLabel label_6 = new JLabel("Pos32");
		label_6.setBounds(663, 811, 75, 140);
		frame.getContentPane().add(label_6);
		
		JLabel label_5 = new JLabel("Pos33");
		label_5.setBounds(588, 810, 75, 140);
		frame.getContentPane().add(label_5);
		
		JLabel label_4 = new JLabel("Pos34");
		label_4.setBounds(514, 810, 75, 140);
		frame.getContentPane().add(label_4);
		
		JLabel label_3 = new JLabel("Pos35");
		label_3.setBounds(440, 810, 75, 140);
		frame.getContentPane().add(label_3);
		
		JLabel label_2 = new JLabel("Pos36");
		label_2.setBounds(366, 811, 75, 140);
		frame.getContentPane().add(label_2);
		
		JLabel label_1 = new JLabel("Pos37");
		label_1.setBounds(291, 810, 75, 140);
		frame.getContentPane().add(label_1);
			
		JLabel label = new JLabel("Pos38");
		label.setBounds(216, 810, 75, 140);
		frame.getContentPane().add(label);
		
		JLabel lblPos = new JLabel("Pos39");
		lblPos.setBounds(143, 811, 75, 140);
		frame.getContentPane().add(lblPos);
		
		
		// add the listener to the jbutton to handle the "pressed" event
	    btnNewButton.addActionListener(this);
		
		
		
	}

	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource().equals(gui.btnNewButton)){
			game.turn(game.getCurrentPlayer());
			counter++;
	    }
		else if (e.getSource().equals(gui.btnNewButton_1)){
			game.buy();
	    }

			
	}
	
	public static void main(String args[]){
		
		Player player1 = new Player(1, "Brian");
		Player player2 = new Player(2, "Kevin");
		Player player3 = new Player(3, "Paul");
		Player player4 = new Player(4, "Nikki");
		
		ArrayList<Player> players = new ArrayList<Player>();
		
		players.add(player1);
		players.add(player2);
		players.add(player3);
		players.add(player4);
		
		
		/*
		int i = 0;
		while(connectedClients < 4){
			//when client connects assign to player
		 	if(client connects){
		 		OnClientConnect("name") client = players[i];
		 		i++;
		 	}
		}
		*/
		EventQueue.invokeLater(new Runnable() {
		public void run() {
				try {
					gui.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		Board board = new Board();
		
		board.createBoard();
			
		
			if(counter >= 0){
			
				game.currentPlayer = players.get(counter);
				System.out.println("\n\nIt is " + game.currentPlayer.getPlayerName() + "'s go. They have " + game.currentPlayer.balance.getBalance() + " in the bank");
				//game.turn(player1);
				/*System.out.println("\n\nIt is " + player1.getPlayerName() + "'s go. They have " + player1.balance.getBalance() + " in the bank");
				
			
				System.out.println("\n\nIt is " + player2.getPlayerName() + "'s go. They have " + player2.balance.getBalance() + " in the bank");
				game.turn(player2);
				
				System.out.println("\n\nIt is " + player3.getPlayerName() + "'s go. They have " + player3.balance.getBalance() + " in the bank");
				game.turn(player3);
				
				System.out.println("\n\nIt is " + player4.getPlayerName() + "'s go. They have " + player4.balance.getBalance() + " in the bank");
				game.turn(player4);
				*/
			
		}
		}
		
		
}
	
	
	
