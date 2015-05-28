package fr.iutvalence.info.m2103.project.p4;

// TODO finish writing comment DONE
/**
 * class who define a game of puissance4
 * 
 * @author guezelc
 * 
 */
public class Power4Game {
	// TODO write comment DONE
	// TODO rename field DONE
	/**
	 * create a field grid type of Grille
	 */
	static Grid grid;
	/**
	 * create a field cells type of Cell
	 */
	static Cell[][] cells;

	// TODO fix comment DONE
	/**
	 * Create a game of Puissance4
	 **/
	
	static int numberOfStroke = 0;	
	
	public Power4Game() 
	{
		this.grid = new Grid();
		Player player1=new Player(Cell.RED);
		Player player2=new Player(Cell.YELLOW);
	}

	// TODO fix comment DONE
	/**
	 * Create a new grid of Puissance4
	 */
	// TODO  do method play DONE
	public void play() 
	{	

		new Grid();

		for (;numberOfStroke<this.grid.NUMBER_OF_COLUMNS*this.grid.NUMBER_OF_LINES;numberOfStroke++)
		{
			
			PutPawn(Cell.RED);
			
			
			if (Pawnalign.Search4Align())
			{
				Pawnalign.Win(Cell.RED);
				numberOfStroke=0;
			}
			PutPawn(Cell.YELLOW);
			
			if (Pawnalign.Search4Align())
			{
				Pawnalign.Win(Cell.YELLOW);
				numberOfStroke=0;
			}
		}
		
		
	}
	/**
	 * The method who allow a player, choose by his color, to ut a pawn
	 * @param player : The player who put the pawn
	 */
	public static void PutPawn(Cell color ) 
	{
		int col= Player.chooseColumn();	
		Power4Game.grid.cells[Grid.getTopIndex(col)][col]=color;
		Grid.setTopIndex(col, Grid.getTopIndex(col)-1);
		System.out.println(Power4Game.grid);
	}
}
