package day1107;

import java.awt.Color;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class RgbToGray {
	BufferedImage myImg;
	int width;
	int height;
	
	public RgbToGray() {
		// TODO Auto-generated constructor stub
		myImg = ImageIO.read(iFile);
		
		width = myImg.getWidth();
		height = myImg.getHeight();
		for(int x =0;x<height;x++) {
			for(int y=0;y<width;y++) {
				Color c = new Color(myImg.getRGB(y, x));
				
				int r = (int) (c.getRed()*0.299);
				int g = (int) (c.getGreen()*0.587);
				int b = (int) (c.getBlue()*0.114);
				
				Color gray = new Color(r+g+b,r+g+b,r+g+b);
				myImg.setRGB(y, x, gray.getRGB());
			}
		}
	}
}
