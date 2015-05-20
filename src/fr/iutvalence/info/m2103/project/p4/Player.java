package fr.iutvalence.info.m2103.project.p4;
import java.util.Scanner;
/**
 * define the class Player 
 * @author costel
 *
 */

public class Player 
{	
	/**
	 * color of the player
	 */
	private static Cell color;
	private static Cell[][] cells;
	private static Scanner sc;
	
	/**
	 * define a player with his color
	 * @param colorOfPlayer : the color of the player
	 */
	public Player(Cell colorOfPlayer) 
	{
		this.setColor(colorOfPlayer);
	}

	public static Cell getColor() {
		return color;
	}

	public static void setColor(Cell color) {
		Player.color = color;
	}
	
	public static int chooseColumn ()
	{
		sc = new Scanner(System.in);
		int str = sc.nextInt();
		while (str>=Grid.NUMBER_OF_COLUMNS ||Grid.columnTopIndex[str]<=-1 ||str<=-1 )
		{
			if (str>=Grid.NUMBER_OF_COLUMNS||str<=-1 )
			{
				System.out.println("Invalid column number : replay !");
				sc = new Scanner(System.in);
				str = sc.nextInt();	
			}
			if (Grid.columnTopIndex[str]<=-1)
			{
				System.out.println("Column full : replay !");
				sc = new Scanner(System.in);
				str = sc.nextInt();	
			}
					
		}		
		return str;
	}
	
}
