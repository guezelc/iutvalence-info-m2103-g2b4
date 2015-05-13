package fr.iutvalence.info.m2103.project.p4;

// TODO finish writing comment DONE
/**
 * class who define a game of puissance4
 * 
 * @author guezelc
 * 
 */
public class Puissance4Game {
	// TODO write comment DONE
	// TODO rename field DONE
	/**
	 * create a field grid type of Grille
	 */
	private Grid grid;
	/**
	 * create a field cells type of Cell
	 */
	private Cell[][] cells;

	// TODO fix comment DONE
	/**
	 * Create a game of Puissance4
	 **/
	public Puissance4Game() {
		this.grid = new Grid();
		Player player1=new Player(Cell.RED);
		Player player2=new Player(Cell.YELLOW);
	}

	// TODO fix comment DONE
	/**
	 * Create a new grid of Puissance4
	 */
	// TODO  do method play
	public void play() 
	{
		System.out.println(new Grid());
		PutPawn(6,Cell.RED);
		PutPawn(6,Cell.RED);
		PutPawn(6,Cell.RED);
		PutPawn(6,Cell.RED);
		System.out.println(this.grid);
		
	}
	/**
	 * @param player : The player who put the pawn
	 */
	public void PutPawn(int numcol,Cell color ) 
	{
			
		this.grid.cells[Grid.getTopIndex(numcol)][numcol]=color;
		Grid.setTopIndex(numcol, Grid.getTopIndex(numcol)-1);
	}
}
