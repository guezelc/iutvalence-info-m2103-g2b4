package fr.iutvalence.info.m2103.project.p4;
/**
 * The class who detect the pawns align in the grid of Power 4
 * @author Clément
 *
 */
public class Pawnalign 
{

	/**
	 * The constructor of the class Pawnalign, it is useless
	 */
	public Pawnalign()
	{
		
	}
	
	/**
	 * The method who detect if 4 pawn is align
	 * @param initCol the column number of beginning
	 * @param initLine the line number of beginning
	 * @param moveCol the number who's add to the number of column of beginning after each loop
	 * @param moveLig the number who's add to the number of line of beginning after each loop
	 * @return return true if 4 cell color's are the same in the same direction
	 */
	private static boolean FourPawnAlign(int initCol, int initLine, int moveCol, int moveLig) 
	{
		int count = 0;
		int currrentCol = initCol;
	    int currentLig = initLine;
		Cell colorSearch = Grid.cells[currentLig][currrentCol];

	    
	    while(currrentCol>=0 && currrentCol<Grid.NUMBER_OF_COLUMNS && currentLig>=0 && currentLig<Grid.NUMBER_OF_LINES)
	    {
	    	if (Grid.cells[currentLig][currrentCol] !=colorSearch) 
	    	{
	    		colorSearch = Grid.cells[currentLig][currrentCol];
	    		count=1;
	    	}
	    	else
	    	{
	    		count++;
	    	}
	    	if (count==4 && colorSearch != Cell.EMPTY)
	    	{
	    		return true;
	    	}
	    	currrentCol += moveCol;
	    	currentLig += moveLig;
			
	    }
	    return false;
	}
	/**
	 * The method who search 4 pawn align with the help of the method FourPawnAlign 
	 * @return return true if 4 pawns are align 
	 */
	public static boolean Search4Align()
	{
		for (int lig=0 ; lig<Grid.NUMBER_OF_LINES ; lig++)
		{
			if (FourPawnAlign(0, lig, 1, 0)) 
			{
		        return true;
			}
		}
		
		for (int col=0 ; col<Grid.NUMBER_OF_COLUMNS ; col++)
		{
			if (FourPawnAlign(col, 0, 0, 1)) 
			{
		        return true;
			}
		}
		
		for (int col=0 ; col<Grid.NUMBER_OF_COLUMNS ; col++)
		{
			if (col ==0)
			{
				for (int lig = 0 ; lig<=Grid.NUMBER_OF_LINES-3 ; lig++)
				{
					if (FourPawnAlign(col, lig, 1, 1))
					{
						return true ;
					}
				}
			}
			if (FourPawnAlign(col, 0, 1, 1)) 
			{
		        return true;
			}
		}
		
		for (int col=6 ; col>=0 ; col--)
		{
			if (col ==6)
			{
				for (int lig = 0 ; lig<=Grid.NUMBER_OF_LINES-3 ; lig++)
				{
					if (FourPawnAlign(col, lig, -1, 1))
					{
						return true ;
					}
				}
			}
			
			if (FourPawnAlign(col, 0, -1, 1)) 
			{
		        return true;
			}
			
		}
		return false;
	}
	
	/**
	 * The method who detect if a player win 
	 * @param color : The color of the winner
	 */
	public static void Win(Cell color)
	{
		if (color==Cell.RED)
		{
			System.out.println("Red win !");
			System.out.println(new Grid());
			System.out.println("The Yellow begin");
		}
		if (color==Cell.YELLOW)
		{
			System.out.println("Yellow win !");
			System.out.println(new Grid());
			System.out.println("The Red begin");
		}
	}
}
