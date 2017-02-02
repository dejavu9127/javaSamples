import java.util.*;

class MatrixTranspose 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Order of a matrix  : ");
		int r=sc.nextInt();
		int c=sc.nextInt();

		int [][]mat=new int [r][c];
		int [][]t=new int[c][r];

		System.out.println("Enter matrix : ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("matrix is : ");
		for(int []arr : mat)
		{
			for(int k : arr)
			{
				System.out.print(k+ "\t");
			}
			System.out.println();
		}


		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				t[j][i]=mat[i][j];
			}
		}

		System.out.println("matrix transpose is : ");
		for(int []arr : t)
		{
			for(int k : arr)
			{
				System.out.print(k+ "\t");
			}
			System.out.println();
		}
		
	}
}
