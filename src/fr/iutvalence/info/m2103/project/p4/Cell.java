package fr.iutvalence.info.m2103.project.p4;
// TODO write comment DONE

/**
 * Define an enum of cell of Puissance4
 * @author guezelc
 *
 */
public enum Cell 
{
	/**
	 * The color RED
	 */
	RED,
	/**
	 * The color YELLOW
	 */
	YELLOW,
	/**
	 * The EMPTY state
	 */
	EMPTY;
	
	public String toString()
	{
		if (this == RED) return "|o";
		else if (this == YELLOW) return "|x";
		else return "|_";
	}
}
