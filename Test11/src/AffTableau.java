
public class AffTableau {

	
	public static Integer somme ( Integer a, Integer b)
		{
		Integer somme = a+b;
		return somme;
		}

	public static Integer doublage ( Integer nombre) 
	
	{
		Integer doublai = nombre*2;
		return doublai;
	}
	
	
	public static Double division ( Integer a, Integer b) 
	{
		Double adouble= a.doubleValue();
		Double bdouble= b.doubleValue();
		return adouble/bdouble;
	}
	
	
	public static Integer[] Doublertableau (Integer[] tableau)
	{
	
		
		for (int i=0; i < tableau.length;i++)
		{
			tableau[i] = tableau[i]*2;
		}
		return tableau;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
			
			
			
				int calcul = somme(2,3);
				System.out.println(doublage(2));
				System.out.println(doublage(0));
				System.out.println(doublage(-1));
				Integer[] tab = {1,3,5};
				//affichetableau(tab);
				System.out.println("");
				//Integer[] tab2 = doublage(tab);
				//afficheTableau(tab2);
				//afficheTableau(doublageTableau(doublageTableau(tab2)))
				
				
			
	}

}
