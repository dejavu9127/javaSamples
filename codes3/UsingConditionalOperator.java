// conditional operator (?:)
// boolean expression ? stat1 : stat2
class  UsingConditionalOperator
{
	public static void main(String[] args) 
	{
		int a,b,max;
		a=100;
		b=50;
		max=a>b ? a : b;
		System.out.println("Max = "+max);


		int p,q,r;
		p=100;
		q=2000;
		r=30;
		max=p>q && p>r ? p : q>p && q>r ? q : r;
		System.out.println("Max = "+max);
	}
}
