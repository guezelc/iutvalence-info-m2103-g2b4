package fr.iutvalence.info.m2103.project.p4;

import java.awt.Graphics;

import javax.swing.JPanel;

 

public class Panneau extends JPanel { 

  public void paintComponent(Graphics g){

    //Créer une grille de puissance 4
	// Test
	  
	  
    g.setColor(java.awt.Color.blue);
    for (int i = 1 ; i <= Grid.NUMBER_OF_COLUMNS+1; i ++)
    {
    	g.fillRect(75*i, 75, 10, 75*Grid.NUMBER_OF_LINES);
    }
    for (int j = 1 ; j <= Grid.NUMBER_OF_LINES+1; j++)
    {
    	g.fillRect(75, 75*j, 75*Grid.NUMBER_OF_COLUMNS, 10);
    }
    
    g.fillRect(75*(Grid.NUMBER_OF_COLUMNS+1), 75*(Grid.NUMBER_OF_LINES+1), 10, 10);
    
    /*
     * position de pion de Puissance 4 
     * Test
     * 
    g.setColor(java.awt.Color.red);
    g.fillOval((Grid.NUMBER_OF_COLUMNS)*75+10, 75*(Grid.NUMBER_OF_LINES)+10, 60 ,60);
    g.fillOval((Grid.NUMBER_OF_COLUMNS-1)*75+10, 75*(Grid.NUMBER_OF_LINES)+10, 60 ,60);
    g.fillOval((Grid.NUMBER_OF_COLUMNS-1)*75+10, 75*(Grid.NUMBER_OF_LINES-1)+10, 60 ,60);
    */
    
  }  
  
  /*
  public static void Container(Cell color, Graphics g)
  {
	  int col = Player.chooseColumn();
	  String colorpaint=null;
	  if (color==Cell.RED)
	  {
		  colorpaint="RED";
	  }
	  if (color==Cell.YELLOW)
	  {
		  colorpaint="YELLOW";
	  }
	  g.setColor(java.awt.Color.getColor(colorpaint));
	  g.fillOval((Grid.getTopIndex(col))*75+10, 75*(col)+10, 60 ,60);
	  
  }
  */

}