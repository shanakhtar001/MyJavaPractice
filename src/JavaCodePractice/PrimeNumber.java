package JavaCodePractice;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int number =111;
		int count=0;
		
		for(int i =2;i<=number/2;i++) {
			if(number%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(number+" is a prime number");
		}else {
			System.out.println(number+" is Not a prime number");
		}
		
	}

}
