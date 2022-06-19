package javaprogram;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//			Scanner s= new Scanner(System.in);        //take input
//			System.out.println("Enter the Number: "); //take input
//			int no=s.nextInt();
//			int temp=no;
//			int rev=0,rem;
//		
//			while(temp!=0)
//			{
//				rem=temp%10;
//				rev=rev*10+rem;
//				temp=temp/10;
//				
//			}
//			if(no==rev)
//			{
//				System.out.println(no+"is pallindrome ");
//			}
//			else
//			{
//				System.out.println(no+"is not pallindrome ");
//
//			}
//	}
//
//}

Scanner s =  new Scanner(System.in);
System.out.println("Enter the number: ");
int no=s.nextInt();
int temp=no;
int rev=0,rem;

while(temp !=0)
{
	rem=temp%10;
	rev=rev*10+rem;
	temp=temp/10;
}
if(no==rev)
{
	System.out.println(no+"is pallindrome");
}
else
{
	System.out.println(no+"is not pallindrome");

}
	}
	
}













