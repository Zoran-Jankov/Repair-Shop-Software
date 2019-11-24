package com.repair_shop.gui;

import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class MarketingPanel extends JPanel
{
	private static final long serialVersionUID = -2355948052589691285L;
	private JComboBox<String> cmbMarketing = new JComboBox<String>();
	private JButton btnNewMarketing = ButtonFactory.createJButton("New Marketing", new Font("Tahoma", Font.PLAIN, 13));

	public MarketingPanel()
	{
		setLayout(new MigLayout("", "[][grow,fill][][][][][][][][][]", "[fill]"));
		
		JLabel lblMarketingInformation = LabelFactory.createJLabel("Marketing Information", new Font("Tahoma", Font.PLAIN, 13));
		add(lblMarketingInformation, "cell 0 0,alignx trailing,growy");
		add(cmbMarketing, "cell 1 0 9 1,grow");
		add(btnNewMarketing, "cell 10 0,growy");
	}
	
	public void updateMarketingInfo(String newMarketing)
	{
		cmbMarketing.addItem(newMarketing);
		cmbMarketing.setSelectedItem(newMarketing);
	}
	
	public void setBtnMarketingActionListener(ActionListener listener)
	{
		btnNewMarketing.addActionListener(listener);
	}
}