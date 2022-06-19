package javaprogram;
public class ReverseString {

	public static void main(String[] args) {
		String s="Anjali";    
		System.out.println("Before reverse string is: "+s); 
		System.out.println("After reverse string is: ");  
		for(int i=s.length();i>0;--i)                 
		{  
		System.out.print(s.charAt(i-1));          
		}  
	}  
}  