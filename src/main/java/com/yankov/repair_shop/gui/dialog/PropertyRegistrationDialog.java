package main.java.com.yankov.repair_shop.gui.dialog;

import java.awt.Window;

import javax.swing.JDialog;

import main.java.com.yankov.repair_shop.data.EntityType;
import main.java.com.yankov.repair_shop.gui.panel.IdPanel;
import main.java.com.yankov.repair_shop.gui.panel.InputButtonPanel;
import main.java.com.yankov.repair_shop.gui.panel.PropertyPanel;
import main.java.com.yankov.repair_shop.gui.text.WindowTitle;
import net.miginfocom.swing.MigLayout;

public class PropertyRegistrationDialog extends JDialog implements InputDialog
{
	private static final long serialVersionUID = 6674166830353586592L;
	private IdPanel idPanel = new IdPanel();
	private PropertyPanel propertyPanel = new PropertyPanel();
	private InputButtonPanel buttonPanel = new InputButtonPanel();
	
	public PropertyRegistrationDialog(Window owner, EntityType entityType)
	{
		super(owner);
		
		setResizable(false);
		setTitle(WindowTitle.getNewPropertyTitle(entityType));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		getContentPane().setLayout(new MigLayout("", "[434px]", "[20px:n][grow][]"));
		
		getContentPane().add(idPanel, "cell 0 0,grow");
		
		getContentPane().add(propertyPanel, "cell 0 1,grow");
		
		getContentPane().add(buttonPanel, "cell 0 2,grow");
		
		pack();
	}

	@Override
	public IdPanel getIdPanel()
	{
		return idPanel;
	}
	
	public PropertyPanel getPropertyPanel()
	{
		return propertyPanel;
	}

	@Override
	public InputButtonPanel getInputButtonPanel()
	{
		return buttonPanel;
	}
}