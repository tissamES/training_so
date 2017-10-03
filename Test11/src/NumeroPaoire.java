
public class NumeroPaoire {

	
	
	
	public static void  NumeroPaire ( Integer[] tableau)
	{
	
		
		for (int i=0; i < tableau.length;i++)
		{
			if (tableau[i] % 2 == 0)
			System.out.println(tableau[i]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] tab = {1,2,5};
		NumeroPaire(tab);
		
	}

}
