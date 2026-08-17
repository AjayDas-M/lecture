/*Create a base class Staff containing attributes name, age, salary, and a method computePay(). 
Extend this class into two subclasses: Trainer (adding a specialization attribute) and Supervisor (adding a team-size attribute). 
Override computePay() across the subclasses to display specialized role details alongside base salary, and execute the program by invoking these methods.	*/

class staff
{
	String name;
	int age; 
	int salary;
	
	staff(String name,int age,int salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	void computepay()
	{
		System.out.println("Salary = "+salary);
	}
}

class trainer extends staff
{
	String special;
	
	trainer(String name,int age,int salary, String special)
	{
		super(name,age,salary);
		this.special = special;
	}
	void computepay()
	{
		System.out.println("name = "+name);
		System.out.println("specialization = "+special);
		System.out.println("Salary = "+salary);
	}
	
}

class supervisor extends staff
{
	int team_size;
	
	supervisor(String name,int age,int salary, int team_size)
	{
		super(name,age,salary);
		this.team_size = team_size;
	}
	
	void computepay()
	{
		System.out.println("name = "+name);
		System.out.println("Team size = "+team_size);
		System.out.println("Salary = "+salary);
	}
}

class staff_main
{
	public static void main(String[] args)
	{
		supervisor s = new supervisor("ajay",24,20000,5);
		s.computepay();
		
		trainer t = new trainer("ajay",24,20000,"teambuilding");
		t.computepay();
	}
}