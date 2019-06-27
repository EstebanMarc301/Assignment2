
public class Addition 
{
	public static void main(String[] args)
	{
		int result = 0;
		
		for(String input : args)
		{
			int num = Integer.parseInt(input);
			result += num;
		}
		
		System.out.println(result);
	}
}
