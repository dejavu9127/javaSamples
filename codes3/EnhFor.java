// enhanced for loop
class  EnhFor
{
	public static void main(String[] args) 
	{
		int []arr={10,20,30,40};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		//for(declaration of a new iteration var : array name)
		
		for(int k : arr)
		{
			System.out.println(k);
		}

		String []str = {"abc","xyz","pqr"};
		for(String k : str)
		{
			System.out.println(k);
		}

	}
}
