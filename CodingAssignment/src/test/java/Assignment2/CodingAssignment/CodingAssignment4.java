package Assignment2.CodingAssignment;


import org.testng.annotations.Test;

public class CodingAssignment4 {
	
	@Test
	public void method1() {
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i=i+2;
		}
		/*i = 100;			//infinite loop
		while(i<150) {
			System.out.println(i+1);
			i = i - 1;
			
		}*/
	}
	
	@Test
	public void method2() {
		String[] strArry= {"A","B","C","D","E","F","G"};
		StringBuilder sb = new StringBuilder();
		for(String s : strArry) {
			System.out.print(s+" ");
		}
		System.out.println();
		for(int i=0; i<strArry.length; i++) {
			sb.append(strArry[i]+ " ");
		}
		sb.append("NOW I KNOW MY ABCs");
		System.out.println(sb.toString());

		StringBuilder sb1 = new StringBuilder();
		sb1.append("123456" + " ");
		sb1.append(sb);
		System.out.println(sb1.toString());
		
		sb1.delete(13, 20);
		System.out.println(sb1.toString());
		
		sb1.delete(0, 7);
		System.out.println(sb1.toString());

		
	}

}
