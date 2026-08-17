/*Write a Java program using DataInputStream to read an integer N from the user. 
Implement a loop to check multiple numbers entered by the user and determine whether
 each is even or odd, terminating the loop immediately when the user inputs 0*/
import java.io.*;
class checkeven
{
	public static void main(String[] args)
	{
		try{
			
			DataInputStream dis = new DataInputStream(System.in);
			
			int n = Integer.parseInt(dis.readLine());
			do
			{
				if(n%2==0)
					System.out.println("even");
				else
					System.out.println("odd");
				n = Integer.parseInt(dis.readLine());
			}while(n!=0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}