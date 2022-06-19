package practice;

public class ReverseString {
public static void main(String[] arg) {
	
	//declare variable
	
	String strinput="Anjali";
	
	//convert string to character Array				
													
	char[] resultarray=strinput.toCharArray();		
	
	//iteration
	
	for(int i=resultarray.length-1;i>=0;i--)
		
		//print reserve string
		System.out.println(resultarray[i]);		
	
}

}

