/**
 * @author romain.capocasa
 * @author jonas.freiburghaus
 * @author vincent.moulin1
 * Projet P2
 * Printemps 2019
 * He-arc
 */

package fluffy.userinterface.main;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel that contains title of the main window
 *
 */
public class JPanelLabel extends JPanel
	{

	public JPanelLabel()
		{
		this.geometry();
		}


	private void geometry()
		{
		this.lbTitle = new JLabel("<html><h1>Gestionaire de cam�ra IP</h1></html>");
		this.setLayout(new FlowLayout());
		this.add(this.lbTitle);
		}

	private JLabel lbTitle;
	}
