package code;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class NavigationBar extends JPanel {
	
	public final int None = 0;
	public final int Back = 1;
	public final int Home = 2;
	public final int Menu = 3;
	public final int BackHome = 4;
	public final int BackMenu = 5;
	public final int HomeMenu = 6;
	public final int BackHomeMenu = 7;
	
	JButton btnBack;
	JButton btnHome;
	JButton btnMenu;
	
	AMCPanel ParentPanel;
	
	/**
	 * Create the panel.
	 */
	public NavigationBar(AMCPanel pan) {
		setBackground(Color.GRAY);
		this.setSize(1024, 66);
		setLayout(null);
		
		//Back Button
		btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ParentPanel.ActionBack();
			}
		});
		btnBack.setForeground(Color.DARK_GRAY);
		btnBack.setBackground(Color.DARK_GRAY);
		btnBack.setBounds(0, 0, 66, 66);
		add(btnBack);
		
		//Home Button
		btnHome = new JButton("");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ParentPanel.ActionHome();
			}
		});
		btnHome.setForeground(Color.DARK_GRAY);
		btnHome.setBackground(Color.DARK_GRAY);
		btnHome.setBounds(0, 0, 66, 66);
		add(btnHome);
		
		//Menu Button
		btnMenu = new JButton("");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				ParentPanel.ActionMenu();
			}
		});
		btnMenu.setForeground(Color.DARK_GRAY);
		btnMenu.setBackground(Color.DARK_GRAY);
		btnMenu.setBounds(0, 0, 66, 66);
		add(btnMenu);
		
		
	}
	
	public void setState(int parState) {
		switch(parState){
			case None:
				btnBack.setVisible(false);
				btnHome.setVisible(false);
				btnMenu.setVisible(false);
				break;
			case Back:
				btnBack.setVisible(true);
				btnHome.setVisible(false);
				btnMenu.setVisible(false);
				break;
			case Home:
				btnBack.setVisible(false);
				btnHome.setVisible(true);
				btnMenu.setVisible(false);
				break;
			case Menu:
				btnBack.setVisible(false);
				btnHome.setVisible(false);
				btnMenu.setVisible(true);
				break;
			case BackHome:
				btnBack.setVisible(true);
				btnHome.setVisible(true);
				btnMenu.setVisible(false);
				break;
			case BackMenu:
				btnBack.setVisible(true);
				btnHome.setVisible(false);
				btnMenu.setVisible(true);
				break;
			case HomeMenu:
				btnBack.setVisible(false);
				btnHome.setVisible(true);
				btnMenu.setVisible(true);
				break;
			case BackHomeMenu:
				btnBack.setVisible(true);
				btnHome.setVisible(true);
				btnMenu.setVisible(true);
				break;
		}
	}

}
