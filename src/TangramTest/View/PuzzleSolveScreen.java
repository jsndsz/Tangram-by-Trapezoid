package TangramTest.View;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import TangramTest.Controller.Back;
import TangramTest.Controller.CLayout;
import TangramTest.Controller.Reset;
import TangramTest.Model.CatalogData;
import TangramTest.Model.PuzzleSet;
import TangramTest.Model.ShapeSet;

@SuppressWarnings("serial")
public class PuzzleSolveScreen extends JFrame {

	public int chosenPuzzle;
	private JPanel contentPane;
	private Polygon dragShape;
	private Point lastLocation;
	public ArrayList<Polygon> shapes = new ArrayList<Polygon>();
	ShapeSet shapeSetObj;
	PuzzleSet puzzleShape;
	public static int chosenShapeSetNumber;
	public static int chosenPuzzleSetNumber;

	JPanel shapePanel;
	CatalogData dataSet = new CatalogData();

	public void setPuzzleConf(int shp, int puz) {
		chosenShapeSetNumber = shp;
		chosenPuzzleSetNumber = puz;
	}

	public void setChosenPuzzle(int puzzleNumber) {
		chosenPuzzle = puzzleNumber;
	}

	public int getChosenPuzzle() {
		return chosenPuzzle;
	}

	@SuppressWarnings("serial")
	public JPanel drawPuzzleSolveScreen() {
		shapeSetObj = new ShapeSet(chosenShapeSetNumber);
		puzzleShape = new PuzzleSet(chosenPuzzleSetNumber);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 2000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 42, 233, 45);
		contentPane.add(panel_3);
		panel_3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnBack = new JButton("EXIT Puzzle");
		panel_3.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Back bk = new Back();
				if (chosenPuzzleSetNumber == 1) {
					bk.getBack(3);
				} else if (chosenPuzzleSetNumber == 2) {
					bk.getBack(5);
				}
			}
		});

		JButton btnShapeSet = new JButton("Shape Set");
		panel_3.add(btnShapeSet);
		btnShapeSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Back bk = new Back();
				bk.getBack(2);
			}
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(972, 42, 194, 45);
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnReset = new JButton("Reset");
		panel_1.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				Reset rs = new Reset(chosenPuzzle);
				rs.resetPuzzle();
			}
		});

		JButton btnExit = new JButton("Quit");
		panel_1.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CLayout cl = new CLayout();
				cl.exitApplication();
			}
		});

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);

		JPanel panel_4 = new JPanel();
		panel_4.setBounds(350, 650, 729, 64);
		contentPane.add(panel_4);
		panel_4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton btnRotateLeft = new JButton("Rotate Left");
		panel_4.add(btnRotateLeft);

		JButton btnUndo = new JButton("Undo");
		panel_4.add(btnUndo);

		JButton btnRedo = new JButton("Redo");
		panel_4.add(btnRedo);

		JButton btnRotateRight = new JButton("Rotate Right");
		panel_4.add(btnRotateRight);

		shapePanel = new JPanel() {
			protected void paintComponent(Graphics g) {

				Color[] colors = { Color.GRAY, Color.RED, Color.BLUE, Color.PINK, Color.CYAN, Color.MAGENTA,
						Color.GREEN, Color.GRAY, Color.RED, Color.BLUE, Color.PINK, Color.CYAN, Color.MAGENTA };

				super.paintComponent(g);
				Polygon chosenPuzzleShape = (Polygon) puzzleShape.getPuzzleSet().get(chosenPuzzle);
				g.setColor(Color.BLACK);
				g.drawPolygon(chosenPuzzleShape);
				g.fillPolygon(chosenPuzzleShape);
				for (int i = 0; i < shapeSetObj.getShapeSet().size(); i++) {
					Polygon shape = (Polygon) shapeSetObj.getShapeSet().get(i);
					g.setColor(colors[i]);
					g.drawPolygon(shape);
					g.fillPolygon(shape);
					shapes.add(shape);
				}
				g.setColor(Color.GRAY);
				Line2D lin = new Line2D.Float(dataSet.lineX, dataSet.lineMinY, dataSet.lineX, dataSet.lineMaxY);
				Graphics2D g2 = (Graphics2D) g;
				g2.setStroke(
						new BasicStroke(5, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 5, 2 }, 0));
				g2.draw(lin);
			}

		};

		shapePanel.setBounds(0, 0, 1000, 2000);
		contentPane.add(shapePanel);
		return contentPane;
	}

	public List<Polygon> getShapes() {
		return shapes;
	}

}