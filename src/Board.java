import java.awt.*;
import javax.swing.*;


public class Board extends JPanel {
	 
	private Image image1;
	
	//changes where the image is placed on the window
	private int width_placement = 0;
	private int height_placement = 0;
	
	public Board() { //main function
		
		loadImage(); //loads the original image file into the program
		
		//gets the size of the original image
		int width = image1.getWidth(this);
		int height = image1.getHeight(this);
		
		setPreferredSize( new Dimension(width, height) ); //sets the dimension of image file to the width and height of the original image
		
	}
	
	private void loadImage() { //loads the image
		
		//assigns the directory of the image to a ImageIcon object
		ImageIcon one = new ImageIcon("src/00f3f7b1a033f05cc40b28f09de7b10cb4760ed2_full.jpeg");
		//ImageIcon supports JPEG, GIF, PNG, and XBM formats
		
		//loads the image and assigns it into image1
		image1 = one.getImage();
		
	}
	
	
	//THIS paintComponent FUNCTION IS NECESSARY TO DISPLAY THE IMAGE
	@Override
	public void paint(Graphics img1) {
		
		img1.drawImage(image1, width_placement, height_placement, null);
		//tx1.drawString(text1, width_placement, height_placement + 50);
		
	}
	
}
