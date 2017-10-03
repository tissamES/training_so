
public class Tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] tabZero = new Integer[10];
		for (int i=0; i < tabZero.length;i++)
		{
			
			tabZero[i] = 0;
		}
		for (int i=0; i < tabZero.length;i++)
		{
		//System.out.print(tabZero[i]);
		}
		Integer [] tab1 = {1,2,3,4,5};
		Integer [] tab2 = {5,4,3,2,1};
		Integer [] tab3 =new Integer [5];
		for (int i=0; i < tab1.length;i++)
		{ tab3 [i] =  tab1[i]*tab2[i]	;		
		}
		for (int i=0; i < tab1.length;i++)
		{
			System.out.print(tab3[i]);
		}
		
		
		
		
		}

}
