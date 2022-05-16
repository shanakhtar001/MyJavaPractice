package JavaCodePractice;

public class PalindromString {

	public static void main(String[] args) {
		
		String str = "level";
		String str1="";
		
		for(int i =str.length()-1; i>=0;i--) {
			str1= str1+str.charAt(i);
		}
		
		if(str1.equalsIgnoreCase(str)) {
			System.out.println("Palindrom");
		}else {
			System.out.println("Not a palindrom");
		}
	}

}
