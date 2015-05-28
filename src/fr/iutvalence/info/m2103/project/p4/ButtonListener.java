package fr.iutvalence.info.m2103.project.p4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener 
{
	
	public void actionPerformed (ActionEvent e)
	{
		if(e.getSource() == WindowPower4.button1)
		{
			Panneau.button=0;
		}
		
		else if(e.getSource() == WindowPower4.button2)
		{
			Panneau.button= 1;
		}
		
		else if(e.getSource() == WindowPower4.button3)
		{
			Panneau.button= 2;
		}
		
		else if(e.getSource() == WindowPower4.button4)
		{
			Panneau.button= 3;
		}
		
		else if(e.getSource() == WindowPower4.button5)
		{
			Panneau.button= 4;
		}
		
		else if(e.getSource() == WindowPower4.button6)
		{
			Panneau.button= 5;			
		}
		
		else if(e.getSource() == WindowPower4.button7)
		{
			Panneau.button= 6;
		}
		
		
		
		
		if ( Grid.getTopIndex(Panneau.button)+1>0)
		{
			Cell colorDraw = null;
			if (Panneau.color==Color.RED)
			{
				colorDraw=Cell.RED;
			}
			if (Panneau.color==Color.YELLOW)
			{
				colorDraw=Cell.YELLOW;
			}
			
			WindowPower4.fenetre.setBackground(Color.WHITE);
			WindowPower4.fenetre.setBackground(Color.BLACK);
			Power4Game.grid.cells[Grid.getTopIndex(Panneau.button)][Panneau.button]=colorDraw;
			System.out.println(Power4Game.grid);
			
			if (Pawnalign.Search4Align())
			{
				if (colorDraw ==Cell.RED)
				{
					Pawnalign.Win(Cell.RED);
					Power4Game.numberOfStroke=0;
				}
				if (colorDraw ==Cell.YELLOW)
				{
					Pawnalign.Win(Cell.YELLOW);
					Power4Game.numberOfStroke=0;
				}
				
				for(int numcolumn= 0 ; numcolumn < Grid.NUMBER_OF_COLUMNS;numcolumn++)
				{
					Grid.setTopIndex(numcolumn, Grid.NUMBER_OF_LINES-1);
				}
				
			}
			
			
			
			
			if (colorDraw==Cell.RED)
			{
				Panneau.color=Color.YELLOW;
			}
			if (colorDraw==Cell.YELLOW)
			{
				Panneau.color=Color.RED;
			}
		}
		else 
		{
			System.out.println("Column full, replay ! ");
		}
		
	}
}
