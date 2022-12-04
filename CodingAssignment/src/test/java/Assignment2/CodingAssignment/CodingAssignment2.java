package Assignment2.CodingAssignment;

import java.util.Scanner;

import org.testng.annotations.Test;

public class CodingAssignment2 {
	
	@Test
	public void printNumbers() {
	
		for(int i=-15; i<=10; i++) {
			System.out.println(i);

		}
		
	}
	
	@Test
	public void printMultiplicationTable() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = s.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(n + "x" + i + "=" + (n*i));
		}
		s.close();
	}
	

}
