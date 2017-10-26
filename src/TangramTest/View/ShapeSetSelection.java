package TangramTest.View;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import TangramTest.Controller.Back;
import TangramTest.Controller.CLayout;

@SuppressWarnings("serial")
public class ShapeSetSelection extends JPanel {

	private JPanel contentPane;

	public JPanel drawShapeSetSelection() {
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 123, 347, 349, 0 };
		gbl_contentPane.rowHeights = new int[] { 61, 273, 93, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JButton btnBack = new JButton("Back");
		GridBagConstraints gbc_btnBack = new GridBagConstraints();
		gbc_btnBack.weighty = 0.2;
		gbc_btnBack.weightx = 0.2;
		gbc_btnBack.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnBack.insets = new Insets(30, 60, 5, 5);
		gbc_btnBack.gridx = 0;
		gbc_btnBack.gridy = 0;
		contentPane.add(btnBack, gbc_btnBack);

		//
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Back bk = new Back();
				bk.getBack(1);
			}
		});
		//
		JLabel label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.fill = GridBagConstraints.BOTH;
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 2;
		gbc_label.gridy = 0;
		contentPane.add(label, gbc_label);

		JButton btnShapeSet1 = new JButton("ShapeSet 1");
		btnShapeSet1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PuzzleSolveScreen ps = new PuzzleSolveScreen();
				ps.setPuzzleConf(1, 1);
				CLayout cl = new CLayout();
				cl.showView3();
			}
		});

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ShapeSetSelection.class.getResource("/TangramTest/Resources/ShapeSet1.jpg")));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.weighty = 0.2;
		gbc_lblNewLabel.weightx = 0.2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1
				.setIcon(new ImageIcon(ShapeSetSelection.class.getResource("/TangramTest/Resources/ShapeSet2.png")));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.weighty = 0.2;
		gbc_lblNewLabel_1.weightx = 0.2;
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		GridBagConstraints gbc_btnShapeSet1 = new GridBagConstraints();
		gbc_btnShapeSet1.anchor = GridBagConstraints.NORTH;
		gbc_btnShapeSet1.weighty = 0.2;
		gbc_btnShapeSet1.weightx = 0.2;
		gbc_btnShapeSet1.insets = new Insets(0, 0, 0, 5);
		gbc_btnShapeSet1.gridx = 1;
		gbc_btnShapeSet1.gridy = 2;
		contentPane.add(btnShapeSet1, gbc_btnShapeSet1);

		JButton btnShapeset2 = new JButton("ShapeSet 2");
		btnShapeset2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PuzzleSolveScreen ps = new PuzzleSolveScreen();
				ps.setPuzzleConf(2, 2);
				CLayout cl = new CLayout();
				cl.showView3PuzzleSet2();
			}
		});
		GridBagConstraints gbc_btnShapeset2 = new GridBagConstraints();
		gbc_btnShapeset2.anchor = GridBagConstraints.NORTH;
		gbc_btnShapeset2.weighty = 0.2;
		gbc_btnShapeset2.weightx = 0.2;
		gbc_btnShapeset2.gridx = 2;
		gbc_btnShapeset2.gridy = 2;
		contentPane.add(btnShapeset2, gbc_btnShapeset2);
		return contentPane;
	}
}
