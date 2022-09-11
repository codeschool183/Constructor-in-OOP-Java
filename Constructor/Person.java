package Constructor;
/*
 * 
 */
public class Person 
{
	private String name;
	private int age;
	// Non-Argument/Parameterized constructor 
	public Person()
	{
		name = "Ali";
		age = 20;
	}
    //Parameterized constructor 	
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
   

}
