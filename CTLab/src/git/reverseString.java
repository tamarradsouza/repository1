package git;

public class reverseString {

	String reverse(String a) {
		
		String b = "";
		for(int i=a.length()-1;i>=0;i--) {
			b=a.charAt(i)+b;
		}
		return b;
	}
}
