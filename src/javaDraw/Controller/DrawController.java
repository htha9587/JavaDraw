package javaDraw.Controller;

/**
 * Version 0.1
 * @author htha9587
 * 4-21-16
 */

import javaDraw.view.*;
import java.awt.*;
import javax.swing.*;
import javaDraw.model.*;

public class DrawController 
{
	private DrawingPanel basePanel;
	public ShapeFrame getBaseFrame() {
		return baseFrame;
	}


	public void setBaseFrame(ShapeFrame baseFrame) {
		this.baseFrame = baseFrame;
	}


	private ShapeFrame baseFrame;
	private DrawModel baseModel;
	
	public DrawController()
	{
		baseFrame = new ShapeFrame(this);
		baseModel = new DrawModel();
	}
	
	
	public void start()
	{
		
	}
	
	
	
	
	
	
	
}
