package javaDraw.view;

/**
 * Version 0.2
 * @author htha9587
 * 4-21-16
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javaDraw.Controller.*;
import javaDraw.view.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;



public class DrawingPanel extends JPanel
{

	private DrawController baseController;
	private Panel myDrawingPanel;
	private ShapePanel shapePanel;
	private JLabel Title;
	private JButton drawCircleButton;
	private JButton drawEllipseButton;
	private JButton drawRectangleButton;
	private JButton drawSquareButton;
	private JButton drawTriangleButton;
	private JButton drawPolygonButton;
	private JButton Exit;
	private SpringLayout baseLayout;
	private ArrayList<Rectangle> rectangleList;
	
	
	
	public DrawingPanel(DrawController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		drawRectangleButton = new JButton("Draw Rectangle");
		Exit = new JButton("Exit");
		drawEllipseButton = new JButton("Draw Ellipse");
		drawCircleButton = new JButton("Draw Circle");
		drawSquareButton = new JButton("Draw Square");
		drawTriangleButton = new JButton("Draw Triangle");
		drawPolygonButton = new JButton("Draw Polygon");
		rectangleList = new ArrayList<Rectangle>();
		shapePanel = new ShapePanel();
		
	
		
		
		
		setBackground(Color.red);
		setUpPanel();
		setUpLayout();
		setUpListeners();
		
	}
	
	
	
	/**
	 * Sets up DrawPanel;
	 */
	
	private void setUpPanel()
	{
		this.setLayout(baseLayout);
		this.add(shapePanel);
		this.add(drawCircleButton);
		this.add(drawEllipseButton);
		this.add(drawRectangleButton);
		this.add(drawSquareButton);
		this.add(drawTriangleButton);
		this.add(drawPolygonButton);
		this.add(Exit);
		
		JPanel shapePanel_1 = new JPanel();
		baseLayout.putConstraint(SpringLayout.NORTH, shapePanel_1, 6, SpringLayout.SOUTH, Exit);
		baseLayout.putConstraint(SpringLayout.WEST, shapePanel_1, 6, SpringLayout.EAST, drawTriangleButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, shapePanel_1, -14, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, shapePanel_1, 10, SpringLayout.EAST, this);
		add(shapePanel_1);
		Title = new JLabel("JavaDraw");
		add(Title);
		Title.setFont(new Font("Xingkai SC", Font.BOLD | Font.ITALIC, 66));
		JLabel Info = new JLabel("Adjust window size to see shape Panel!");
		baseLayout.putConstraint(SpringLayout.NORTH, Info, 0, SpringLayout.NORTH, shapePanel_1);
		baseLayout.putConstraint(SpringLayout.EAST, Info, 0, SpringLayout.EAST, Title);
		Info.setFont(new Font("Zapf Dingbats", Font.BOLD, 13));
		add(Info);
	}
	
	
	



	private void add(ShapePanel shapePanel2) {
		// TODO Auto-generated method stub
		
	}



	/**
	 * Sets up layout.
	 */
	
	
	private void setUpLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, drawRectangleButton, -12, SpringLayout.WEST, drawCircleButton);
		baseLayout.putConstraint(SpringLayout.WEST, drawEllipseButton, -2, SpringLayout.WEST, drawCircleButton);
		baseLayout.putConstraint(SpringLayout.WEST, drawCircleButton, 58, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, Title, 99, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, drawSquareButton, 4, SpringLayout.WEST, drawPolygonButton);
		baseLayout.putConstraint(SpringLayout.WEST, drawTriangleButton, 0, SpringLayout.WEST, drawPolygonButton);
		baseLayout.putConstraint(SpringLayout.NORTH, drawPolygonButton, 0, SpringLayout.NORTH, drawRectangleButton);
		baseLayout.putConstraint(SpringLayout.WEST, drawPolygonButton, 24, SpringLayout.EAST, drawRectangleButton);
		baseLayout.putConstraint(SpringLayout.NORTH, drawTriangleButton, 0, SpringLayout.NORTH, drawEllipseButton);
		baseLayout.putConstraint(SpringLayout.NORTH, drawSquareButton, 0, SpringLayout.NORTH, drawCircleButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, Title, -24, SpringLayout.NORTH, drawCircleButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, drawCircleButton, 0, SpringLayout.NORTH, drawEllipseButton);
		baseLayout.putConstraint(SpringLayout.NORTH, drawEllipseButton, 195, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, drawRectangleButton, 1, SpringLayout.SOUTH, drawEllipseButton);
		baseLayout.putConstraint(SpringLayout.NORTH, Exit, 0, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, Exit, -48, SpringLayout.EAST, this);
	}
	
	/**
	 * Sets up listeners.
	 */
	
	
	private void setUpListeners()
	{
		
		
		
		Exit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				System.exit(0);
			}
		});
		
		
		drawRectangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addRectangle();
			}
		});
		
		
	}
	
}
