import java.awt.image.*;
import java.awt.*;
import javax.imageio.*; 
import java.io.*;
import javax.swing.*;
import java.nio.file.*;
 class Swinger
  {
	String path = "";
	String pathold = "";	
	 public static void main(String... args)
	 {
		 Swinger swinger1 = new Swinger();
		 System.out.println(swinger1.pathify(horndog.path));
		
	 }
	 String pathify(String path)
	 {
		 Swinger swinger2 = new Swinger();
		 Randy randy = new Randy();
		 JFrame frame = new JFrame();
		 JPanel panel = new JPanel();
		 String codeword = randy.randevu();
		 JLabel label = new JLabel(codeword);
			frame.setSize(200, 100);
			panel.add(label);
			frame.add(panel);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			//panel.revalidate();
			panel.repaint();
			
			path = swinger2.snapshot(panel, frame);
			
			return path;
	 }
	
 public String snapshot(JPanel panel, JFrame frame)
 {
	 String path = "";
	 try
	 {
	 File output = File.createTempFile("test",".png");
	 boolean result = Files.deleteIfExists(output.toPath());
  BufferedImage image = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_ARGB);	
  Graphics2D g2d = image.createGraphics();
  panel.print( g2d );
  g2d.dispose();
  frame.dispose();
  ImageIO.write(image, "png", output);
  path = output.getPath().replace("\\","/");
  
  output.deleteOnExit();
  
	 }catch(IOException e)
	 {
		 e.printStackTrace();
	 }
	 return path;
 }
 }