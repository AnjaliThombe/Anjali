package practice;
import java.util.Scanner;

public class Switch {
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
			int a = scan.nextInt();
			int b = scan.nextInt();

		System.out.println("Enter any number:");
		int button= scan.nextInt();
	
	switch(button)
	{
	/**case 1: System.out.println("Jan");
	break;
	case 2: System.out.println("Feb");
	break;
	case 3: System.out.println("March");
	break;
	case 4: System.out.println("April");
	break;
	case 5: System.out.println("May");
	break;
	case 6: System.out.println("June");
	break;
	case 7: System.out.println("July");
	break;
	case 8: System.out.println("Auguest");
	break;
	case 9: System.out.println("September");
	break;
	case 10: System.out.println("Octomber");
	break;
	case 11: System.out.println("November");
	break;
	case 12: System.out.println("December");
	break;**/

	case 1:
			System.out.println(a+b);
	break;
	
	default:System.out.println("invalid Button");
		}
	}
}


