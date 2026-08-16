import java.util.Scanner;
class doctor
{
	int doc_id;
	String doc_name;
	String doc_special;
	int doc_cfee;
	
	doctor(int doc_id, String doc_name,String doc_special,int doc_cfee)
	{
		this.doc_id = doc_id;
		this.doc_name = doc_name;
		this.doc_special = doc_special;
		this.doc_cfee = doc_cfee;
		
	}
	
	void display()
	{
		System.out.println("doctor ID = "+doc_id);
		System.out.println("doctor name = "+doc_name);
		System.out.println("doctor's specialization = "+doc_special);
		System.out.println("doctor consulting fee = "+doc_cfee);
		System.out.println("doctor's salary = "+(20000+((5.0/100.0)*doc_cfee)));
	}
}

class doctor_main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int doc_id;
		String doc_name;
		String doc_special;
		int doc_cfee;
		System.out.print("enter the doctor ID : ");
		doc_id = sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter the doctor name : ");
		doc_name = sc.nextLine();
		
		System.out.print("enter the doctor specialization: ");
		doc_special = sc.nextLine();
		
		System.out.print("enter the doctor consulting fee : ");
		doc_cfee = sc.nextInt();
		
		doctor d = new doctor(doc_id, doc_name, doc_special, doc_cfee);
		d.display();
	}
}