package Assignment2.CodingAssignment;

import java.util.Scanner;

import org.testng.annotations.Test;

public class CodingAssignment3 {

	Scanner s = new Scanner(System.in);

	@Test
	public void printStatements() {
		System.out.println("Hello Programming");
		System.out.println("I don't like you");
		System.out.println("But I have to 'LEARN', I am ready");
	}

	@Test
	public void printNumber() {
		System.out.println("Enter a number:");
		int n = s.nextInt();
		System.out.println(n);
	}

	@Test
	public void printPrimeNumbers() {
		System.out.println("Enter starting number to find prime numbers:");
		int start = s.nextInt();
		System.out.println("Enter ending number to find prime numbers5:");
		int end = s.nextInt();

		for (int i = start; i <= end; i++) {
			int count = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println(i);
			}
		}

	}

	@Test
	public void findFactorial() {
		System.out.println("Enter a number to find the factorial:");
		int n = s.nextInt();
		int res = 1;
		if (n == 0) {
			res = 1;
		} else {
			for (int i = n; i >= 1; i--) {
				res = res * i;
			}

		}
		System.out.println("factorial is :" + res);
	}

}
