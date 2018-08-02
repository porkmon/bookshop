package cn.pork.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;



public class ValidateCodeUtils {

	public static String genNewCode(OutputStream ops) throws FileNotFoundException, IOException {
		Random random=new Random();
		int width=120;
		int height=50;
		BufferedImage imge=new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = imge.getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(0, 0, width, height);
		String code=new String();
		for(int i=0;i<4;i++) {
			code+=""+random.nextInt(10);
		}
		g.setColor(Color.BLACK);
		g.setFont(new Font("ºÚÌå",Font.ITALIC, 35));
		g.drawString(code, 20, 40);
		for(int i=0;i<25;i++) {
			int x1=random.nextInt(width);
			int x2=random.nextInt(width);
			int y1=random.nextInt(height);
			int y2=random.nextInt(height);
			g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
			g.drawLine(x1, y1, x2, y2);
		}
		ImageIO.write(imge, "png", ops);
		
		return code;
	}
}
