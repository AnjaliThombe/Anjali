package javaprogram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);//
			System.out.println("Enter the Number: ");
			int no=s.nextInt();
			int fact=1;
			
			for(int i=1; i<=no; i++)
			{
				fact=fact*i;
			}
			
			System.out.println("factorial of Number is:"+fact);
			
		
	}
	

	
//	Scanner s = new Scanner(System.in);
//	System.out.println("Enter the Number: ");
//	int no=s.nextInt();
//	int fact;
//	for(int i=1; i<=no; i++)
//	{
//		fact=fact*i;
//		}
//	System.out.println("Factorial of Number"+fact);
//}
//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
