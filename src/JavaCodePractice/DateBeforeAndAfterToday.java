package JavaCodePractice;

import java.time.LocalDate;

public class DateBeforeAndAfterToday {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now(); 
	     System.out.println("\nCurrent Date: "+today);
	     System.out.println("10 days before today was "+today.plusDays(-10));
	     System.out.println("10 days after today will be "+today.plusDays(10)+"\n");

	}

}
