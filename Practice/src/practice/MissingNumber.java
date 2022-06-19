package practice;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
	       int[] number = {6, 3, 2, 1, 8, 5};
	        Arrays.sort(number);
	        System.out.println("Missing Number is:" + getMissingNumber(number));
	    }

	    private static Integer getMissingNumber(int[] number) {
	        Integer missed = null;
	        for (int i = 0; i < number.length; i++) {
	            int index = i + 1;
	            if (number[i] != index) {
	                missed = index;
	                break;
	            }
	        }
	        return missed;
	    }
	}
