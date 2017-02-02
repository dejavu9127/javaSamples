// call by value
class  CallByValue
{
	static void modify(int k) // formal param , dummy
	{
		k=0;
	}
	public static void main(String[] args) 
	{
		int k=100; //local
		System.out.println(k);
		modify(k); // actual param
		System.out.println(k);
	}
}
