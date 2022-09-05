//Javier A. Colon Morales
//March 27, 2022
//COP 2805C Advanced Java
//Dr. Gossai

public class Palindrome {	
		
	public boolean palindromChecker(String... input) {
		boolean result = true;
		for(String i: input) {
			StringBuilder sb = new StringBuilder(i);
			sb.reverse();
			
			if(i.equals(sb.toString())) {
				result = true;
			}else
				result = false;
		}
		return result;
	}
}