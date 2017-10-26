package TangramTest.View;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import TangramTest.Controller.Back;
import TangramTest.Controller.CLayout;

@SuppressWarnings("serial")
public class PuzzleSetScreen2 extends JFrame {
	
	private JPanel contentPane;
	
	public JPanel drawPuzzleSetScreen2()
	{
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{42, 108, 127, 71, 134, 75, 144, 87, 143, 78, 149, 71, 0};
		gbl_contentPane.rowHeights = new int[]{60, 141, 27, 17, 122, 34, 36, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Back bk = new Back();
				bk.getBack(2);
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.weighty = 0.5;
		gbc_btnNewButton.weightx = 0.5;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 0;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_ss11.png")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.weighty = 0.5;
		gbc_lblNewLabel.weightx = 0.5;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblSwan = new JLabel("");
		lblSwan.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_ss12.png")));
		lblSwan.setDisabledIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_swan.png")));
		GridBagConstraints gbc_lblSwan = new GridBagConstraints();
		gbc_lblSwan.weighty = 0.5;
		gbc_lblSwan.weightx = 0.5;
		gbc_lblSwan.insets = new Insets(0, 0, 5, 5);
		gbc_lblSwan.gridx = 4;
		gbc_lblSwan.gridy = 1;
		contentPane.add(lblSwan, gbc_lblSwan);
		
		JLabel lblMonOnHorse = new JLabel("");
		lblMonOnHorse.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_ss13.png")));
		GridBagConstraints gbc_lblMonOnHorse = new GridBagConstraints();
		gbc_lblMonOnHorse.weighty = 0.5;
		gbc_lblMonOnHorse.weightx = 0.5;
		gbc_lblMonOnHorse.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonOnHorse.gridx = 6;
		gbc_lblMonOnHorse.gridy = 1;
		contentPane.add(lblMonOnHorse, gbc_lblMonOnHorse);
		
		JLabel lblCamel = new JLabel("");
		lblCamel.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_ss14.png")));
		GridBagConstraints gbc_lblCamel = new GridBagConstraints();
		gbc_lblCamel.weighty = 0.5;
		gbc_lblCamel.weightx = 0.5;
		gbc_lblCamel.insets = new Insets(0, 0, 5, 5);
		gbc_lblCamel.gridx = 8;
		gbc_lblCamel.gridy = 1;
		contentPane.add(lblCamel, gbc_lblCamel);
		
		JLabel lblBoat_1 = new JLabel("");
		lblBoat_1.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_ss15.png")));
		GridBagConstraints gbc_lblBoat_1 = new GridBagConstraints();
		gbc_lblBoat_1.weighty = 0.5;
		gbc_lblBoat_1.weightx = 0.5;
		gbc_lblBoat_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblBoat_1.gridx = 10;
		gbc_lblBoat_1.gridy = 1;
		contentPane.add(lblBoat_1, gbc_lblBoat_1);
		
		JButton btnPuzzle1 = new JButton("Puzzle1");
		btnPuzzle1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//
				CLayout cl = new CLayout();
				cl.showView4(0);
			}
		});
		GridBagConstraints gbc_btnPuzzle1 = new GridBagConstraints();
		gbc_btnPuzzle1.weighty = 0.5;
		gbc_btnPuzzle1.weightx = 0.5;
		gbc_btnPuzzle1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPuzzle1.insets = new Insets(0, 0, 5, 5);
		gbc_btnPuzzle1.gridx = 2;
		gbc_btnPuzzle1.gridy = 2;
		contentPane.add(btnPuzzle1, gbc_btnPuzzle1);
		
		JButton btnPuzzle3 = new JButton("Puzzle3");
		btnPuzzle3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//
				CLayout cl = new CLayout();
				cl.showView4(2);
			}
		});
		
		JButton btnPuzzle2 = new JButton("Puzzle2");
		btnPuzzle2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//
				CLayout cl = new CLayout();
				cl.showView4(1);
			}
		});
		GridBagConstraints gbc_btnPuzzle2 = new GridBagConstraints();
		gbc_btnPuzzle2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPuzzle2.weighty = 0.5;
		gbc_btnPuzzle2.weightx = 0.5;
		gbc_btnPuzzle2.insets = new Insets(0, 0, 5, 5);
		gbc_btnPuzzle2.gridx = 4;
		gbc_btnPuzzle2.gridy = 2;
		contentPane.add(btnPuzzle2, gbc_btnPuzzle2);
		GridBagConstraints gbc_btnPuzzle3 = new GridBagConstraints();
		gbc_btnPuzzle3.weighty = 0.5;
		gbc_btnPuzzle3.weightx = 0.5;
		gbc_btnPuzzle3.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPuzzle3.insets = new Insets(0, 0, 5, 5);
		gbc_btnPuzzle3.gridx = 6;
		gbc_btnPuzzle3.gridy = 2;
		contentPane.add(btnPuzzle3, gbc_btnPuzzle3);
		
		JButton btnPuzzle4 = new JButton("Puzzle4");
		btnPuzzle4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//
				CLayout cl = new CLayout();
				cl.showView4(3);
				}
		});
		GridBagConstraints gbc_btnPuzzle4 = new GridBagConstraints();
		gbc_btnPuzzle4.weighty = 0.5;
		gbc_btnPuzzle4.weightx = 0.5;
		gbc_btnPuzzle4.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPuzzle4.insets = new Insets(0, 0, 5, 5);
		gbc_btnPuzzle4.gridx = 8;
		gbc_btnPuzzle4.gridy = 2;
		contentPane.add(btnPuzzle4, gbc_btnPuzzle4);
		
		JButton btnPuzzle5 = new JButton("Puzzle5");
		btnPuzzle5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				CLayout cl = new CLayout();
				cl.showView4(4);
			}
		});
		GridBagConstraints gbc_btnPuzzle5 = new GridBagConstraints();
		gbc_btnPuzzle5.weighty = 0.5;
		gbc_btnPuzzle5.weightx = 0.5;
		gbc_btnPuzzle5.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPuzzle5.insets = new Insets(0, 0, 5, 5);
		gbc_btnPuzzle5.gridx = 10;
		gbc_btnPuzzle5.gridy = 2;
		contentPane.add(btnPuzzle5, gbc_btnPuzzle5);
		
		JLabel lblSquare = new JLabel("");
		lblSquare.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_ss16.png")));
		GridBagConstraints gbc_lblSquare = new GridBagConstraints();
		gbc_lblSquare.weighty = 0.5;
		gbc_lblSquare.weightx = 0.5;
		gbc_lblSquare.insets = new Insets(0, 0, 5, 5);
		gbc_lblSquare.gridx = 2;
		gbc_lblSquare.gridy = 4;
		contentPane.add(lblSquare, gbc_lblSquare);
		
		JLabel lblShark = new JLabel("");
		lblShark.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_ss17.png")));
		GridBagConstraints gbc_lblShark = new GridBagConstraints();
		gbc_lblShark.weighty = 0.5;
		gbc_lblShark.weightx = 0.5;
		gbc_lblShark.insets = new Insets(0, 0, 5, 5);
		gbc_lblShark.gridx = 4;
		gbc_lblShark.gridy = 4;
		contentPane.add(lblShark, gbc_lblShark);
		
		JLabel lblHouse = new JLabel("");
		lblHouse.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_ss18.jpg")));
		GridBagConstraints gbc_lblHouse = new GridBagConstraints();
		gbc_lblHouse.weighty = 0.5;
		gbc_lblHouse.weightx = 0.5;
		gbc_lblHouse.insets = new Insets(0, 0, 5, 5);
		gbc_lblHouse.gridx = 6;
		gbc_lblHouse.gridy = 4;
		contentPane.add(lblHouse, gbc_lblHouse);
		
		JLabel lblCat = new JLabel("");
		lblCat.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_ss19.png")));
		GridBagConstraints gbc_lblCat = new GridBagConstraints();
		gbc_lblCat.weighty = 0.5;
		gbc_lblCat.weightx = 0.5;
		gbc_lblCat.insets = new Insets(0, 0, 5, 5);
		gbc_lblCat.gridx = 8;
		gbc_lblCat.gridy = 4;
		contentPane.add(lblCat, gbc_lblCat);
		
		JLabel lblBoat = new JLabel("");
		lblBoat.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_ss20.jpg")));
		GridBagConstraints gbc_lblBoat = new GridBagConstraints();
		gbc_lblBoat.weighty = 0.5;
		gbc_lblBoat.weightx = 0.5;
		gbc_lblBoat.insets = new Insets(0, 0, 5, 5);
		gbc_lblBoat.gridx = 10;
		gbc_lblBoat.gridy = 4;
		contentPane.add(lblBoat, gbc_lblBoat);
		
		JButton btnPuzzle6 = new JButton("Puzzle6");
		btnPuzzle6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				CLayout cl = new CLayout();
				cl.showView4(5);
			}
		});
		GridBagConstraints gbc_btnPuzzle6 = new GridBagConstraints();
		gbc_btnPuzzle6.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPuzzle6.weighty = 0.5;
		gbc_btnPuzzle6.weightx = 0.5;
		gbc_btnPuzzle6.insets = new Insets(0, 0, 5, 5);
		gbc_btnPuzzle6.gridx = 2;
		gbc_btnPuzzle6.gridy = 5;
		contentPane.add(btnPuzzle6, gbc_btnPuzzle6);
		
		JButton btnPuzzle7 = new JButton("Puzzle7");
		btnPuzzle7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				CLayout cl = new CLayout();
				cl.showView4(6);
			}
		});
		GridBagConstraints gbc_btnPuzzle7 = new GridBagConstraints();
		gbc_btnPuzzle7.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPuzzle7.weighty = 0.5;
		gbc_btnPuzzle7.weightx = 0.5;
		gbc_btnPuzzle7.insets = new Insets(0, 0, 5, 5);
		gbc_btnPuzzle7.gridx = 4;
		gbc_btnPuzzle7.gridy = 5;
		contentPane.add(btnPuzzle7, gbc_btnPuzzle7);
		
		JButton btnPuzzle8 = new JButton("Puzzle8");
		btnPuzzle8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				CLayout cl = new CLayout();
				cl.showView4(7);
			}
		});
		GridBagConstraints gbc_btnPuzzle8 = new GridBagConstraints();
		gbc_btnPuzzle8.weighty = 0.5;
		gbc_btnPuzzle8.weightx = 0.5;
		gbc_btnPuzzle8.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPuzzle8.insets = new Insets(0, 0, 5, 5);
		gbc_btnPuzzle8.gridx = 6;
		gbc_btnPuzzle8.gridy = 5;
		contentPane.add(btnPuzzle8, gbc_btnPuzzle8);
		
		JButton btnPuzzle9 = new JButton("Puzzle9");
		btnPuzzle9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				CLayout cl = new CLayout();
				cl.showView4(8);
			}
		});
		GridBagConstraints gbc_btnPuzzle9 = new GridBagConstraints();
		gbc_btnPuzzle9.weighty = 0.5;
		gbc_btnPuzzle9.weightx = 0.5;
		gbc_btnPuzzle9.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPuzzle9.insets = new Insets(0, 0, 5, 5);
		gbc_btnPuzzle9.gridx = 8;
		gbc_btnPuzzle9.gridy = 5;
		contentPane.add(btnPuzzle9, gbc_btnPuzzle9);
		
		JButton btnPuzzle10 = new JButton("Puzzle10");
		btnPuzzle10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				CLayout cl = new CLayout();
				cl.showView4(9);
			}
		});
		GridBagConstraints gbc_btnPuzzle10 = new GridBagConstraints();
		gbc_btnPuzzle10.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPuzzle10.weighty = 0.5;
		gbc_btnPuzzle10.weightx = 0.5;
		gbc_btnPuzzle10.insets = new Insets(0, 0, 5, 5);
		gbc_btnPuzzle10.gridx = 10;
		gbc_btnPuzzle10.gridy = 5;
		contentPane.add(btnPuzzle10, gbc_btnPuzzle10);
		return contentPane;
	}

}
