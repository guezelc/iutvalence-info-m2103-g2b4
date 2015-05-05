package fr.iutvalence.info.m2103.project.p4;
// TODO rename class DONE 
/**
 *  creer une grille de puissance 4
 * @author guezelc
 *
 */
public class Grid 
{
	// TODO rename field DONE
	// TODO fix comment DONE
	/**
	 * Number of lines
	 */
	public final static int NUMBER_OF_LINES = 6; 
	
	// TODO rename field DONE
	// TODO fix comment DONE
	/**
	 * Number of columns
	 */
	public final static int NUMBER_OF_COLUMNS = 7;
	
	// TODO rename field DONE
	// TODO fix comment DONE
	/** 
	 * Cells of a Grid
	 */
	private Cell[][] cells;

	// TODO rename field DONE
	// TODO fix comment DONE
	// TODO top of column is an array?? DONE
	/**
	 * The index of each top column
	 */
	private int[] columnTopIndex;
	
	// TODO rename field DONE
	// TODO fix comment DONE
	/**
	 * definition of grid constructor which create a grid of Puissance4
	 */
	public Grid() 
	{
		
		this.cells=new Cell[NUMBER_OF_LINES][NUMBER_OF_COLUMNS];
		for(int j= 0 ; j < NUMBER_OF_COLUMNS;j++)
		{
			this.columnTopIndex[j]=0;
			for (int i = 0; i<NUMBER_OF_LINES;i++)
			{
				this.cells[i][j]=null;
								
			}
			
		}
		
	
	}
	// TODO rename method DONE
	// TODO fix comment DONE
	/** 
	 * Get the number of pawn in the column
	 * @param numcolumn choose a number of column
	 * @return the number of pawn in this column
	 */
	public int getTopIndex(int numcolumn)
	{
		return this.columnTopIndex[numcolumn];
	}

	// TODO override toString
	
}