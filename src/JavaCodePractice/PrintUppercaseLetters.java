package JavaCodePractice;

public class PrintUppercaseLetters {

	public static void main(String[] args) {
		String str="Check 2234 If Characters are In Uppercase12";
		int countUpper=0;
		int countLower=0;
		int countDigit=0;
		int countWhiteSpace=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				countUpper++;				
			} else if(Character.isWhitespace(str.charAt(i))) {
				countWhiteSpace++;				
			} else if(Character.isDigit(str.charAt(i))) {
				countDigit++;
			}
			else {
				countLower++;
			}
		}
		
		System.out.println("Count of upper case letters in given string: "+countUpper);
		System.out.println("Count of lower case letters in given string: "+countLower);
		System.out.println("Count of Digits in given string: "+countDigit);
		System.out.println("Count of white spaces in given string: "+countWhiteSpace);
	}

}
