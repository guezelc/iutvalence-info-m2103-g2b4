
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

	private Case[][] cases;

	private int[] sommet;
	
	/**
	 * definition du constructeur grille qui creer le tableau de jeu
	 */
	public Grille() 
	{
		/**
		 * Construit une Grille Vide 
		 */
		
		this.cases=new Case[NOMBRE_DE_lIGNES][NOMBRE_DE_COLONNES];
		for(int j= 0 ; j < NOMBRE_DE_COLONNES;j++)
		{
			sommet[j]=0;
			for (int i = 0; i<NOMBRE_DE_lIGNES;i++)
			{
				this.cases[i][j]=null;
								
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
		return sommet[numcolonne];
	}

}