
public class Tableau3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] tab1 ={2,3};
		Integer[] tab2 ={1,2,4,5,6,7};
		


		Integer[] tab3 = new Integer [tab1.length*tab2.length];
		
		int compteur= 0;
		for (int i=0; i < tab1.length;i++) 
		
			
			for (int j = 0; j < tab2.length; j++) 
			{
				
				tab3[compteur++] = tab1[i]*tab2[j]; 
			}
			for(int i=0; i< compteur;i++) System.out.print(tab3[i]+" ");
			
		}





	}


