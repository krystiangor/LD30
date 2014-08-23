package com.ionprogramming.ld30;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Images {

	public static BufferedImage ld;
	public static BufferedImage ion;
	public static BufferedImage map1;

	
	public static void load(){
		try {
			ld = ImageIO.read(Images.class.getClassLoader().getResourceAsStream("res/ld.png"));
			ion = ImageIO.read(Images.class.getClassLoader().getResourceAsStream("res/ion.png"));
			map1 = ImageIO.read(Images.class.getClassLoader().getResourceAsStream("res/map1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
