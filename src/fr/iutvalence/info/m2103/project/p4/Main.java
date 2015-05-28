package fr.iutvalence.info.m2103.project.p4;

import javax.swing.SwingUtilities;

// TODO write comment DONE
// TODO move classes in a package (fr.iutvalence.info.m2103.project.p4) DONE

/**
 * Initiate a game of Puissance4
 * @author guezelc
 *
 */
public class Main {

	// TODO write comment DONE
	/**
	 * Launch a game of Puissance4
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		SwingUtilities.invokeLater(new WindowPower4());
		System.out.println("fin du main !");
		new Power4Game().play()	;
		
	}

}
