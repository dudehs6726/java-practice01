package practice01;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		int start = 0;
		
		System.out.print("문자열을 입력하세요. : ");
		String str = scanner.nextLine();
		
		for(int i = 1; i <= str.length(); i++)
		{
			System.out.println(str.substring(start, i));
		}
		
		scanner.close();
	}

}
