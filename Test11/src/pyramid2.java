
public class pyramid2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer nbLignes = -5;

		if (nbLignes >= 0)
		{
			System.out.println("ALGO 1");
			
			// i va de 0 au nombre de lignes 
			for (int i=0; i < nbLignes; i++)
			{
				// j va nous permettre d'afficher autant de * que
				// le n° de la ligne
				for (int j=0; j <= i ; j++)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			
			System.out.println("ALGO 2");
	
			// i va de 0 au nombre de lignes 
			for (int i=0; i < nbLignes; i++)
			{
				// j va nous permettre d'afficher autant de * que
				// le n° de la ligne
				String ligne = "";
				for (int j=0; j <= i ; j++)
				{
					ligne = ligne + "*";
				}
				System.out.println(ligne);
			}
		}
		else 
		{
			System.out.println("NEGATIF - ALGO 1");
			
			// i va de 0 au nombre de lignes 
			for (int i=0; i < Math.abs(nbLignes); i++)
			{
				int nbEspace = Math.abs(nbLignes) - i - 1;
				for (int k=0; k<nbEspace;k++)
				{
					System.out.print(" ");
				}
				
				// j va nous permettre d'afficher autant de * que
				// le n° de la ligne
				for (int j=0; j <= i ; j++)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
			
			System.out.println("NEGATIF - ALGO 2");
			
			// i va de 0 au nombre de lignes 
			for (int i=0; i < Math.abs(nbLignes); i++)
			{
				int nbEspace = Math.abs(nbLignes) - i - 1;
				String ligne = "";
				for (int k=0; k<nbEspace;k++)
				{
					ligne = ligne + " ";
				}
				
				// j va nous permettre d'afficher autant de * que
				// le n° de la ligne
				for (int j=0; j <= i ; j++)
				{
					ligne += "*";
				}
				System.out.println(ligne);
			}

			
		}
		
	}

}
