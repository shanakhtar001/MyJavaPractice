package JavaCodePractice;

import java.util.HashSet;
import java.util.TreeSet;

public class PrintIdenticalCharacter {

	public static void main(String[] args) {
		
		String str = "aaabcbaacbabccc";
		//print abc
		
		char [] ch=str.toCharArray();
		HashSet<Character> set = new HashSet<Character>();
		
		
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
		}
		System.out.println(set);
	}
}
