package Tools;

import javax.swing.*;

public class UI {
	public static void main(String[]arg) {

        // create a frame
		JFrame JF = new JFrame("Financial Tools");
 
        // create a menu-bar
		JMenuBar MB = new JMenuBar();
 
        // create a menu
		JMenu AmortCalc = new JMenu("Amortization");
 
        // add menu to menu bar
		MB.add(AmortCalc);
 
        // add menu-bar to frame
		JF.setJMenuBar(MB);
 
        // set the size of the frame
		JF.setSize(500, 500);
		JF.setVisible(true);



	}
}
