package javaDraw.view;

/**
 * Version 0.1
 * @author htha9587
 * 4-21-16
 */

import java.awt.*;
import javax.swing.*;
import javaDraw.Controller.*;
import javaDraw.view.*;

public class ShapeFrame extends JFrame
{
	private DrawController baseController;
	private DrawingPanel basePanel;
	
	public ShapeFrame(DrawController baseController)
	{
		this.baseController = baseController;
		basePanel = new DrawingPanel(baseController);
		setUpFrame();
		
		
		private DrawingController baseController()
		{
			return null;
		}
		
		
		
	}

	private void setUpFrame() 
	{
		this.setContentPane(basePanel);
		this.setResizable(true);
		this.setTitle("JavaDraw");
		this.setSize(400,400);
		this.setVisible(true);
		
	}
	
	public DrawController getBaseController()
	{
		return baseController;
	}
	
	
	
	
}
