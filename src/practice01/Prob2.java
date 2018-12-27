package practice01;

public class Prob2 {
	public static void main(String[] args) {
		
		for(int i = 0; i <= 9; i++)
		{
			for(int j = 0; j <= 9; j++)
			{
				int num = i + j;
				System.out.print(num);
				
				if(j < 9)
				{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
