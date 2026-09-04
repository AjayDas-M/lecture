//Use a switch to check if the entered character is a vowel or not.
#include<stdio.h>
int main()
{
	char ch;
	printf("Enter the letter :");
	scanf("%c",&ch);
	switch(ch)
	{
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			printf("Vowel");
			break;
		default:
			printf("Consonent");
			break;
		
	}
	return 0;
}
