package fr.iutvalence.info.m2103.project.p4;
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
	public static Cell color;
	private static Cell[][] cells;
	
	/**
	 * define a player with his color
	 * @param colorOfPlayer : the color of the player
	 */
	public Player(Cell colorOfPlayer) 
	{
		this.color= colorOfPlayer;
	}
	
	/**
	 * select the top of column and put a pawn when it's found
	 * @param numcol
	 * @return numcol: where the player want to put the pawn
	 */
	public static int ChooseColumn (int numcol)
	{
		return numcol;
	}
}
