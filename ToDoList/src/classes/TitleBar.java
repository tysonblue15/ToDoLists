package classes;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class TitleBar extends JPanel{
	//Constructor
	TitleBar(){
		this.setPreferredSize(new Dimension(400, 50));
		this.setBackground(Color.red);
	}
}
