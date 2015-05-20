package fr.iutvalence.info.m2103.project.p4;

public class Pawnalign 
{

	public Pawnalign()
	{
		
	}
	
	private static boolean FourPawnalign(int depCol, int depLigne, int moveCol, int moveLig) 
	{
		int compteur = 0;
		int currrentCol = depCol;
	    int currentLig = depLigne;
		Cell colorSearch = Grid.cells[currentLig][currrentCol];

	    
	    while(currrentCol>=0 && currrentCol<Grid.NUMBER_OF_COLUMNS && currentLig>=0 && currentLig<Grid.NUMBER_OF_LINES)
	    {
	    	if (Grid.cells[currentLig][currrentCol] !=colorSearch) 
	    	{
	    		colorSearch = Grid.cells[currentLig][currrentCol];
	    		compteur=1;
	    	}
	    	else
	    	{
	    		compteur++;
	    	}
	    	if (compteur==4 && colorSearch != Cell.EMPTY)
	    	{
	    		return true;
	    	}
	    	currrentCol += moveCol;
	    	currentLig += moveLig;
			
	    }
	    return false;
	}
	
	public static boolean Search4Align()
	{
		for (int lig=0 ; lig<Grid.NUMBER_OF_LINES ; lig++)
		{
			if (FourPawnalign(0, lig, 1, 0)) 
			{
		        return true;
			}
		}
		
		for (int col=0 ; col<Grid.NUMBER_OF_COLUMNS ; col++)
		{
			if (FourPawnalign(col, 0, 0, 1)) 
			{
		        return true;
			}
		}
		
		for (int col=0 ; col<Grid.NUMBER_OF_COLUMNS ; col++)
		{
			if (FourPawnalign(col, 0, 1, 1)) 
			{
		        return true;
			}
		}
		
		for (int col=6 ; col>=0 ; col--)
		{
			if (FourPawnalign(col, 0, -1, 1)) 
			{
		        return true;
			}
			
		}
		return false;
	}
	
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
