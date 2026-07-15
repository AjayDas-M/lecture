import java.util.Scanner;

class count
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println(word);
		
		int vowels=0,cons=0,num=0,sp=0;
		for(int i = 0;i < word.length(); i++)
		{
			char c = word.charAt(i);
			if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z')
			{
				if(c == 'a'	|| c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A'	|| c == 'E' || c == 'I' || c == 'O' || c == 'U')
				{
					vowels++;
				}
				else
				{
					cons++;
				}
			}
			else if(c >= '0' && c <= '9')
			{
				num++;
			}
			else
				sp++;
		}
		System.out.println("Number of vowels = "+ vowels);
		System.out.println("Number of Consonents = "+ cons);
		System.out.println("Number of numbers = "+ num);
		System.out.println("Number of special character = "+ sp);

	}
	
}