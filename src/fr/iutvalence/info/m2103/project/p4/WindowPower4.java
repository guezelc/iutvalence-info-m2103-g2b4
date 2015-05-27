package fr.iutvalence.info.m2103.project.p4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Graphics;

public class WindowPower4 extends JFrame implements Runnable 
{
	
	private JButton button1 = new JButton("Col1");
	private JButton button2 = new JButton("Col2");
	private JButton button3 = new JButton("Col3");
	private JButton button4 = new JButton("Col4");
	private JButton button5 = new JButton("Col5");
	private JButton button6 = new JButton("Col6");
	private JButton button7 = new JButton("Col7");
	
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
	fenetre.setBackground(Color.BLACK);
	
	
	
	button1.setPreferredSize(new Dimension(65, 30));
	button2.setPreferredSize(new Dimension(65, 30));
	button3.setPreferredSize(new Dimension(65, 30));
	button4.setPreferredSize(new Dimension(65, 30));
	button5.setPreferredSize(new Dimension(65, 30));
	button6.setPreferredSize(new Dimension(65, 30));
	button7.setPreferredSize(new Dimension(65, 30));
	
	fenetre.add(button1);
	fenetre.add(button2);
	fenetre.add(button3);
	fenetre.add(button4);
	fenetre.add(button5);
	fenetre.add(button6);
	fenetre.add(button7);
	
	}
}
