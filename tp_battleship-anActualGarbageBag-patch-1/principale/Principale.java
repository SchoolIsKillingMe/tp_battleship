package principale;

import javax.swing.JPanel;

import Controleur.Controleur;
import modele.Bateau;
import vue.InterfaceGraphique;
import vue.InterfaceGraphiqueInterface;
import vue.InterfaceStartMenu;

public class Principale {
	public static void main(String[] args) {

		// new InterfaceStartMenu("Battleship");
		InterfaceGraphique ig = new InterfaceGraphique("Battleship");
		Bateau b = new Bateau();
		Controleur c = new Controleur();

		System.out.println(b);

		c.setVue(ig);
		c.setBateau(b);
		ig.setControleur(c);

		b.AjouterPosition(c.TaMere(b.randomize()));
	}

}
