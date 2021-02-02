package Gui_Test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GameDisplay extends JFrame {
	private JTextField text, text2;
	private JButton b1, b2, b3, b4;
	String vC[] = {"fly", "quit", "help", "look", "take", "give", "teleport", "ask", "warp", "inventory", "go"};
	CommandWords cW= new CommandWords(vC);
    Parser parser= new Parser(cW);
    Game game;
	private static final long serialVersionUID = 1;
	public GameDisplay(){
		super("The Treasure Hunter GUI");
	    Container container= getContentPane();
	    container.setLayout(new FlowLayout());
	    
	    //Construct textField with sizing
	    text= new JTextField(10);
	    container.add(text);
	    
	    //Construct textField with sizing
	    text2= new JTextField("Press Enter after inputing Text");
	    container.add(text2);
	    text2.setEditable(false);
	    
	    //Buttons
	    b1 = new JButton("North");
	    b2 = new JButton("South");
	    b3 = new JButton("West");
	    b4 = new JButton("East");
	    
	    container.add(b1);
	    container.add(b2);
	    container.add(b3);
	    container.add(b4);
	    
	    //Handler
	    TextFieldHandler handler = new TextFieldHandler();
	    
	    text.addActionListener(handler);
	    text2.addActionListener(handler);
	    b1.addActionListener(handler);
	    b2.addActionListener(handler);
	    b3.addActionListener(handler);
	    b4.addActionListener(handler);
	    
	    setSize(350,100);
	    setVisible(true);
	    game= new Game();
	    JOptionPane.showMessageDialog( null, game.startGame() );
	  }
	class TextFieldHandler implements ActionListener {
    	public void actionPerformed(ActionEvent event) {
    		String textMessage= "";
    		String string1 = "";
    		if ( event.getSource() == text ) {
    			string1 = "Command: " + event.getActionCommand();
    			JOptionPane.showMessageDialog( null, string1 );
    			Command command = parser.getCommand(event.getActionCommand());
    			textMessage = game.processCommand(command);
    			string1 = textMessage;
    			if(event.getActionCommand().equalsIgnoreCase("text2")) {
    				text2.setText("life");
    			}
    		}
    		else if (event.getSource() == text2 ) {
    			string1 = "text2: " + event.getActionCommand();
    		}
    		else if (event.getSource() == b1) {
    			string1 = "north";
    			JOptionPane.showMessageDialog( null, string1 );
    			Command command = parser.getCommand("go north");
    			textMessage = game.processCommand(command);
    			string1 = textMessage;
    		}
    		else if (event.getSource() == b2) {
    			string1 = "south";
    			JOptionPane.showMessageDialog( null, string1 );
    			Command command = parser.getCommand("go south");
    			textMessage = game.processCommand(command);
    			string1 = textMessage;
    		}
    		else if (event.getSource() == b3) {
    			string1 = "west";
    			JOptionPane.showMessageDialog( null, string1 );
    			Command command = parser.getCommand("go west");
    			textMessage = game.processCommand(command);
    			string1 = textMessage;
    		}
    		else if (event.getSource() == b4) {
    			string1 = "east";
    			JOptionPane.showMessageDialog( null, string1 );
    			Command command = parser.getCommand("go east");
    			textMessage = game.processCommand(command);
    			string1 = textMessage;
    		}
    		if(event.getActionCommand().equalsIgnoreCase("exit")||textMessage.equalsIgnoreCase("quit")) {
    			string1 = "Program is exiting";
    			JOptionPane.showMessageDialog( null, string1 );
				System.exit(0);
			}
    		JOptionPane.showMessageDialog( null, string1 );
    	}

    }
}

