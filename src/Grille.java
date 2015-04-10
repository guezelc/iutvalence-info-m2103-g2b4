
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

	private int grille [][];
	/**
	 * nombre de pions dans la colonnes
	 */
	private int nombredepions;
	
	/**
	 * definition du constructeur grille qui creer le tableau de jeu
	 */
	public Grille() 
	{
		
		this.setGrille(new int [NOMBRE_DE_lIGNES][NOMBRE_DE_COLONNES]);
		for (int i = 0; i<NOMBRE_DE_lIGNES;i++)
		{
			for(int j= 0 ; j < NOMBRE_DE_COLONNES;j++)
			{
				this.grille[i][j]=0;
			}
			
		}
		
	}

	/** 
	 * methode qui permet d'avoir la grille
	 * @return la grille du puissance 4
	 */
	public int[][] getGrille() {
		return grille;
	}

	/** 
	 * permet de modifier la grille du puissance 4
	 * @param grille
	 */
	public void setGrille(int grille[][]) {
		this.grille = grille;
	}
	
	//public int sommetColonne(int numcolonne);
	{
		
	}
	
	// public void AjouterPion(int numcolonne,Couleur c)
	// {
	//	 this.grille[numcolonne][sommetColonne(this.numcolonne)]
	// }
}
