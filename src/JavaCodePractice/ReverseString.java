package JavaCodePractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* Using StringBuilder*/

public class ReverseString {

	public static void main(String[] args) throws Exception {
		/*
		 * String str="Program to reverse a string"; 
		 * StringBuilder sb = new StringBuilder(str);
		 * 
		 * System.out.println(sb.reverse());
		 */

		String str1 = "This is my string";
		String revStr = "";
		for(int i=str1.length()-1;i>=0;i--) {
			revStr = revStr+str1.charAt(i);
		}
		System.out.println("RevStr = "+revStr);
				
	}

}
