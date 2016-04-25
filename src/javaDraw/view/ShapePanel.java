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
		int xPosition= (int) (Math.random() * getWidth());
		int yPosition= (int) (Math.random() * getHeight());
		int width = (int) (Math.random() * 100);
		int height = (int) (Math.random() * 100);
		
		//triangleList.add(new Polygon(xPosition, yPosition, width, height));
		repaint();
	}
	
	public void addPolygon()
	{
		int xPosition= (int) (Math.random() * getWidth());
		int yPosition= (int) (Math.random() * getHeight());
		int width = (int) (Math.random() * 100);
		int height = (int) (Math.random() * 100);
		
		//polygonList.add(new Polygon(xPosition, yPosition, width, height));
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics currentGraphics)
	{
		super.paintComponent(currentGraphics);
		Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		mainGraphics.setStroke(new BasicStroke(20));
		mainGraphics.setColor(Color.GREEN);
		mainGraphics.drawRect(50, 70, 200, 20);
		mainGraphics.drawRect(50, 70, 50, 100);
		//mainGraphics.drawPolygon(40, 50, 80);
		//mainGraphics.drawPolygon(40, 50, 80);
		Ellipse2D ellipse = new Ellipse2D.Float();
		ellipse.setFrame(50, 70, 200, 20);
		Ellipse2D circle = new Ellipse2D.Float();
		circle.setFrame(50, 70, 200, 20);
		
		
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
			
			mainGraphics.setColor(new Color(red,green,blue));
			mainGraphics.fill(current);
		}
		
		for(Polygon current: polygonList)
		{
			int red = (int)(Math.random() * 256);
			int blue = (int)(Math.random() * 256);
			int green = (int)(Math.random() * 256);
			
			mainGraphics.setColor(new Color(red,green,blue));
			mainGraphics.fill(current);
		}
		
		
	}
}
