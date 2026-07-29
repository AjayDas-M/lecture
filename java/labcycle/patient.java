import java.util.Scanner;
class patients
{
	int patient_id;
	String name;
	int age;
	String  deseise;
	String doctor;
	
	patients(int patient_id)
	{
		this.patient_id = 
	}
}

class patient
{
	public static void main(String[] args)
	{
		int ch,p_count=0;
		Scanner sc = new Scanner(System.in);
		patients p[] = new patients[10];
		do
		{
			System.out.println("1.add patient");
			System.out.println("2.display");
			System.out.println("3.search");
			System.out.println("4. exit");
			System.out.print("enter you choice:");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1: p[p_count] = new patients(patient_id);
			}
			
		}while(ch!=4);
		
	}
}
