package JavaCodePractice;

public class TestReverse {

	public static void main(String[] args) {
		String name="This is Ahshan, this is shan, he is salman";
		String[] rev=name.split(",");
		char[] ch=new char[rev.length];
		ch=name.toCharArray();
		//for(int j=0;j<=rev.length;j++) {
			
			for(int i=rev.length-1;i>=0;i--) {
				if(ch[i]==',') {
					System.out.print(ch[i]);
				}
				System.out.print(rev[i]+" ");
				}		
		//}
	}
}
