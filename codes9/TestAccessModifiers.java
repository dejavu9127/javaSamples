class Num
{
	private int pri=1;
	public int pub=2;
	protected int pro=3;
	int def=4;

	void disp()
	{	
		System.out.println(pri + " "+pro + " " + def + " " + pub);
	}
}
class Sub extends Num
{
	void show()
	{
		//pri + " "+
		System.out.println(pro + " " + def + " " + pub);
	}
}
class  TestAccessModifiers // non subclass
{
	public static void main(String[] args) 
	{
		Num obj=new Num();
		obj.disp();

		Sub obj2=new Sub();
		obj2.show();
		//obj.pri + " "+
		System.out.println(obj.pro + " " + obj.def + " " + obj.pub);
	}
}
