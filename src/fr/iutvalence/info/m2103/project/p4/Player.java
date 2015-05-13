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
	private static Cell color;
	private static Cell[][] cells;
	
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
	
	
}
