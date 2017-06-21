package BoulderDash.Vue;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import BoulderDash.Vue.Jeu.MenuChoixNiveau;
import BoulderDash.Vue.Jeu.PanelJeu;

/**
 * Fenêtre principale
 * 
 * @see MenuPrincipal, MenuChoixNiveau, PanelEditeur, PanelJeu
 * @author Yiserot
 */
public class Fenetre extends JFrame {
	private static final long serialVersionUID = 3393452907097178193L;

	/**
	 * Le panel affiché
	 */
	private JPanel display;

	/**
	 * Initialisation de la fenêtre
	 */
	public Fenetre() {
		super("Boulder Dash");
		display = new MenuPrincipal();
		add(display);
		display.grabFocus();
		setResizable(true);
		pack();
		this.setSize(450, 650);
		this.setPreferredSize(new Dimension(450, 650));

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	/**
	 * Permet de changer la vue en modifiant le panel à afficher
	 * 
	 * @param vue
	 *            le nouveau panel à afficher
	 * @param delaiFrame
	 *            délai du changement de frame
	 */
	public void changerVue(Vues vue) {
		remove(display);
		switch (vue) {
		case MENUPRINCIPAL:
			display = new MenuPrincipal();
			this.setPreferredSize(new Dimension(450, 650));
			break;
		case MENUCHOIXNIVEAU:
			display = new MenuChoixNiveau();
			this.setPreferredSize(new Dimension(400, 400));

			break;
		case TABLEAUJEU:
			display = new PanelJeu();
			this.setPreferredSize(new Dimension(800, 600));
			this.setResizable(false);
			break;
		default:
			display = new MenuPrincipal();
			break;
		}
		add(display);
		display.grabFocus();
		pack();
	}

	/**
	 * La vue actuelle récupère le focus
	 */
	public void refocus() {
		display.grabFocus();
	}

}
