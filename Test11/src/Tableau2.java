
public class Tableau2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] tab1 ={1,2,3};
		Integer[] tab2 = {2,3,5,6};
		
		int max = Math.max(tab1.length, tab2.length);
		Integer[] tab3 = new Integer[max];
		
		for (int i = 0; i < max; i++)
		{
			int maxVal = 0;
			if (i < tab1.length)
			{
				maxVal = tab1[i];
			}
			if (i < tab2.length)
			{
				if (maxVal < tab2[i])
				{
					maxVal = tab2[i];
				}
			}
			tab3[i] = maxVal;
		}
		for (int i=0; i < max;i++)
			System.out.print(tab3[i] + " ");
	}

}
