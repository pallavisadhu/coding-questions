package Assignment2.CodingAssignment;

import java.util.Random;
import java.util.Scanner;

import org.testng.annotations.Test;

public class CodingAssignment5 {
	
public int generateRandomNumber() {
	Random r = new Random();
	int min=1;
	int max=10;
	int res = r.nextInt(max-min) + min; 
	return res;
}

@Test
public void method1() {
	System.out.println("Enter a number:");
	Scanner s = new Scanner(System.in);
	int userno = s.nextInt();
	int randomno = generateRandomNumber();
	System.out.println(randomno);
	if(userno<randomno) {
		System.out.println("Low");
	}else if(userno>randomno) {
		System.out.println("High");
	}else {
		System.out.println("Right Guess");
	}
	s.close();
}
}


//SQL Query

/*1: Write a SQL query that will return the maximum value from the "Numbers" column, 
 * without using a SQL aggregate like MAX or MIN.
Numbers
30
70
-8
90*/

//select Top 1 Numbers from table
//order by Numbers DESC
//