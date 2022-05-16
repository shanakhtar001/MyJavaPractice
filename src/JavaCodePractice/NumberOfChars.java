package JavaCodePractice;

public class NumberOfChars {

	public static void main(String args[]) {
	
		String str="This is a test";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) !=' ')
				count++;
		}		
		System.out.println("Total number od characters :"+ count);
	}	
}
