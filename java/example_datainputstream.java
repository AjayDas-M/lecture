import java.io.*;

class example_datainputstream
{
	public static void main(String[] args) throws Exception
	{
		DataInputStream dis = new DataInputStream(System.in);
		System.out.print("Enter Your name: ");
		String name = dis.readLine();
		
		System.out.print("Enter your age: ");
		int age = Integer.parseInt(dis.readLine());
		
		System.out.println("Hi " + name + " your age is " + age);
	}
}