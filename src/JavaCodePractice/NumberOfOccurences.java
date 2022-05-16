package JavaCodePractice;

public class NumberOfOccurences {

	public static void main(String[] args) {
		String sentence="This is a sentences sentences are a combination of is is is is multiple this words this we cannot imagine a world without sentences";
		String [] words=sentence.split(" ");
		int matchCount=0;
		for(int i=0;i<words.length;i++) {
			if(words[i].equalsIgnoreCase("sentences")) {
				matchCount++;
			}
		}
		
		System.out.println("Total count match is : "+matchCount);
			

	}

}
