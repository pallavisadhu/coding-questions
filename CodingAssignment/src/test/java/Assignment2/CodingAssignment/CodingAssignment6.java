package Assignment2.CodingAssignment;

import java.util.Scanner;

import org.testng.annotations.Test;

public class CodingAssignment6 {
	
	
	@Test
	public void isCahr() {
		System.out.println("Enter a character:");
		Scanner s = new Scanner(System.in);
		char c = s.next().charAt(0);
		if(Character.isAlphabetic(c)) {
			System.out.println("AN ALPHABET! I can read your mind");
		}else {
			System.out.println("A NUMBER! I can read your mind");
		}
		s.close();	
	}
	

}
