
/**
 * @author guezelc
 * creer une grille de puissance 4
 */
public class Grille 
{
	/**
	 * Nombre de lignes
	 */
	public final static int NOMBRE_DE_lIGNES = 6; 
	
	/**
	 * Nombre de colonnes
	 */
	
	public final static int NOMBRE_DE_COLONNES = 7;
	
	/** 
	 * grille de puissance 4
	 */

	private Case[][] grille;

	/**
	 * le sommet d'une colonne 
	 */
	private int[] sommet;
	
	/**
	 * definition du constructeur grille qui creer le tableau de jeu
	 */
	public Grille() 
	{
		/**
		 * Construit une Grille Vide 
		 */
		
		this.grille=new Case[NOMBRE_DE_lIGNES][NOMBRE_DE_COLONNES];
		for(int j= 0 ; j < NOMBRE_DE_COLONNES;j++)
		{
			this.sommet[j]=0;
			for (int i = 0; i<NOMBRE_DE_lIGNES;i++)
			{
				this.grille[i][j]=null;
								
			}
			
		}
		
	
	}
	/** 
	 * Obtenir le nombre de pion dans une colonne
	 * @param numcolonne choisis un numéro de colonne
	 * @return le nombre de pion dans cette colonne 
	 */
	public int getSommet(int numcolonne)
	{
		return this.sommet[numcolonne];
	}

}