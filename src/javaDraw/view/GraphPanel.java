package javaDraw.view;

/**
 * Version 0.5
 * @author htha9587
 * 5-3-16
 */

import java.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import javaDraw.view.*;
import javax.*;
import javax.swing.JPanel;
import javax.xml.soap.Node;

public class GraphPanel extends JPanel
{
	private int [] graphSource;
	
	
	public GraphPanel()
	{
		graphSource = new int [] 
		{
				50, 100, 200, 400, 350, 300, 375
		};
		setUpPanel();
	}
	
	private void setUpPanel()
	{
		this.setBackground(Color.gray);
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		for(int index = 0; index < graphSource.length; index++)
		{
			int height = this.getHeight()/graphSource.length;
			int width = graphSource[index];
			int xPosition = 0;
			int yPosition = height * index;
			int red = (int)(Math.random() * 256);
			int green =  (int)(Math.random() * 256);
			int blue =(int)(Math.random() * 256);
			int alpha = (int)(Math.random() * 256);
			
			mainGraphics.setColor(new Color(red,green,blue, alpha));
			mainGraphics.fill(new Rectangle(xPosition, yPosition, width, height));
		}
	}
	
	
	
}
