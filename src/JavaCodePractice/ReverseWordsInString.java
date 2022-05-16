package JavaCodePractice;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String str="Reverse this word of this string";
		String [] words=str.split(" ");
		String revStr="";
		
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String revWord="";
			for(int j=word.length()-1;j>=0;j--) {
				revWord=revWord+word.charAt(j);
			}
			revStr=revStr+revWord+" ";
		}
		System.out.println("Reversed word : "+ revStr);
	}

}
