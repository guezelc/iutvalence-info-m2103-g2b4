// TODO rename class
/**
 *  creer une grille de puissance 4
 * @author guezelc
 *
 */
public class Grille 
{
	// TODO rename field
	// TODO fix comment
	/**
	 * Nombre de lignes
	 */
	public final static int NOMBRE_DE_lIGNES = 6; 
	
	// TODO rename field
	// TODO fix comment
	/**
	 * Nombre de colonnes
	 */
	public final static int NOMBRE_DE_COLONNES = 7;
	
	// TODO rename field
	// TODO fix comment
	/** 
	 * grille de puissance 4
	 */
	private Case[][] cases;

	// TODO rename field
	// TODO fix comment
	// TODO top of column is an array??
	/**
	 * les indices des sommets de chaque colonne 
	 */
	private int[] sommet;
	
	// TODO rename field
	// TODO fix comment
	/**
	 * definition du constructeur grille qui creer le tableau de jeu
	 */
	public Grille() 
	{
		
		this.cases=new Case[NOMBRE_DE_lIGNES][NOMBRE_DE_COLONNES];
		for(int j= 0 ; j < NOMBRE_DE_COLONNES;j++)
		{
			this.sommet[j]=0;
			for (int i = 0; i<NOMBRE_DE_lIGNES;i++)
			{
				this.cases[i][j]=null;
								
			}
			
		}
		
	
	}
	// TODO rename method
	// TODO fix comment
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