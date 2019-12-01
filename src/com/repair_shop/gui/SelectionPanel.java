package com.repair_shop.gui;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class SelectionPanel extends JPanel
{
	private static final long serialVersionUID = 6173599805523082955L;
	private JComboBox<String> cmbDataElement = new JComboBox<String>();
	private JLabel lblDataElementDetails = LabelFactory.createJLabel("Data Element details", new Font("Tahoma", Font.PLAIN, 13));
	private final JButton btnNewDataElement = new JButton("New Data Element");
	
	public SelectionPanel()
	{
		setLayout(new MigLayout("", "[248px:n:248px,grow][]", "[][][100px:n]"));
		
		JLabel lblDataElement = LabelFactory.createJLabel("Data Element", new Font("Tahoma", Font.BOLD, 13));
		lblDataElement.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblDataElement, "cell 0 0 2 1,grow");
		
		add(cmbDataElement, "cell 0 1,grow");
		
		add(btnNewDataElement, "cell 1 1");
		
		lblDataElementDetails.setFont(new Font("Tahoma", Font.PLAIN, 15));
		add(lblDataElementDetails, "cell 0 2 2 1,grow");
	}
	
	
}