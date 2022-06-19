package javaprogram;
public class DiamandPattern {
public static void main(String[] args) {
				int rows=5;
		        System.out.println("Printing the pattern");
		        for (int i = 1; i <= rows; i++)
		        {
		            for (int j = 1; j < i; j++)
		            {
		                System.out.print(" ");
		            }
		            for (int k = i; k <= rows; k++)
		            {
		                System.out.print("* ");
		            }
		            System.out.println();
		       }
		        	for (int i = rows-1; i >= 1; i--)
		        {
		            for (int j = 1; j < i; j++)
		            {
		                System.out.print(" ");
		            }
		            for (int k = i; k <= rows; k++)
		            {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
		    }
		}
