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
import javax.swing.border.EmptyBorder;

import TangramTest.Controller.Back;
import TangramTest.Controller.CLayout;

@SuppressWarnings("serial")
public class PuzzleSetScreen extends JFrame {

	private JPanel contentPane;


	public JPanel drawPuzzleSetScreen() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 42, 108, 127, 71, 134, 75, 144, 87, 143, 78, 149, 71, 0 };
		gbl_contentPane.rowHeights = new int[] { 60, 131, 39, 19, 126, 42, 35, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
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
		lblNewLabel.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_bear.png")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.weighty = 0.5;
		gbc_lblNewLabel.weightx = 0.5;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblSwan = new JLabel("");
		lblSwan.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_swan.png")));
		lblSwan.setDisabledIcon(
				new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_swan.png")));
		GridBagConstraints gbc_lblSwan = new GridBagConstraints();
		gbc_lblSwan.weighty = 0.5;
		gbc_lblSwan.weightx = 0.5;
		gbc_lblSwan.insets = new Insets(0, 0, 5, 5);
		gbc_lblSwan.gridx = 4;
		gbc_lblSwan.gridy = 1;
		contentPane.add(lblSwan, gbc_lblSwan);

		JLabel lblMonOnHorse = new JLabel("");
		lblMonOnHorse
				.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_manonhorse.png")));
		GridBagConstraints gbc_lblMonOnHorse = new GridBagConstraints();
		gbc_lblMonOnHorse.weighty = 0.5;
		gbc_lblMonOnHorse.weightx = 0.5;
		gbc_lblMonOnHorse.insets = new Insets(0, 0, 5, 5);
		gbc_lblMonOnHorse.gridx = 6;
		gbc_lblMonOnHorse.gridy = 1;
		contentPane.add(lblMonOnHorse, gbc_lblMonOnHorse);

		JLabel lblCamel = new JLabel("");
		lblCamel.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_camel.png")));
		GridBagConstraints gbc_lblCamel = new GridBagConstraints();
		gbc_lblCamel.weighty = 0.5;
		gbc_lblCamel.weightx = 0.5;
		gbc_lblCamel.insets = new Insets(0, 0, 5, 5);
		gbc_lblCamel.gridx = 8;
		gbc_lblCamel.gridy = 1;
		contentPane.add(lblCamel, gbc_lblCamel);

		JLabel lblBoat_1 = new JLabel("");
		lblBoat_1.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_yacht.png")));
		GridBagConstraints gbc_lblBoat_1 = new GridBagConstraints();
		gbc_lblBoat_1.weighty = 0.5;
		gbc_lblBoat_1.weightx = 0.5;
		gbc_lblBoat_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblBoat_1.gridx = 10;
		gbc_lblBoat_1.gridy = 1;
		contentPane.add(lblBoat_1, gbc_lblBoat_1);

		JButton btnBear = new JButton("Bear");
		GridBagConstraints gbc_btnBear = new GridBagConstraints();
		gbc_btnBear.weighty = 0.5;
		gbc_btnBear.weightx = 0.5;
		gbc_btnBear.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBear.insets = new Insets(0, 0, 5, 5);
		gbc_btnBear.gridx = 2;
		gbc_btnBear.gridy = 2;
		contentPane.add(btnBear, gbc_btnBear);

		btnBear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CLayout cl = new CLayout();
				cl.showView4(9);
			}
		});

		JButton btnHorse = new JButton("Horse");
		btnHorse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CLayout cl = new CLayout();
				cl.showView4(8);
			}
		});

		JButton btnSwan = new JButton("Swan");
		GridBagConstraints gbc_btnSwan = new GridBagConstraints();
		gbc_btnSwan.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSwan.weighty = 0.5;
		gbc_btnSwan.weightx = 0.5;
		gbc_btnSwan.insets = new Insets(0, 0, 5, 5);
		gbc_btnSwan.gridx = 4;
		gbc_btnSwan.gridy = 2;
		contentPane.add(btnSwan, gbc_btnSwan);

		btnSwan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CLayout cl = new CLayout();
				cl.showView4(3);
			}
		});

		GridBagConstraints gbc_btnHorse = new GridBagConstraints();
		gbc_btnHorse.weighty = 0.5;
		gbc_btnHorse.weightx = 0.5;
		gbc_btnHorse.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnHorse.insets = new Insets(0, 0, 5, 5);
		gbc_btnHorse.gridx = 6;
		gbc_btnHorse.gridy = 2;
		contentPane.add(btnHorse, gbc_btnHorse);

		JButton btnCamel = new JButton("Camel");
		GridBagConstraints gbc_btnCamel = new GridBagConstraints();
		gbc_btnCamel.weighty = 0.5;
		gbc_btnCamel.weightx = 0.5;
		gbc_btnCamel.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCamel.insets = new Insets(0, 0, 5, 5);
		gbc_btnCamel.gridx = 8;
		gbc_btnCamel.gridy = 2;
		contentPane.add(btnCamel, gbc_btnCamel);
		btnCamel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CLayout cl = new CLayout();
				cl.showView4(7);
			}
		});

		JButton btnBoat = new JButton("Boat");
		GridBagConstraints gbc_btnBoat = new GridBagConstraints();
		gbc_btnBoat.weighty = 0.5;
		gbc_btnBoat.weightx = 0.5;
		gbc_btnBoat.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnBoat.insets = new Insets(0, 0, 5, 5);
		gbc_btnBoat.gridx = 10;
		gbc_btnBoat.gridy = 2;
		contentPane.add(btnBoat, gbc_btnBoat);
		btnBoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CLayout cl = new CLayout();
				cl.showView4(4);

			}
		});

		JLabel lblSquare = new JLabel("");
		lblSquare.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_square.png")));
		GridBagConstraints gbc_lblSquare = new GridBagConstraints();
		gbc_lblSquare.weighty = 0.5;
		gbc_lblSquare.weightx = 0.5;
		gbc_lblSquare.insets = new Insets(0, 0, 5, 5);
		gbc_lblSquare.gridx = 2;
		gbc_lblSquare.gridy = 4;
		contentPane.add(lblSquare, gbc_lblSquare);

		JLabel lblShark = new JLabel("");
		lblShark.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_shark.png")));
		GridBagConstraints gbc_lblShark = new GridBagConstraints();
		gbc_lblShark.weighty = 0.5;
		gbc_lblShark.weightx = 0.5;
		gbc_lblShark.insets = new Insets(0, 0, 5, 5);
		gbc_lblShark.gridx = 4;
		gbc_lblShark.gridy = 4;
		contentPane.add(lblShark, gbc_lblShark);

		JLabel lblHouse = new JLabel("");
		lblHouse.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_house.png")));
		GridBagConstraints gbc_lblHouse = new GridBagConstraints();
		gbc_lblHouse.weighty = 0.5;
		gbc_lblHouse.weightx = 0.5;
		gbc_lblHouse.insets = new Insets(0, 0, 5, 5);
		gbc_lblHouse.gridx = 6;
		gbc_lblHouse.gridy = 4;
		contentPane.add(lblHouse, gbc_lblHouse);

		JLabel lblCat = new JLabel("");
		lblCat.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_cat.png")));
		GridBagConstraints gbc_lblCat = new GridBagConstraints();
		gbc_lblCat.weighty = 0.5;
		gbc_lblCat.weightx = 0.5;
		gbc_lblCat.insets = new Insets(0, 0, 5, 5);
		gbc_lblCat.gridx = 8;
		gbc_lblCat.gridy = 4;
		contentPane.add(lblCat, gbc_lblCat);

		JLabel lblBoat = new JLabel("");
		lblBoat.setIcon(new ImageIcon(PuzzleSetScreen.class.getResource("/TangramTest/Resources/rsz_1rabbit.png")));
		GridBagConstraints gbc_lblBoat = new GridBagConstraints();
		gbc_lblBoat.weighty = 0.5;
		gbc_lblBoat.weightx = 0.5;
		gbc_lblBoat.insets = new Insets(0, 0, 5, 5);
		gbc_lblBoat.gridx = 10;
		gbc_lblBoat.gridy = 4;
		contentPane.add(lblBoat, gbc_lblBoat);

		JButton btnSquare = new JButton("Square");
		GridBagConstraints gbc_btnSquare = new GridBagConstraints();
		gbc_btnSquare.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSquare.weighty = 0.5;
		gbc_btnSquare.weightx = 0.5;
		gbc_btnSquare.insets = new Insets(0, 0, 5, 5);
		gbc_btnSquare.gridx = 2;
		gbc_btnSquare.gridy = 5;
		contentPane.add(btnSquare, gbc_btnSquare);
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CLayout cl = new CLayout();
				cl.showView4(2);
			}
		});

		JButton btnShark = new JButton("Shark");
		GridBagConstraints gbc_btnShark = new GridBagConstraints();
		gbc_btnShark.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnShark.weighty = 0.5;
		gbc_btnShark.weightx = 0.5;
		gbc_btnShark.insets = new Insets(0, 0, 5, 5);
		gbc_btnShark.gridx = 4;
		gbc_btnShark.gridy = 5;
		contentPane.add(btnShark, gbc_btnShark);
		btnShark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CLayout cl = new CLayout();
				cl.showView4(0);
			}
		});

		JButton btnHouse = new JButton("House");
		GridBagConstraints gbc_btnHouse = new GridBagConstraints();
		gbc_btnHouse.weighty = 0.5;
		gbc_btnHouse.weightx = 0.5;
		gbc_btnHouse.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnHouse.insets = new Insets(0, 0, 5, 5);
		gbc_btnHouse.gridx = 6;
		gbc_btnHouse.gridy = 5;
		contentPane.add(btnHouse, gbc_btnHouse);
		btnHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CLayout cl = new CLayout();
				cl.showView4(6);
			}
		});

		JButton btnCat = new JButton("Cat");
		GridBagConstraints gbc_btnCat = new GridBagConstraints();
		gbc_btnCat.weighty = 0.5;
		gbc_btnCat.weightx = 0.5;
		gbc_btnCat.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCat.insets = new Insets(0, 0, 5, 5);
		gbc_btnCat.gridx = 8;
		gbc_btnCat.gridy = 5;
		contentPane.add(btnCat, gbc_btnCat);
		btnCat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CLayout cl = new CLayout();
				cl.showView4(1);
			}
		});

		JButton btnRabbit = new JButton("Rabbit");
		GridBagConstraints gbc_btnRabbit = new GridBagConstraints();
		gbc_btnRabbit.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnRabbit.weighty = 0.5;
		gbc_btnRabbit.weightx = 0.5;
		gbc_btnRabbit.insets = new Insets(0, 0, 5, 5);
		gbc_btnRabbit.gridx = 10;
		gbc_btnRabbit.gridy = 5;
		contentPane.add(btnRabbit, gbc_btnRabbit);
		btnRabbit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CLayout cl = new CLayout();
				cl.showView4(5);
			}
		});

		return contentPane;
	}
}
