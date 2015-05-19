package fr.iutvalence.info.m2103.project.p4;
// TODO rename class DONE 
/**
 *  create a Puissance4 grid
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
	static Cell[][] cells;

	// TODO rename field DONE
	// TODO fix comment DONE
	// TODO top of column is an array?? DONE
	/**
	 * The index of each top column
	 */
	static int[] columnTopIndex;
	
	// TODO rename field DONE
	// TODO fix comment DONE
	/**
	 * definition of grid constructor which create a grid of Puissance4
	 */
	public Grid() 
	{
		this.columnTopIndex=new int[NUMBER_OF_COLUMNS];
		this.cells=new Cell[NUMBER_OF_LINES][NUMBER_OF_COLUMNS];
		for(int numcolumn= 0 ; numcolumn < NUMBER_OF_COLUMNS;numcolumn++)
		{
			this.setTopIndex(numcolumn, NUMBER_OF_LINES-1);
			for (int numline = 0; numline<NUMBER_OF_LINES;numline++)
			{
				this.cells[numline][numcolumn]=Cell.EMPTY;
								
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
	public static int getTopIndex(int numcolumn)
	{
		return Grid.columnTopIndex[numcolumn];
	}
	
	public static void setTopIndex(int numcolumn, int top)
	{
		Grid.columnTopIndex[numcolumn]=top;
	}

	// TODO override toString DONE
	// TODO write comment 
	
	public String toString()
	{
		String gridAsciiArt = "";

		for (int numberOfLine = 0; numberOfLine < NUMBER_OF_LINES; numberOfLine++)
		{
			for (int numOfColumn = 0; numOfColumn < NUMBER_OF_COLUMNS; numOfColumn++)
				gridAsciiArt += this.cells[numberOfLine][numOfColumn].toString();
			gridAsciiArt += "¦\n+---";
				for (int numOflig = 0; numOflig < NUMBER_OF_LINES ; numOflig++)
					gridAsciiArt +="+---";
				gridAsciiArt += "+\n";
		}

		return gridAsciiArt;
								
			
			
		
		
	}
	
}