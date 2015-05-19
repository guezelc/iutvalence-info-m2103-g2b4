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
	// TODO  do method play DONE
	public void play() 
	{	

		System.out.println(new Grid());
		System.out.println("The Red begin");

		for (int nbrcoup=0;nbrcoup<this.grid.NUMBER_OF_COLUMNS*this.grid.NUMBER_OF_LINES;nbrcoup++)
		{
			
			PutPawn(Cell.RED);
			System.out.println(this.grid);
			
			if (Pawnalign.Search4Align())
			{
				Pawnalign.Win(Cell.RED);
				nbrcoup=0;
			}
			PutPawn(Cell.YELLOW);
			System.out.println(this.grid);
			if (Pawnalign.Search4Align())
			{
				Pawnalign.Win(Cell.YELLOW);
				nbrcoup=0;
			}
		}
		
		
	}
	/**
	 * @param player : The player who put the pawn
	 */
	public void PutPawn(Cell color ) 
	{
		int col= Player.chooseColumn();	
		this.grid.cells[Grid.getTopIndex(col)][col]=color;
		Grid.setTopIndex(col, Grid.getTopIndex(col)-1);
	}
}
