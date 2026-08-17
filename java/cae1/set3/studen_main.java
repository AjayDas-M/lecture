/* Create a Java program to manage student information. Define a helper class Student with parameters rollNo, name, and marks. 
Your main program should add multiple student objects, search for a student by their unique rollNo, and display the final list cleanly.	*/

import java.util.Scanner;
class student
{
	int rollno;
	String name;
	int mark;
	
	student(int rollno,String name, int mark)
	{
		this.rollno = rollno;
		this.name = name;
		this.mark = mark;
	}
	
	void display()
	{
		System.out.println("Student rollno= "+rollno);
		System.out.println("Student name= "+name);
		System.out.println("Student mark= "+mark);
		
	}
	
}

class student_main
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of students ");
		int n = sc.nextInt();
		student s[] = new student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter the rollno ");
			int rollno = sc.nextInt();
			System.out.println("enter the name ");
			String name = sc.nextLine();
			System.out.println("enter the mark ");
			int mark = sc.nextInt();
			
			s[i] = new student(rollno,name,mark);
		}
		
		System.out.println("Enter the roll no to search");
		int s_item = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(s[i].rollno == s_item)
			{
				s[i].display();
			}
		}
	}
}