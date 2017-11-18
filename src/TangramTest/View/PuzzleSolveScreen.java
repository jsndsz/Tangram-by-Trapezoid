package TangramPuzzle.View;

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
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import TangramPuzzle.Controller.Back;
import TangramPuzzle.Controller.CLayout;
import TangramPuzzle.Controller.Flip;
import TangramPuzzle.Controller.Redo;
import TangramPuzzle.Controller.Reset;
import TangramPuzzle.Controller.Rotate;
import TangramPuzzle.Controller.SerializingPolygons;
import TangramPuzzle.Controller.Undo;
import TangramPuzzle.Controller.WriteOutObject;
import TangramPuzzle.Model.CatalogData;
import TangramPuzzle.Model.PuzzleSet;
import TangramPuzzle.Model.ShapeSet;
import TangramPuzzle.Model.ShapeState;

/**
 * This GUI provides the user with a screen to solve the puzzles using the
 * Tangram shapes. Provides the silhouette , palette of shapes , and various
 * button for operations on shapes.
 * 
 * @author sinamdar
 *
 */

@SuppressWarnings("serial")
public class PuzzleSolveScreen extends JFrame {

	public static int chosenPuzzle;
	JPanel contentPane;
	private Polygon dragShape;
	private Point lastLocation;
	public ArrayList<Polygon> shapes = new ArrayList<Polygon>();

	public static Map<Polygon, Integer> mapShapes = new HashMap<Polygon, Integer>();
	ShapeState shapestate = new ShapeState();

	ShapeSet shapeSetObj;
	PuzzleSet puzzleShape;
	public static int chosenShapeSetNumber;
	Rotate rotate = new Rotate();
	Flip flip = new Flip();
	Undo undo = new Undo();
	List<Polygon> finalShapes = new ArrayList<Polygon>();

	JPanel shapePanel;
	CatalogData dataSet = new CatalogData();

	/**
	 * Sets the chosenShapeNumber
	 * 
	 * @param shp: 
	 *            chosen shape number
	 */
	public void setPuzzleConf(int shp) {
		chosenShapeSetNumber = shp;
	}

	/**
	 * sets the chosen puzzleNumber
	 * 
	 * @param puzzleNumber
	 *            number of puzzle set
	 */
	public void setChosenPuzzle(int puzzleNumber) {
		chosenPuzzle = puzzleNumber;
	}

	/**
	 * returns the chosen Puzzle number
	 * 
	 * @return chosen puzzzle number
	 */
	public int getChosenPuzzle() {
		return chosenPuzzle;
	}

	/**
	 * This method checks if the chosen puzzle was already completed, if yes then
	 * read the object and draw the shapes stored in that object
	 */
	public void setMyPolygonState() {
		shapeSetObj = new ShapeSet(chosenShapeSetNumber);
		puzzleShape = new PuzzleSet(chosenShapeSetNumber);

		CatalogData cd = new CatalogData();
		String filePathString = "";
		WriteOutObject wo = new WriteOutObject();
		if (chosenShapeSetNumber == 1) {

			filePathString = cd.ShapeSet1Files[chosenPuzzle];
		} else if (chosenShapeSetNumber == 2) {
			filePathString = cd.ShapeSet2Files[chosenPuzzle];
		}

		Map temp = null;
		WriteOutObject k;
		/**
		 * checks if a serialized file for the chosen puzzle exists
		 */
		File f = new File(filePathString);

		if (f.exists() && !f.isDirectory()) {
			try {

				FileInputStream fileStream = new FileInputStream(filePathString);
				ObjectInputStream in = new ObjectInputStream(fileStream);
				k = (WriteOutObject) in.readObject();
				in.close();
				fileStream.close();

				temp = (Map) k.serializedPolygons;
				k.setSerializedPolygon(k);

				List<Polygon> as = new ArrayList<Polygon>(temp.keySet());
				finalShapes = as;
				Iterator it = temp.entrySet().iterator();
				while (it.hasNext()) {
					Map.Entry pair = (Map.Entry) it.next();
					it.remove();
				}

			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		}
		/**
		 * if no serialized file is present for the chosen shapes from the original
		 * shape set are drawn
		 */
		else {
			finalShapes = (ArrayList<Polygon>) shapeSetObj.getShapeSet();
		}

	}

	public void setResetstate() {
		finalShapes = new ArrayList<Polygon>();
		finalShapes = (ArrayList<Polygon>) shapeSetObj.getShapeSet();
	}

	@SuppressWarnings("serial")
	public JPanel drawPuzzleSolveScreen() {

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

		/**
		 * User can exit the puzzle by hitting this button. User is taken back to the
		 * Puzzle selection screen.
		 */
		JButton btnBack = new JButton("EXIT Puzzle");
		panel_3.add(btnBack);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShapeState ss = new ShapeState();
				ss.clearSerializeShape();
				ss.clearShapeState();
				Back bk = new Back();
				if (chosenShapeSetNumber == 1) {
					bk.getBack(3);
				} else if (chosenShapeSetNumber == 2) {
					bk.getBack(5);
				}

			}
		});

		/**
		 * User is taken to the shape set selection screen on hitting the Shape Set
		 * button.
		 */
		JButton btnShapeSet = new JButton("Shape Set");
		panel_3.add(btnShapeSet);
		btnShapeSet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShapeState ss = new ShapeState();
				ss.clearSerializeShape();
				ss.clearShapeState();
				Back bk = new Back();
				bk.getBack(2);
			}
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(972, 42, 194, 45);
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		/**
		 * User can reset the solution and the shapes are moved back to the palette.
		 */
		JButton btnReset = new JButton("Reset");
		panel_1.add(btnReset);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setResetstate();
				Reset rs = new Reset(chosenPuzzle);
				contentPane.removeAll();
				rs.resetPuzzle();

			}
		});

		/**
		 * User can exit the application on hitting the Quit button.
		 */
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

		/**
		 * User can rotate a selected shape towards left
		 */
		JButton btnRotateLeft = new JButton("Rotate Left");
		panel_4.add(btnRotateLeft);
		btnRotateLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rotate.rotateLeft();
			}
		});

		/**
		 * User can undo his last move
		 */
		JButton btnUndo = new JButton("Undo");
		panel_4.add(btnUndo);
		btnUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				undo.actionUndone();
			}
		});

		/**
		 * User can redo his last undone action
		 */
		JButton btnRedo = new JButton("Redo");
		panel_4.add(btnRedo);
		btnRedo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Redo.actionRedone();
			}
		});

		/**
		 * User can rotate a selected shape towards right
		 */
		JButton btnRotateRight = new JButton("Rotate Right");
		panel_4.add(btnRotateRight);
		btnRotateRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rotate.rotateRight();
			}
		});

		JPanel panel_5 = new JPanel();
		panel_5.setBounds(1000, 250, 100, 400);
		contentPane.add(panel_5);
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		/**
		 * User can perform a right flip of selected shape.
		 */
		JButton btnFlipR = new JButton("Flip right");
		panel_5.add(btnFlipR);
		btnFlipR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flip.flipRight();

			}
		});

		/**
		 * User can perform left flip of selected shape.
		 */
		JButton btnFlipL = new JButton("Flip left");
		panel_5.add(btnFlipL);
		btnFlipL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flip.flipLeft();
			}
		});

		/**
		 * User can perfom Flip up of a selected shape.
		 */
		JButton btnFlipH = new JButton("Flip Up");
		panel_5.add(btnFlipH);
		btnFlipH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flip.flipUp();
			}
		});

		/**
		 * User can perform Flip down of a selected shape.
		 */
		JButton btnFlipV = new JButton("Flip Down");
		panel_5.add(btnFlipV);
		btnFlipV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flip.flipDown();
			}
		});

		setMyPolygonState();
		shapePanel = new JPanel() {
			protected void paintComponent(Graphics g) {

				Color[] colors = { Color.GRAY, Color.RED, Color.ORANGE, Color.PINK, Color.CYAN, Color.MAGENTA,
						Color.GREEN, Color.GRAY, Color.RED, Color.BLUE, Color.PINK, Color.CYAN, Color.MAGENTA };

				super.paintComponent(g);
				Polygon chosenPuzzleShape = (Polygon) puzzleShape.getPuzzleSet().get(chosenPuzzle);
				g.setColor(Color.BLACK);
				g.drawPolygon(chosenPuzzleShape);
				g.fillPolygon(chosenPuzzleShape);
				try {
					for (int i = 0; i < shapeSetObj.getShapeSet().size(); i++) {
						Polygon shape = (Polygon) finalShapes.get(i);
						g.setColor(colors[i]);
						g.drawPolygon(shape);
						g.fillPolygon(shape);
						shapestate.setShapeState(shape);
					}
					g.setColor(Color.GRAY);
					Line2D lin = new Line2D.Float(dataSet.lineX, dataSet.lineMinY, dataSet.lineX, dataSet.lineMaxY);
					Graphics2D g2 = (Graphics2D) g;
					g2.setStroke(new BasicStroke(5, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0,
							new float[] { 5, 2 }, 0));
					g2.draw(lin);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		};

		shapePanel.setBounds(0, 0, 1000, 2000);
		contentPane.add(shapePanel);
		return contentPane;

	}

}