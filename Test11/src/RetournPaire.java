
public class RetournPaire {

	
	
	
	public static void  NumeroPaire ( Integer[] tableau, Integer[] tab_pair)
	{
		Integer tab_pair_lth = 0;	
		//Integer[] tabPair = new Integer [tableau.length];
		for (int i=0; i < tableau.length;i++)
		{
			if (tableau[i] % 2 == 0)
			{			
				tab_pair[tab_pair_lth]=tableau[i];
				tab_pair_lth++;
			}
		}
		for (int i=0; i < tab_pair_lth;i++)
		{
			System.out.print(tab_pair[i]+" ");
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] tab = {1,2,5,4};
		Integer[] tab_p = new Integer [tab.length];
		NumeroPaire(tab,tab_p);
		for (int i=0; i < tab.length;i++)
		{
			System.out.print(tab_p[i]+" ");
		}
		
	}

}
