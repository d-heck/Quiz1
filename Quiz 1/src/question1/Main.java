package question1;

import java.util.Scanner;

// David Heck
//
// I was not 100% sure how to use other methods i.e. taking the data from one method and implementing it in another. 
// On Piazza you said it would be okay if we used only a main method only for quiz one, so that is what I will do.

public class Main {
	public static void main(String [] args)
	{
		double TD;
		double YARDS;
		double INT;
		double COMP;
		double ATT;
		
		double a;
		double b;
		double c;
		double d;
		
		double PR;
		
		//Collect Data
		
		Scanner in = new Scanner(System.in);
			
		System.out.println("How many touchdowns has the QB collected?: ");
		TD = in.nextInt();
			
		System.out.println("How many total yards has the QB collected?: ");
		YARDS = in.nextFloat();
			
		System.out.println("How many interceptions has the QB collected?: ");
		INT = in.nextInt();
			
		System.out.println("How many completions has the QB collected?: ");
		COMP = in.nextInt();
			
		System.out.println("How many pass attempts has the QB collected?: ");
		ATT = in.nextInt();
			
		in.close();
		
		//Calculate QB rating
		
		a = ((COMP / ATT) - .3) * 5;
		b = ((YARDS / ATT) - 3) * .25;
		c = (TD / ATT) * 20;
		d = (2.375 - ((INT / ATT) * 25));
		
		PR = ((a + b + c + d) / 6) * 100;
		
		//Print QB rating
		
		System.out.println("The passer rating is: " + PR);
		
	}
}
