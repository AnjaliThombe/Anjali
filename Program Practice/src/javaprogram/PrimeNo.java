package javaprogram;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no=s.nextInt();
		int temp=0;
		
		for(int i=2; i<=no-1; i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
		}
			if(temp==0)
			{
			System.out.println(no+"is Prime");
			} 
		else
			 {
				 System.out.println(no+"is not Prime");
			 }
	}


}

