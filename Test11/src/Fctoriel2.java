
public class Fctoriel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,n,a;
		 n=3;
	     a=n;
	     Integer[] Factoriel = new Integer[n];
		
		
        
                if (n!=0)
                {for (i=1;i<a;i++)
                     n=n*i;
                	 Factoriel [i-1]=n;
                	 System.out.println(Factoriel[i-1]);
            
                }
                else
                n=1;
                System.out.println(n);
               

		
	}

}
