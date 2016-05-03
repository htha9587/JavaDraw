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
	private GraphPanel graphPanel;
	private JLabel Title;
	private JButton drawCircleButton;
	private JButton drawEllipseButton;
	private JButton drawRectangleButton;
	private JButton drawSquareButton;
	private JButton drawTriangleButton;
	private JButton drawPolygonButton;
	private JButton Exit;
	private JButton Clear;
	private SpringLayout baseLayout;
	private ArrayList<Rectangle> rectangleList;
	
	
	
	public DrawingPanel(DrawController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		drawRectangleButton = new JButton("Draw Rectangle");
		Exit = new JButton("Exit");
		baseLayout.putConstraint(SpringLayout.EAST, Exit, -100, SpringLayout.EAST, this);
		Clear = new JButton("Redraw!");
		baseLayout.putConstraint(SpringLayout.NORTH, Exit, 0, SpringLayout.NORTH, Clear);
		baseLayout.putConstraint(SpringLayout.NORTH, Clear, 0, SpringLayout.NORTH, this);
		drawEllipseButton = new JButton("Draw Ellipse");
		drawCircleButton = new JButton("Draw Circle");
		baseLayout.putConstraint(SpringLayout.EAST, Clear, 0, SpringLayout.EAST, drawCircleButton);
		drawSquareButton = new JButton("Draw Square");
		drawTriangleButton = new JButton("Draw Triangle");
		drawPolygonButton = new JButton("Draw Polygon");
		rectangleList = new ArrayList<Rectangle>();
		shapePanel = new ShapePanel();
		graphPanel = new GraphPanel();
		baseLayout.putConstraint(SpringLayout.NORTH, graphPanel, 6, SpringLayout.SOUTH, drawRectangleButton);
		baseLayout.putConstraint(SpringLayout.WEST, graphPanel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, graphPanel, 0, SpringLayout.SOUTH, shapePanel);
		baseLayout.putConstraint(SpringLayout.EAST, graphPanel, -6, SpringLayout.WEST, shapePanel);
	
		
	
		
		
		
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
		this.add(Clear);
		this.add(graphPanel);
		
//		JPanel shapePanel_1 = new JPanel();//This was the problem it all referred to shapePanel_1 not the shapePanel
		
		
		Title = new JLabel("JavaDraw");
		baseLayout.putConstraint(SpringLayout.WEST, Title, 0, SpringLayout.WEST, Clear);
		add(Title);
		Title.setFont(new Font("Xingkai SC", Font.BOLD | Font.ITALIC, 66));
		JLabel Info = new JLabel("Maximize to see Shape Panel and Graph!");
		baseLayout.putConstraint(SpringLayout.NORTH, Info, 0, SpringLayout.SOUTH, Clear);
		baseLayout.putConstraint(SpringLayout.NORTH, Title, 10, SpringLayout.SOUTH, Info);
		baseLayout.putConstraint(SpringLayout.WEST, Info, 71, SpringLayout.WEST, this);
		Info.setFont(new Font("Zapf Dingbats", Font.BOLD, 13));
		add(Info);
	}


	/**
	 * Sets up layout.
	 */
	
	
	private void setUpLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, drawRectangleButton, -12, SpringLayout.WEST, drawCircleButton);
		baseLayout.putConstraint(SpringLayout.WEST, drawEllipseButton, -2, SpringLayout.WEST, drawCircleButton);
		baseLayout.putConstraint(SpringLayout.WEST, drawCircleButton, 58, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, drawSquareButton, 4, SpringLayout.WEST, drawPolygonButton);
		baseLayout.putConstraint(SpringLayout.WEST, drawTriangleButton, 0, SpringLayout.WEST, drawPolygonButton);
		baseLayout.putConstraint(SpringLayout.NORTH, drawPolygonButton, 0, SpringLayout.NORTH, drawRectangleButton);
		baseLayout.putConstraint(SpringLayout.WEST, drawPolygonButton, 24, SpringLayout.EAST, drawRectangleButton);
		baseLayout.putConstraint(SpringLayout.NORTH, drawTriangleButton, 0, SpringLayout.NORTH, drawEllipseButton);
		baseLayout.putConstraint(SpringLayout.NORTH, drawSquareButton, 0, SpringLayout.NORTH, drawCircleButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, drawCircleButton, 0, SpringLayout.NORTH, drawEllipseButton);
		baseLayout.putConstraint(SpringLayout.NORTH, drawEllipseButton, 195, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, drawRectangleButton, 1, SpringLayout.SOUTH, drawEllipseButton);
		baseLayout.putConstraint(SpringLayout.NORTH, shapePanel, 39, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, shapePanel, 50, SpringLayout.EAST, drawTriangleButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, shapePanel, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, shapePanel, -10, SpringLayout.EAST, this);
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
				repaint();
			}
		});
		
		drawSquareButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addSquare();
				repaint();
			}
		});
		
		drawTriangleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addTriangle();
				repaint();
			}
		});
		
		drawPolygonButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addPolygon();
				repaint();
			}
		});
		
		drawCircleButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addCircle();
				repaint();
			}
		});
		
		drawEllipseButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.addEllipse();
				repaint();
			}
		});
		
		Clear.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				shapePanel.Clear();
				repaint();
			}
		});
		
		
	}
	
}
