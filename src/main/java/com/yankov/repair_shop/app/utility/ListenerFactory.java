package main.java.com.yankov.repair_shop.app.utility;

import java.awt.event.ActionListener;

import main.java.com.yankov.repair_shop.app.controller.InputDialogController;
import main.java.com.yankov.repair_shop.app.controller.LoginDialogController;
import main.java.com.yankov.repair_shop.app.controller.WindowController;
import main.java.com.yankov.repair_shop.app.listener.CloseWindow;
import main.java.com.yankov.repair_shop.app.listener.Login;
import main.java.com.yankov.repair_shop.app.listener.OpenWindow;
import main.java.com.yankov.repair_shop.app.listener.SaveData;
import main.java.com.yankov.repair_shop.app.listener.UpdateData;
import main.java.com.yankov.repair_shop.app.listener.UpdateEntityDetails;
import main.java.com.yankov.repair_shop.data.EntityType;

/**
 * The ActionFactory class is a factory for action listeners.
 * 
 * @author Zoran Jankov
 *
 */
public class ListenerFactory
{
	/**
	 * Returns new SaveData ActionListener
	 * @param controller - InputDialogController
	 * @return new SaveData ActionListener
	 */
	public static ActionListener saveData(InputDialogController controller)
	{
		return new SaveData(controller);
	}
	
	public static ActionListener updateData(InputDialogController controller)
	{
		return new UpdateData(controller);
	}
	
	/**
	 * Returns new OpenWindow ActionListener
	 * @param owner - Window owner of the new window
	 * @param dataType - EntityType enum 
	 * @return new OpenWindow ActionListener
	 */
	public static ActionListener openWindow(WindowController owner, EntityType entityType)
	{
		return new OpenWindow(owner, entityType);
	}
	
	/**
	 * Returns new OpenWindow ActionListener
	 * @param window - WindowTag of the new window
	 * @return new OpenWindow ActionListener
	 */
	public static ActionListener openWindow(WindowTag window)
	{
		return new OpenWindow(window);
	}
	
	/**
	 * Returns new CloseWindow ActionListener
	 * @param controller - WindowController
	 * @return new CloseWindow ActionListener
	 */
	public static ActionListener closeWindow(WindowController controller)
	{
		return new CloseWindow(controller);
	}
	
	/**
	 * Returns new Login ActionListener
	 * @param controller - LoginDialogController
	 * @return new Login ActionListener
	 */
	public static ActionListener login(LoginDialogController controller)
	{
		return new Login(controller);
	}
	
	public static ActionListener comboBoxListener(EntityType entityType, InputDialogController controller)
	{
		return new UpdateEntityDetails(entityType, controller);
	}
}