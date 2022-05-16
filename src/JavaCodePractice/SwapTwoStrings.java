package JavaCodePractice;

public class SwapTwoStrings {

	public static void main(String[] args) {
		
		String str1="Test";
		String str2="Automation";
		
		str1=str1+str2;
		
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println("Str1 = "+ str1);
		System.out.println("Str2 = "+ str2);

	}

}
