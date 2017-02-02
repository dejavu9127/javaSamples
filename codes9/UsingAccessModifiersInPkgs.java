import acc.*;

class SubC extends Num1
{
	void show()
	{
		//pri + " "+ +def + " "
		System.out.println(pro + " " + pub);
	}
}
class  UsingAccessModifiersInPkgs // non subclass
{
	public static void main(String[] args) 
	{
		Num1 obj=new Num1();
			//obj.pri + " "+obj.pro + " " + obj.def + " " +
		System.out.println( obj.pub);

		SubC obj2=new SubC();
		obj2.show();
	}
}
