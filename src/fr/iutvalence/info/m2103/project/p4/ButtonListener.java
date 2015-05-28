package fr.iutvalence.info.m2103.project.p4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener 
{
	
	public int actionPerformed (ActionEvent e)
	{
		if(e.getSource() == WindowPower4.button1)
		{
			return 0;
		}
		
		if(e.getSource() == WindowPower4.button2)
		{
			return 1;
		}
		
		if(e.getSource() == WindowPower4.button3)
		{
			return 2;
		}
		
		if(e.getSource() == WindowPower4.button4)
		{
			return 3;
		}
		
		if(e.getSource() == WindowPower4.button5)
		{
			return 4;
		}
		
		if(e.getSource() == WindowPower4.button6)
		{
			return 5;
		}
		
		if(e.getSource() == WindowPower4.button7)
		{
			return 6;
		}
	}
}
