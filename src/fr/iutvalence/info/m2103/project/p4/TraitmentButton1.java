package fr.iutvalence.info.m2103.project.p4;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TraitmentButton1 implements   ActionListener
{
	public void actionPerformed (ActionEvent e)
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
		Panneau.button=0;
		WindowPower4.fenetre.setBackground(Color.WHITE);
		WindowPower4.fenetre.setBackground(Color.BLACK);
		Power4Game.grid.cells[Grid.getTopIndex(Panneau.button)][Panneau.button]=colorDraw;
		System.out.println(Power4Game.grid);
		if (colorDraw==Cell.RED)
		{
			Panneau.color=Color.YELLOW;
		}
		if (colorDraw==Cell.YELLOW)
		{
			Panneau.color=Color.RED;
		}
		
		
		
	}
}
