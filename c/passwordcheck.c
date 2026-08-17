#include<stdio.h>
int main()
{
	int pass=1234,user;
	printf("Enter the password: ");
	scanf("%d",&user);
	while(user != pass)
	{
		printf("Wrong password \n");
		printf("Reenter the password:");
		scanf("%d",&user);
	}
	printf("access open");
	return 0;
}
