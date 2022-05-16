package JavaCodePractice;

import java.util.ArrayList;

public class PrintMatchingNumbers {

	public static void main(String[] args) {
		
		int flag =0;
		
		ArrayList<Integer> al1= new ArrayList<Integer>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		al1.add(5);
		al1.add(6);
		
		ArrayList<Integer> al2= new ArrayList<Integer>();
		al2.add(2);
		al2.add(3);
		al2.add(4);
		al2.add(5);
		
				
		for(int i = 0; i<al1.size();i++) {
			for(int j=0;j<al2.size();j++) {
				
				if(al1.get(i) ==al2.get(j)) {
					flag=1;
					

				}
				if(flag==1) {
					System.out.println(al1.get(i));

				}
			}
			
		}

	}

}
