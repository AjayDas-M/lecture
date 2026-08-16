class even implements Runnable
{
	public void run()
	{	
		for(int i = 2 ; i<=50; i+=2)
		{
			System.out.println("Even = " + i);
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

class odd implements Runnable
{
	public void run()
	{
		for(int i = 1 ; i<=50; i+=2)
		{
			System.out.println("odd = " + i);
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

class oddeventhread
{
	public static void main(String[] args)
	{
		even e = new even();
		odd o = new odd();
		
		Thread t1 = new Thread(e);
		Thread t2 = new Thread(o);
		t1.start();
		t2.start();
	}
}