
public class Factoriel3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer nb = 5;
		Integer[] tab2 = new Integer[nb];

		// Je parcours toutes les valeurs de 1 à nb
		for (int i=1; i <= nb; i++)
		{
			if (i == 1) 
				tab2[i-1] = 1;
			else 
				tab2[i-1] = tab2[i-2] * i;
		}
		
		for (int i=0; i < tab2.length; i++)
		{
			System.out.println(tab2[i]);
		}

	}

}
