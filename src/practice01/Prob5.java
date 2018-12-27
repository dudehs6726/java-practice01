package practice01;

public class Prob5 {

	public static void main(String[] args) {
		
		int max = 99;
		int count = 0;
		String st;
		
		for(int i = 1; i <= max; i++)
		{
			st = Integer.toString(i);
			
			for(int i_po = 0; i_po < st.length(); i_po++)
			{
				String position = st.substring(i_po, i_po+1);
				
				switch (position) 
				{
					case "3":
					case "6":
					case "9":
						count++;
						break;
				}
			}
			
			for(int j = 0; j < count; j++)
			{
				if(j == 0)
				{
					System.out.print(st + " ");
				}
				
				System.out.print("짝");
			}
			
			if(count > 0)
			{
				System.out.println("");
				count = 0;
			}
		}
	}
}
