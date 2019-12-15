package com.repair_shop.gui.panel;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import com.repair_shop.gui.text.ButtonName;
import com.repair_shop.gui.text.LabelName;
import com.repair_shop.gui.utility.ButtonFactory;
import com.repair_shop.gui.utility.ComboBoxFactory;
import com.repair_shop.gui.utility.LabelFactory;

import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;

public class SelectionPanel extends JPanel
{
	private static final long serialVersionUID = 6173599805523082955L;
	
	private JLabel lblEntityType = LabelFactory.createJLabel
								               (LabelName.ENTITY, new Font("Tahoma", Font.BOLD, 13));
	
	private JComboBox<String> cmbEntity = ComboBoxFactory.createJComboBox();
	
	private JLabel lblEntityDetails = LabelFactory.createJLabel
			                                      (LabelName.ENTITY_DETAILS, new Font("Tahoma", Font.PLAIN, 13));
	
	private final JButton btnNewEntity = ButtonFactory.createJButton
													  (ButtonName.ADD_NEW_ENTITY, new Font("Tahoma", Font.PLAIN, 13));
	
	public SelectionPanel()
	{
		setLayout(new MigLayout("", "[grow][]", "[][][100px:n]"));
		
		lblEntityType.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblEntityType, "cell 0 0 2 1,grow");
		
		AutoCompleteDecorator.decorate(cmbEntity);
		add(cmbEntity, "cell 0 1,grow");
		
		add(btnNewEntity, "cell 1 1,grow");
		
		add(lblEntityDetails, "cell 0 2 2 1,grow");
	}
	
	public String getEntity()
	{
		cmbEntity.setBackground(Color.WHITE);
		return (String) cmbEntity.getSelectedItem();
	}
	
	public void setEntityType(String text)
	{
		lblEntityType.setText(text);
	}
	
	public void setComboBoxModel(ComboBoxModel<String> model)
	{
		cmbEntity.setModel(model);
	}
	
	public void setButtonFunction(ActionListener listener, String text)
	{
		btnNewEntity.addActionListener(listener);
		btnNewEntity.setText(text);
	}
	
	public void setEntityDetails(String text)
	{
		lblEntityDetails.setText(text);
	}
	
	public void showSelectionError()
	{
		cmbEntity.setBackground(Color.YELLOW);
	}
}