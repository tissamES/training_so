
public class Tabnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] tab1 = {4,6,5,7,9,1,8};
		Integer[] tab2 ={1,3,6,8};
		
		for (int i = 0; i < tab1.length; i++) {
						for (int j = 0; j < tab2.length; j++) {
							System.out.println("");
							int max = Math.max(tab1[i],tab2[j]);
							System.out.println(max); 
						}
						
							
							}

	}

}
