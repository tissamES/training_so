import java.util.Scanner;

public class DAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
	}

	}
}
