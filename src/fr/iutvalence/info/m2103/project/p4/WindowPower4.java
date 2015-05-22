package fr.iutvalence.info.m2103.project.p4;

import javax.swing.JFrame;

import java.awt.Graphics;

public class WindowPower4 implements Runnable 
{
	public void run()
	{
	// Cr�ation du composant graphique associ� � la fen�tre
	// (� ce stade rien n'est affich�)
	JFrame fenetre = new JFrame();
	
	// Modification des propri�t�s de la fen�tre
	// Titre, dimensions (en pixel)
	fenetre.setTitle("Power 4 ");
	
	fenetre.setSize(Grid.NUMBER_OF_COLUMNS*100, Grid.NUMBER_OF_LINES*100);
	
	// Affichage de la fen�tre
	fenetre.setVisible(true);
	fenetre.setContentPane(new Panneau());
	
	
	}
}
