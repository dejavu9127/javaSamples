// Dynamic method dispatch
class Animal
{
	void eat()
	{
		System.out.println("eat() from Animal ");
	}
}
class Cat extends Animal
{
	void eat() //overriding
	{
		System.out.println("eat() from Cat ");
	}
}
class Dog extends Animal
{
	void eat() //overriding
	{
		System.out.println("eat() from Dog ");
	}
}
class  DynMethodDispatch
{
	public static void main(String[] args) 
	{
		Animal []arr={new Animal() , new Cat() , new Dog()};

		for(Animal r : arr)
		{
			r.eat();
		}
	}
}
