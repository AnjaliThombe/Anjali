package practice;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args)   
	{   
	
	int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};  
	Arrays.sort(array);  //sort() method of the Arrays class 
	System.out.println("Elements of array sorted in ascending order: ");  
	for (int i = 0; i < array.length; i++) //prints array using the for loop  
	{       
	System.out.println(array[i]);   
	}   
	}  


}
