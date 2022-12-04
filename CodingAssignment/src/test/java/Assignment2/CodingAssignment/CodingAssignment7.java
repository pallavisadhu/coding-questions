package Assignment2.CodingAssignment;

import java.util.Scanner;

import org.testng.annotations.Test;

public class CodingAssignment7 {
	
	@Test
	public void findNumberOfDays() {
		System.out.println("Enter no.of days in a month:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Enter first day of the month:");
		String day = s.next();
		int res;
		if(n==30 || n==31) {
			res = n/7;
			System.out.println("No.of times " + day +" occurs in that month:" + (res + 1));
		}else {
			res = n/7;
			System.out.println("No.of times " + day +" occurs in that month:"+res);

		}
		
	}

}
