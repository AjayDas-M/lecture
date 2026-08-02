class multiply implements Runnable
{
	int n;
	multiply(int n)
	{
		this.n = n;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"* "+n+" = "+(i*n));
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class multiply_main
{
	public static void main(String[] args)
	{
		multiply m1 = new multiply(5);
		multiply m2 = new multiply(10);
		
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.start();
		t2.start();
	}
}