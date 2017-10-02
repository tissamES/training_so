import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
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
		
	}

}
