package fr.iutvalence.info.m2103.project.p4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

 

public class Panneau extends JPanel { 

  public static Color color = Color.YELLOW;
  public static int button= -1;


public void paintComponent(Graphics g)
{

   	
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
    
    
    if(button>=0)
    {
    	g.setColor(color);    	 	
    	g.fillOval((button+1)*75+10, 75*(Grid.getTopIndex(button)+1)+10, 60 ,60);
    	Grid.setTopIndex(button, Grid.getTopIndex(button)-1);
    }
    
    
  }  
  

}