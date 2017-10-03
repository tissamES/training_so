
public class Reacp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String message = "bonjour ici felix";
		
		// Compteur de mots
		int compteur = 1;
		for (int i=0; i < message.length();i++)
		{
			if (message.substring(i, i+1).equals(" "))
				compteur++;
		}
		System.out.println(compteur+ " mots");
		
		// Extracteur de voyelles
		String[] tabVoyelles = new String[message.length()];
		Integer compteurVoyelle=0;
		for (int i=0; i < message.length();i++)
		{
			if ((message.substring(i, i+1).equals("a") 
					|| message.substring(i, i+1).equals("e") 
					|| message.substring(i, i+1).equals("i") 
					|| message.substring(i, i+1).equals("o") 
					|| message.substring(i, i+1).equals("u")))
			{
				tabVoyelles[compteurVoyelle] = message.substring(i,i+1);
				compteurVoyelle++;
			}
		}
		System.out.print(compteurVoyelle+ " voyelles :");
		for (int i=0;i<compteurVoyelle;i++) System.out.print(tabVoyelles[i]+ " ");
		System.out.println("");
		
		// Inverseur
		String[] tabInverse = new String[message.length()];
		for (int i=0; i < message.length();i++)
		{
			int index = message.length()-i -1 ;
			tabInverse[i] = message.substring(index,index+1);
		}
		for (int i=0;i<message.length();i++) System.out.print(tabInverse[i]);

		

}
}