class Arr2d 
{
	public static void main(String[] args) 
	{
		int [][]mat={{11,22},{33,44,55,66,77,88},{55,66}};
		/*for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{

				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}*/

		for(int []arr : mat)
		{
			for(int k : arr)
			{
				System.out.print(k+ "\t");
			}
			System.out.println();
		}
	}
}
