import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Integer a = 5;
		System.out.print("a vaut ");
		System.out.println(a);

		// concatenation
		System.out.println("a vaut " + a );

		String nom = "SAM";
		String prenom = "SAM";
		System.out.println("je m'appel"+ nom + " " + prenom );
		// Adition
		Integer somme = a+a;
		System.out.println(" addition "+ somme);
		// Soustraction
		Integer soustraction = a-a;
		// multiplication
		Integer multiplication =a*a;
		// division
		Double b=5.2;
		Double division= b/b;
		System.out.println("soustraction"+ soustraction);
		System.out.println("multiplication"+ multiplication);
		System.out.println("division"+ division); 
		System.out.println("bonjour"!= "bonsoir");
		Integer[] ageEnfants = new Integer[3];
		ageEnfants[0] = 12;
		ageEnfants[1] = 6;
		ageEnfants[2] = 7; 
		System.out.println(ageEnfants[2]);
		Integer compteur =0;
		System.out.println("avant");
		while (compteur <3)
		{
			System.out.println("compteur"+ compteur);
			compteur = compteur+1;
			//compteur -=2; 
		System.out.println("apres");

		} 
		Integer[] note = new Integer[4];
		note [0]= 12;
		note [1]= 13;
		note [2]= 14;
		note [3]= 15;


		for (int i=0;i<note.length;i++)
			{
				if (note[i] % 2 ==0)	
				{
						System.out.printLn(note[i] + "est une note paire");
				}		
			}
			System.out.printLn(12%2);
			String str ="tets";
			String lettreA = "a";

			// subString(0,1) recupere 1 caractere a partir de la position 0
			String x = myownName.subtring(1,2);
			System.outprintLn(x);
			System.out.printLn(str.cahrtAt(0));
			System.out.printLn(str.lenght());
			System.out.printLn(lettreA.equqls("a"));

			  String x = myownName.substring(1,2);
		 */
/*
		
		Integer a = new Scanner(System.in).nextInt();;
		String nom = "";

		if ( a >= 0) 

		{
			nom = "*****";


			for (int i=0;i<nom.length();i++)
			{
				String lettre = nom.substring(0,i+1);
				System.out.println(lettre);


			}
		}

		
		else{
			nom = "     ";

			for (int i=1;i<=nom.length();i++)
			{
				String lettre = nom.substring(0,nom.length()-i);
				System.out.print(lettre);
				for (int j=0; j<i; j++)
					System.out.print("*");
				System.out.println("");

			}
		} 
			*/
			//System.out.println(compteur);
			
			//System.out.println(nom.chartAt(0));
			//System.out.printLn(nom.equals("f")); 
			
			
	
		System.out.println("Enter a number:");
		Integer a = new Scanner(System.in).nextInt();
		char tmp_char = 'x', space = ' ', star='*';
		Integer tmpa=1;
		if (a < 0)
		{
			tmp_char = space;
			space = star;
			star = tmp_char;
			a = Math.abs(a);
		}
			

		for (int i=0; i<a;i++)
		{
			for (int j=0;j<tmpa;j++)
			{
				System.out.print(star);
			}


			for (int j=0;j<a-tmpa;j++)
			{
				System.out.print(space);
			}
			tmpa++;
			System.out.println("");
		}

		/*Integer a = 5;
		Integer tmpa=1;
		for (int i=0; i<a;i++)
		{
			for (int j=0;j<tmpa;j++)
			{
				System.out.print(" ");
			}
			tmpa++;
			System.out.println("*");
		}
		*/
	  
		
			
			    
			    
			    
			
		/*
		
	
		// Distributeur billet 
		
		Integer solde = 1000;
		Integer essaie = 0;
		boolean Codevalide =false;
		
		do{ 
			Scanner sc = new Scanner(System.in);
			System.out.println("veuillez saisir le code pin :");
			Integer pin = sc.nextInt(); 
			//System.out.println("Vous avez saisi le code pin : " + pin);
			
			
			if  (pin == 1234)
			{
				Codevalide = true;
				break;
			}
				
			else
			{
				Codevalide = false;
				essaie = essaie + 1;
				System.out.println("Code errone :");
			}
							
			
		}while (essaie < 3 && Codevalide == false);	
		
		if (Codevalide == false)
			{
				System.out.println(" veuillez recuperer votre carte");
			
			}
		else
		{	
			Scanner mo = new Scanner(System.in);
			System.out.println("veuillez saisir un montant :");

				Integer montant = mo.nextInt();
				System.out.println("Le montant saisie est :"+ montant);	
				if (montant > solde)
					System.out.println(" Solde insuffisant. veuillez recuperer votre carte");
				else
				{
					System.out.println("voulez-vous un ticket?");
					Scanner tck = new Scanner(System.in);
					Integer ticket = tck.nextInt();
					System.out.println(""+ ticket);	
					if (ticket == 1)
						System.out.println("veuillez recuperer votre tikcet votre carte et votre argent");
					else
						System.out.println("veuillez recuperer votre carte et votre argent");
				}	
		} */
	}
}
		
		
		
	
		
	


