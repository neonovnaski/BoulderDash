package view;

import java.awt.event.KeyListener;

import javax.swing.JFrame;

import controller.IBDKeyListener;

public class Window extends JFrame implements IWindow {
	private static final long serialVersionUID = 8164118974463460991L;
	Panel panel;
	int finalDiamonds;

	/**
	 * The constructor of Window
	 */
	public Window(MapMaker maker, IBDKeyListener listener, int finalDiamonds, int title) {

		/*
		 * Create a new window
		 */
		this.finalDiamonds = finalDiamonds;
		this.setTitle("BoulderDash level " + title);
		this.setSize(660, 420);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setFocusable(true);
		this.addKeyListener((KeyListener) listener);
		/*
		 * Create a new Panel
		 */
		panel = new Panel(maker, finalDiamonds);

		/*
		 * Fill the panel
		 */

		this.setContentPane(panel);
		this.setVisible(true);
	}
	
	
	public Panel getPanel() {
		return panel;
	}
}