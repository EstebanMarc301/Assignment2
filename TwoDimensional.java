
public class TwoDimensional 
{
	public static void main(String[] args)
	{
		int[][] temp = genArray(5,5);
		locateMax(temp);
	}
	
	public static int[][] genArray(int length, int height)
	{
		int[][] array  = new int[length][height];
		return array;
	}
	
	public static void locateMax(int[][] temp)
	{
		int max = temp[0][0];
		int[] maxIndex;
		
		maxIndex = new int[2];
		maxIndex[0] = 0;
		maxIndex[0] = 0;
		
		for(int row=0; row<temp.length; row++)
		{
			for(int col=0; col<temp[row].length; col++)
			{
				int num = temp[row][col];
				
				if(num > max)
				{
					max = num;
					maxIndex[0] = row;
					maxIndex[1] = col;
				}
			}
		}
	System.out.println(max + maxIndex[0] + maxIndex[1]);
	}
}
