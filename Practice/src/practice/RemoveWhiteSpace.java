package practice;
public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "My Name Is Anjali May I Know What's Your Good Name";
//	      str = str.replaceAll(" ", "");
//	      System.out.println(str);
	      
	      String s[] = "Reverse the Sentence Word By Word".split(" "); 
	      String rev = ""; 
	      for (int i = s.length - 1; i >= 0; i--) { 
	        rev += s[i] + " "; 
	      } 
	      System.out.println("Reversed String: " + rev); 
		}
	}
