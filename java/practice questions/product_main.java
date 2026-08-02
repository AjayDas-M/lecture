import java.util.Scanner;

class product
{
	int prod_id;
	String name;
	double price;
	product(int prod_id, String name, double price)
	{
		this.prod_id = prod_id;
		this.name = name;
		this.price = price;
	}
	
	void display()
	{
		System.out.println("product id: "+prod_id);
		System.out.println("product name: "+name);
		System.out.println("product price: "+price);
		System.out.println("product price including 8% GST "+(price+((8.0/100.0)*price)));
		System.out.println("--------------------------------------------------------------------------------");
	}

}

class product_main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int ch;
		int p_count =0;
		product p[] = new product[10];
		do
		{
			System.out.println("1.add");
			System.out.println("2.display");
			System.out.println("3.search");
			System.out.println("4.exit");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("Enter the product id: ");
					int p_id = sc.nextInt();
					sc.nextLine();
					System.out.println("Enter the product name: ");
					String p_name = sc.nextLine();
					System.out.println("Enter the product price: ");
					double p_price = sc.nextInt();
					
					p[p_count] = new product(p_id,p_name,p_price);
					p_count++;
					break;
				case 2:
					for(int i=0;i<p_count;i++)
					{
						p[i].display();
						
					}
					break;
				case 3:
					System.out.println("Enter the product id to search:");
					int s_item = sc.nextInt();
					for(int i=0;i<p_count;i++)
					{
						if(p[i].prod_id == s_item)
							p[i].display();
					}
				case 4:
					break;
				default:System.out.println("Invalid option");
			}		
		}while(ch !=4);
		
	}
}