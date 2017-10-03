
import java.util.Scanner;
public class Factoriel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Nombre souhaité
				Integer nb = 5;
				
				// Tableau de nb entiers
				Integer[] tab = new Integer[nb];
				
				// Je parcours toutes les valeurs de 1 à nb
				for (int i=1; i <= nb; i++)
				{
					// Pour chaque valeur, je calcule le factoriel de la valeur en cours
					Integer fact = 1;
					for (int j=1; j <= i; j++)
					{
						fact = fact * j; // Ou fact *= j
					}
					tab[i-1] = fact;
				}
				
				for (int i=0; i < tab.length; i++)
				{
					System.out.println(tab[i]);
				}
	                         
	 
	 
	    }
	 
	
		

	}


