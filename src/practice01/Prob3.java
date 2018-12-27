package practice01;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		int num = 0;
		boolean bl = true;
		
		while(bl)
		{
			System.out.print("수를 입력하세오 : ");
			
			num = scanner.nextInt();
			
			int remainder = num % 2;
			int i = 0;
			int ham = 0;
			
			if(remainder == 1)
			{
				i = 1;
			}
			else
			{
				i = 2;
			}
			
			while(i <= num)
			{
				ham += i;
				i += 2;
			}
			
			System.out.println("결과 값 : " + ham);
			System.out.println("");
			
			bl = scanner.hasNextLine();
		}
		
		scanner.close();
	}
}
