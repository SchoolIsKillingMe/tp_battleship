package Controleur;

import java.awt.Color;

import javax.swing.JButton;

import modele.Bateau;
import vue.InterfaceGraphique;

public class Controleur {

	private InterfaceGraphique vue;
	private Bateau bateau;

	public void action() {
		JButton btn = vue.getButton();
		String test = btn.getActionCommand();
		
		for(String tst:bateau.getPosition()) {
			if(tst.equals(test)) {
				btn.setBackground(Color.RED);
			}
			else {
				btn.setBackground(Color.BLUE);
			}
		}
		
			
		
	
	}
	public void setVue(InterfaceGraphique vue){
		this.vue = vue;
	}

	public void setBateau(Bateau bateau) {
		this.bateau = bateau;
	}
	
	public String TaMere(int i) {
		String temps = vue.getNomsBoutons()[i];
		return temps;
	}
	
	
}
