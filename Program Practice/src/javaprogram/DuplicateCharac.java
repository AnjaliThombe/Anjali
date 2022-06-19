package javaprogram;

import java.util.Scanner;

public class DuplicateCharac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String repetitiveChar;
		char maxChar = ' ';
		int i, max = -1;
		int[] charFreq = new int[256];
		
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		repetitiveChar = sc.nextLine();
		
		for(i=0;i<repetitiveChar.length();i++) {
			charFreq[repetitiveChar.charAt(i)]++;
		}
		
		for(i=0;i<repetitiveChar.length();i++) {
			char ch = repetitiveChar.charAt(i);
		if(max < charFreq[ch]) {
			max = charFreq[ch];
			maxChar = ch;
		}
	}
 			System.out.println("The Repititive Character is: "+maxChar );
 			System.out.format("'%c' Character occurs %d Times ",maxChar,max);

	}
}
