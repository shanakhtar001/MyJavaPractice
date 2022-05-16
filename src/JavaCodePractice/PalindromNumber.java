package JavaCodePractice;

public class PalindromNumber {

	public static void main(String[] args) {
		
		int number = 454;
		int r, sum=0, temp;
		
		temp = number;
		
		while(number>0) {
			r=number%10;
			sum = (sum*10)+r;
			number = number/10;
			
		}
		if(temp == sum) {
			System.out.println("Palindrom Number");
		}else {
			System.out.println("Not a palindrom number");
		}
		
	}

}
