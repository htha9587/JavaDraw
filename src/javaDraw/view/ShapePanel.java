package javaDraw.view;

/**
 * Version 0.3
 * @author htha9587
 * 4-25-16
 */

import javaDraw.Controller.*;
import javaDraw.view.*;

import javax.swing.*;

import java.util.*;
import java.awt.*;
import java.awt.geom.*;

public class ShapePanel extends JPanel
{
	private ArrayList<Rectangle> rectangleList;
	private ArrayList<Rectangle> squareList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Ellipse2D> circleList;
	private ArrayList<Polygon> polygonList;
	private ArrayList<Polygon> triangleList;
	
	public ShapePanel()
	{
		rectangleList = new ArrayList<Rectangle>();
		squareList = new ArrayList<Rectangle>();
		ellipseList = new ArrayList<Ellipse2D>();
		circleList = new ArrayList<Ellipse2D>();
		polygonList = new ArrayList<Polygon>();
		triangleList = new ArrayList<Polygon>();
	}
	
	public void addRectangle()
	{
		int xPosition= (int) (Math.random() * getWidth());
		int yPosition= (int) (Math.random() * getHeight());
		int width = (int) (Math.random() * 100);
		int height = (int) (Math.random() * 100);
		
		rectangleList.add(new Rectangle(xPosition, yPosition, width, height));
		repaint();
	}
	
	public void addSquare()
	{
		int xPosition= (int) (Math.random() * getWidth());
		int yPosition= (int) (Math.random() * getHeight());
		int width = (int) (Math.random() * 100);
		int height = (int) (Math.random() * 100);
		
		squareList.add(new Rectangle(xPosition, yPosition, width, height));
		repaint();
	}
	
	public void addEllipse()
	{
		int xPosition= (int) (Math.random() * getWidth());
		int yPosition= (int) (Math.random() * getHeight());
		int width = (int) (Math.random() * 100);
		int height = (int) (Math.random() * 100);
		
		ellipseList.add(new Ellipse2D.Double(xPosition, yPosition, width, height));
		repaint();
	}
	
	public void addCircle()
	{
		int xPosition= (int) (Math.random() * getWidth());
		int yPosition= (int) (Math.random() * getHeight());
		int width = (int) (Math.random() * 100);
		int height = (int) (Math.random() * 100);
		
		circleList.add(new Ellipse2D.Double(xPosition, yPosition, width, height));
		repaint();
	}
	
	public void addTriangle()
	{
		int [] xPoints = new int[3];
		xPoints[0] = (int)(Math.random() * 150);
		xPoints[1] = (int)(Math.random() * 250);
		xPoints[2] = (int)(Math.random() * 350);
		int [] yPoints = {(int)(Math.random() * 250), (int) (Math.random() * 450), (int)(Math.random() * 250)};
		Polygon triangle = new Polygon(xPoints, yPoints, 3);
		triangleList.add(triangle);
		repaint();
	}
	
	public void addPolygon()
	{
		int numberOfSides = (int)(Math.random() * 9) + 3;
		int [] xPoints = new int [numberOfSides];
		int [] yPoints = new int [numberOfSides];
		
		for(int side = 0; side < numberOfSides; side++)
		{
			xPoints[side] = (int)(Math.random() * 2000);
			yPoints[side] = (int)(Math.random() * 2000);
		}
		Polygon myPolygon = new Polygon(xPoints, yPoints, numberOfSides);
		polygonList.add(myPolygon);
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		//mainGraphics.setStroke(new BasicStroke(20));
		//mainGraphics.setColor(Color.GREEN);
		//mainGraphics.drawRect(50, 70, 200, 20);
		//mainGraphics.drawRect(50, 70, 50, 100);
		//Ellipse2D ellipse = new Ellipse2D.Float();
		//ellipse.setFrame(50, 70, 200, 20);
		//Ellipse2D circle = new Ellipse2D.Float();
		//circle.setFrame(50, 70, 200, 20);
		
		
		for(Rectangle current: rectangleList)
		{
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			
			mainGraphics.setColor(new Color(red,green,blue));
			mainGraphics.fill(current);
		}
		
		for(Rectangle current: squareList)
		{
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			
			mainGraphics.setColor(new Color(red,green,blue));
			mainGraphics.fill(current);
		}
		
		for(Ellipse2D current: ellipseList)
		{
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			
			mainGraphics.setColor(new Color(red,green,blue));
			mainGraphics.fill(current);
		}
		
		for(Ellipse2D current: circleList)
		{
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			
			mainGraphics.setColor(new Color(red,green,blue));
			mainGraphics.fill(current);
		}
		
		for(Polygon current: triangleList)
		{
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int penSize = (int)(Math.random() * 10) + 3;
			mainGraphics.setColor(new Color(red,green,blue));
			mainGraphics.setStroke(new BasicStroke(penSize));
			mainGraphics.draw(current);
		}
		
		for(Polygon current: polygonList)
		{
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			int penSize = (int)(Math.random() * 10) + 3;
			mainGraphics.setColor(new Color(red,green,blue));
			mainGraphics.setStroke(new BasicStroke(penSize));
			mainGraphics.draw(current);
		}
	
	}

	public void Clear() 
	{
		polygonList.clear();
		triangleList.clear();
		circleList.clear();
		squareList.clear();
		rectangleList.clear();
		ellipseList.clear();
		
	}
}
