package code;

import javax.swing.JPanel;

public class AMCPanel extends JPanel{
	public final int None = 0;
	public final int Back = 1;
	public final int Home = 2;
	public final int Menu = 3;
	public final int BackHome = 4;
	public final int BackMenu = 5;
	public final int HomeMenu = 6;
	public final int BackHomeMenu = 7;
	
	int ButtonState;
	
	NavigationBar navbar;
	
	public AMCPanel() {
		navbar = new NavigationBar(this);
	}
	
	public void ActionBack() {
		
	}
	
	public void ActionHome() {
		
	}
	
	public void ActionMenu() {
		
	}
	
	
}
