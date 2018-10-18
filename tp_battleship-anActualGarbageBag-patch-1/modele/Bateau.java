package modele;


import java.lang.reflect.Array;
import java.util.ArrayList;

import Toolbox.Tools;


	public class Bateau {
	private String nom;
	private int unites;
	private boolean enVie;
	private ArrayList<String> position;
	
	public Bateau() {
		
		enVie = true;
		position = new ArrayList<>();
	}
	
	public boolean isEnVie() {
		return enVie;
	}
	public void setEnVie(boolean enVie) {
		this.enVie = enVie;
	}
	
	public ArrayList<String> getPosition() {
		return position;
	}
	
	public void AjouterPosition(String id) {
		this.position.add(id);
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getUnites() {
		return unites;
	}

	public  int randomize(){
		Tools tools = new Tools();
		return tools.randomise(99, 0);
		
	}
	
	
}
	
	

