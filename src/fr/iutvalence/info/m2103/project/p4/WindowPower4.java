package fr.iutvalence.info.m2103.project.p4;

import javax.swing.JFrame;

import java.awt.Graphics;

public class WindowPower4 implements Runnable 
{
	public void run()
	{
	// Création du composant graphique associé à la fenêtre
	// (à ce stade rien n'est affiché)
	JFrame fenetre = new JFrame();
	
	// Modification des propriétés de la fenêtre
	// Titre, dimensions (en pixel)
	fenetre.setTitle("Power 4 ");
	
	fenetre.setSize(Grid.NUMBER_OF_COLUMNS*100, Grid.NUMBER_OF_LINES*100);
	
	// Affichage de la fenêtre
	fenetre.setVisible(true);
	fenetre.setContentPane(new Panneau());
	
	
	}
}
