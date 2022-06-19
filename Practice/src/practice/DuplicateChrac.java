package practice;

import java.util.Arrays;


public class DuplicateChrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  array1= {2,5,4,3,1};
		int[]  array2= {50,20,40,0,30};
		int aLen = array1.length;
		int bLen=array2.length;
	    int [] result = new int[aLen + bLen];
		 
	    System.arraycopy(array1, 0, result, 0,aLen);
	    System.arraycopy(array2, 0, result, aLen,bLen);
	    System.out.println(Arrays.toString(result));
	}
}
