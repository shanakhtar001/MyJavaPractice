package JavaCodePractice;

public class PrintDuplicateCharacters {

	public static void main(String[] args) {
		
		String str="print duplidate characters";
		String str1=str.replaceAll("\\s+", "");
		
		char ch[] = str1.toCharArray();
		int count;
		
		for(int i=0;i<str1.length();i++) {
			count =1;
			for(int j=i+1;j<str1.length();j++) {
				if(ch[i] == ch[j]) {
					count++;
					ch[j]=0;
				}
			}
			if(count>1) {
				System.out.println(ch[i]);
			}
		}

	}

}
