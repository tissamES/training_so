
public class Correction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a = 5;
		//System.out.print("a vaut ");
		//System.out.println(a);
		
		// Concaténation 
		System.out.println("a vaut " + a);
		
		String nom = "SPORTELLI";
		String prenom  = "Felix";
		
		System.out.println("je m'appelle " + nom + " " + prenom);
		
		// Addition
		Integer somme = a+a;
		System.out.println("addition" + somme);
		
		// Soutraction, Multiplication, Division
		Integer soustraction=a-a;
		Integer multiplication=a*a;
		Double b=5.2;
		Double division=b/b;
		/*
		 * commentaire 
		 * 
		 * multi 
		 * 
		 * lignes
		 * 
		 */
		System.out.println("soustraction" + soustraction);
		System.out.println("multiplication"+multiplication);
		System.out.println("division"+division);
		
		// Opérations sur booléens
		Boolean bool1 = true;
		Boolean bool2 = false;
		
		System.out.println(bool1 & bool2);
		System.out.println(bool1 | bool2);
		System.out.println(a < b);
		System.out.println(a > b);
		System.out.println(a >= b);
		
		System.out.println("bonjour" != "hello");
		System.out.println("bonjour" == "hello");
		
		Integer[] ageEnfants = new Integer[3];
		ageEnfants[0] = 12;
		ageEnfants[1] = 6;
		ageEnfants[2] = 7;
		
		System.out.println(ageEnfants[2]);
		
		if (ageEnfants[0] > 10)
		{
			System.out.println("ADO");
			
			
			
		}
		else if (ageEnfants[0] == 10)
		{
			System.out.println("PRESQUADO");
		}
		else
		{
			System.out.println("ENFANT");
		}
		
		Integer compteur = 0;
		System.out.println("avant");
		while (compteur < 3)
		{
			System.out.println("compteur=" + compteur);
			compteur = compteur+1;
		}
		
		compteur = 4;
		do
		{
			System.out.println("compteur=" + compteur);
			compteur++; // compteur = compteur+1;
/*			compteur--; // compteur = compteur-1;
			compteur-=2; // compteur = compteur-2;
*/
		} while (compteur < 3);
		
		for(int i=0; i < 3;i++)
		{
			System.out.println("age enfant " + i + " = " 
					+ ageEnfants[i]);
		}
		System.out.println("apres");	
		
		Integer[] notes = new Integer[10];
		notes[0]=15;
		notes[1]=14;
		notes[2]=16;
		notes[3]=15;
		notes[4]=14;
		notes[5]=17;
		notes[6]=10;
		notes[7]=9;
		notes[8]=5;
		notes[9]=20;
		for (int i=0; i<notes.length ;i++)
		{
			if (notes[i] % 2 == 0)
			{
				System.out.println(notes[i] + " est une note paire");
			}
		}
		System.out.println(12%2);	
		
		String myOwnName = "test";
		String lettreA = "a";
		
		// subString(0,1) récupère 1 caractère à partir de la position 0
		String x = myOwnName.substring(1, 2);
		
		System.out.println(x);
		System.out.println(myOwnName.charAt(0));
		System.out.println(myOwnName.length());
		System.out.println(lettreA.equals("z"));
	
		// METHODE 1 
		String monTexte = "bonjour";
		Integer compteurVoyelle = 0;
		
		for (int i=0; i < monTexte.length();i++)
		{
			String lettre = monTexte.substring(i, i+1).toLowerCase();
			if (lettre.equals("a"))
				compteurVoyelle++;
			else if (lettre.equals("e"))
				compteurVoyelle++;
			else if (lettre.equals("i"))
				compteurVoyelle++;
			else if (lettre.equals("o"))
				compteurVoyelle++;
			else if (lettre.equals("u"))
				compteurVoyelle++;
			else if (lettre.equals("y"))
				compteurVoyelle++;
			
			if (lettre.equals("a") || lettre.equals("e") || lettre.equals("o"))
				compteurVoyelle++;
			
		}
		System.out.println(compteurVoyelle);
		
		// METHODE 2 : 
		String monTexte2 = "bonjour";
		Integer compteurVoyelle2 = 0;
		String[] voyelles = {"a","e","i","o","u","y"};
		
		// Je parcours le texte "bonjour"
		for (int i=0; i < monTexte2.length();i++)
		{
			// Je stocke dans lettre2 la lettre trouvée dans bonjour
			String lettre2 = monTexte2.substring(i, i+1);
			
			// Pour chaque voyelle de mon tableau
			// voyelles, je vais comparer la voyelle trouvée
			// avec la lettre trouvée dans bonjour (lettre2)
			for (int j=0; j<voyelles.length;j++)
			{
				if (lettre2.equals(voyelles[j]))
					compteurVoyelle2++;				
			}
		}
		System.out.println(compteurVoyelle2);
		
		
	}

}
