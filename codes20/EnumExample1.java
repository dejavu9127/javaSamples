//enum , user defined data type
//An enum type is a special data type that enables for a variable to be 
//a set of predefined constants.

class EnumExample1
{
	// package or class level
	 enum Season { WINTER, SPRING, SUMMER, FALL }

public static void main(String[] args)
{
	
	// local enum is not allowed	

	System.out.println("Enum members ");
	for (Season s : Season.values())//static values() method
	{
		System.out.println(s);
	}

	Season s=Season.SUMMER;
	System.out.println("Value is " + s);

}
}