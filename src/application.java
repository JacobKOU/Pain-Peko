import java.awt.*;
import java.util.*;

import javax.swing.*;


public class application extends JFrame{
	
	//size of window
	public int width = 200; 
	public int height = 210;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(() -> {
			
			
			//this is a algorithm that I implimented for fun because I thought it would be fun (and it's hilarious too)
			
			int number_of_windows = 100; //the number of windows the computer will load
			
			application[] apps = new application[number_of_windows]; //array of application objects
			
			for (int i = 0; i < number_of_windows; i++) { //goes through the array
				
				application ex = new application();
				
				apps[i] = ex; //assigns a application object to the current spot in the array
				
				apps[i].setVisible(true); //makes the window visible
				
			}
			
			
	    });
		

	}
	
	private void user_interface() {
		
		add(new Board() ); //loads the Board application
		
		setSize( width, height); //makes width and height of the window
		
		setTitle("Pain Peko"); //makes the title of the window
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the program when the exit button is closed one one window
		
		Random random = new Random(); //makes a random object
		
		setLocation( random.nextInt(1000), random.nextInt(800) ); //randomly places a window on a random spot of the computer
		
		//setLocationRelativeTo(null); //This centers the window on the screen
		
	}
	
	public application() {
		
		user_interface();
		
	}
	


}
